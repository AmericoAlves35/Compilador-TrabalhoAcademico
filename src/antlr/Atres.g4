grammar Atres;

@header{
	package antlr;
	import java.util.*;
	import java.util.Scanner;
}

@members{
    Scanner teclado = new Scanner(System.in);
	NovasVariaveis novaV = new NovasVariaveis();
    ValidacaoVariavel validV = new ValidacaoVariavel();
    String codigoJava = "";
    int escopo, tipo;
    String id, variavelSalva;
}

comeco: {
    escopo = 0;
    codigoJava += "import java.util.*;\nimport java.util.Scanner;\npublic class Atres{\n";
    } 'iniciar' AC {
    escopo = 1;
    codigoJava += "public static void main(String args[]){\nScanner teclado = new Scanner(System.in);\n";
    } (bloco)+ FC 'finalizar' {
    codigoJava += "}\n}";
    System.out.println(codigoJava);
    };

tipo: INT_TIPO {
    tipo = 0;
    codigoJava += "int ";
    } | DEC_TIPO {
    tipo = 1;
    codigoJava += "double ";
    } | STR_TIPO {
    tipo = 2;
    codigoJava += "String ";
    };

declararpv: declarar PV {codigoJava += ";\n";};

declarar: tipo ID {
    NovasVariaveis nVar = new NovasVariaveis($ID.text, tipo, escopo);
    boolean declarado = validV.adiciona(nVar);
    if(!declarado){
        System.err.println("Variavel '"+$ID.text+"' ID de variavel esta em uso");
        System.exit(0);
    }
    codigoJava += $ID.text;
    };

atribuirpv: atribuir PV {codigoJava += ";\n";};

atribuir: ID {	boolean declarado = validV.jaExiste($ID.text);
                variavelSalva = $ID.text;
             	if(!declarado){
             	    System.err.println("A variavel '"+$ID.text+"' não foi declarada");
             		System.exit(0);
             	}
                codigoJava += variavelSalva;
             }
             OP_ATRIBUICAO
             {
                codigoJava += " = ";
             }
             (
             ID
             {  if(validV.busca($ID.text).getTipo() != validV.busca(variavelSalva).getTipo()){
                    System.err.println("A variavel '" + variavelSalva + "' e '" + $ID.text + "' sao de tipos divergentes!");
                    System.exit(0);
                }
                codigoJava += $ID.text;
             }
             |
             INT
             {  if(validV.busca(variavelSalva).getTipo() != 0){
                    System.err.println("A variavel '" + variavelSalva + "' nao e do tipo inteiro!");
                    System.exit(0);
                 }
                 codigoJava += $INT.text;
             }
             |
             DECIMAL
             {  if(validV.busca(variavelSalva).getTipo() != 1){
                    System.err.println("A variavel '" + variavelSalva + "' nao e do tipo decimal!");
                    System.exit(0);
                }
                codigoJava += $DECIMAL.text;
             }
             |
             STRING
             {  if(validV.busca(variavelSalva).getTipo() != 2){
                    System.err.println("A variavel '" + variavelSalva + "' nao e do tipo texto!");
                    System.exit(0);
                }
                codigoJava += $STRING.text;
             }
             |
             pegar
             {  if(validV.busca(variavelSalva).getTipo() != tipo){
                    System.err.println("o valor nao correponde ao tipo da variavel '" + variavelSalva + "'");
                    System.exit(0);
                 }
             }
             |
             exprmath
             )
             ;

pegarpv: pegar PV {codigoJava += ";\n";};

pegar: 'pegar' AP
        (STRING { codigoJava += "teclado.next()";
                  tipo = 2;
                }
        |
        INT {   codigoJava += "teclado.nextInt()";
                tipo = 0;
            }
        |
        DECIMAL { codigoJava += "teclado.nextFloat()";
                  tipo = 1;
                }
        |
        ID { boolean declarado = validV.jaExiste($ID.text);
             variavelSalva = $ID.text;
             if(!declarado){
                System.err.println("A variavel '" + $ID.text + "' não foi declarada");
                System.exit(0);
             }
             else if(validV.busca($ID.text).getTipo() == 0){
                tipo = 0;
                codigoJava += "teclado.nextInt()";
             }else if(validV.busca($ID.text).getTipo() == 1){
                tipo = 1;
                codigoJava += "teclado.nextFloat()";
             }else{
                tipo = 2;
                codigoJava += "teclado.next()";
             }

           }

        ) FP
        ;

mostrar: 'mostrar' AP
         {
            codigoJava += "System.out.println(";
         }
         textovariavel FP PV {
            codigoJava += ");\n";
         }
         ;

comp: (exprcomp) PV {codigoJava += ";\n";};

exprcomp: compstr | adcsub ('==' {codigoJava += "==";} adcsub | '!=' {codigoJava += "!=";} adcsub | '>' {codigoJava += ">";} adcsub | '<' {codigoJava += "<";} adcsub | '>=' {codigoJava += ">=";} adcsub | '<=' {codigoJava += "<=";} adcsub )*;

compstr: (ID {
boolean declarado = validV.jaExiste($ID.text);
variavelSalva = $ID.text;
if(!declarado){
    System.err.println("A variavel '" + $ID.text + "' não foi declarada");
    System.exit(0);
} codigoJava += $ID.text + ".equals("; } | STRING {codigoJava += $STRING.text + ".equals("; }) '==' (ID {
boolean declarado = validV.jaExiste($ID.text);
if(!declarado){
    System.err.println("A variavel '" + $ID.text + "' não foi declarada");
    System.exit(0);
} else if(validV.busca(variavelSalva).getTipo() != validV.busca($ID.text).getTipo()){
    System.err.println("A variavel '" + variavelSalva + "' ou '" + $ID.text + "' nao e tipo do texto!");
    System.exit(0);
} codigoJava += $ID.text + ")"; } | STRING {codigoJava += $STRING.text + ")";} | pegar);

expr: exprmath PV {codigoJava += ";\n";};

exprmath: adcsub | textovariavel;

adcsub: multdiv ('+' {codigoJava += "+";} multdiv | '-' {codigoJava += "-";} multdiv)*;

multdiv: num ( '*' {codigoJava += "*";} num | '/' {codigoJava += "/";} num)*;

num: INT {codigoJava += $INT.text;} | DECIMAL {codigoJava += $DECIMAL.text;} | ID {
    boolean declarado = validV.jaExiste($ID.text);
    variavelSalva = $ID.text;
    if(!declarado){
        System.err.println("A variavel "+$ID.text+" não foi declarada");
        System.exit(0);
    }else if(validV.busca($ID.text).getTipo() == 2){
        System.err.println("Nao e possivel realizar essa operacao");
        System.exit(0);
    }
    codigoJava += $ID.text;
    }
| '(' exprmath ')';

cmd: (exprcomp | exprmath);

textovariavel: STRING{ codigoJava += $STRING.text;} | ID{
boolean declarado = validV.jaExiste($ID.text);
if(!declarado){
    System.err.println("A variavel " + $ID.text + " não foi declarada");
    System.exit(0);
}
codigoJava += $ID.text;
} | pegar | textovariavel {codigoJava += " + ";} '+'  textovariavel;

cond: 'se' AP
	{
		codigoJava += "if(";
	}
	cmd FP
	{
		codigoJava += ")";
	}
	 AC
	{
		codigoJava+= "{\n";
	}
	bloco FC
	{
		codigoJava += "}\n";
	}
	('else ' AC
	{
		codigoJava+= "else{\n";
	}
	bloco FC
	{
		codigoJava+= "}\n";
	}
	)?
	;


paracada: 'paracada' AP {codigoJava += "for(";} atribuir V {codigoJava+= ";";} cmd V {codigoJava+= ";";} atribuir FP {codigoJava+= ")";} AC
    {codigoJava += "{\n";} bloco FC {codigoJava += "}\n";};

enquanto: 'enquanto' AP
    {
        codigoJava += "while (";
    }
    cmd FP
    {
        codigoJava += "){\n";
    }
    AC
    bloco FC
    {
        codigoJava += "}\n";
    };


bloco: (expr | comp | declararpv | atribuirpv | cond | enquanto | paracada | mostrar | pegarpv)+;

INT_TIPO: 'inteiro';
DEC_TIPO: 'decimal';
STR_TIPO: 'texto';
ID: [a-zA-Z_]+ [a-zA-Z_0-9]*;
STRING: '"' .*? '"';
INT: ([0-9])+;
DECIMAL : [0-9]+'.'[0-9]+;
OP_RELACIONAL: '<' | '<=' | '>' | '>=' | '==' | '!=';
OP_ATRIBUICAO: '=';
WS: [ \t\r\n]+ -> skip;
PV: ';';
AC: '{' ;
FC: '}' ;
AP: '(' ;
FP: ')' ;
V: ',';