Teoria da Computação e Compiladores
DESENVOLVIMENTO DE COMPILADOR
PROF. FERNANDO KAKUGAWA

Enunciado:
Cada grupo deve definir a sua própria gramática e todos os tokens necessários. Os
requisitos mínimos são:
 Deve ter 3 tipos de variáveis, sendo que as variáveis;
 Deve ter a estrutura de controle if ... else;
 Deve ter duas estruturas de repetição (while , do ... while , for );
 A parte de expressões envolvendo os operadores matemáticos deve ser realizada
de maneira correta, respeitando a precedência. Não é necessário gerar a resposta
da expressão, basta cuidar da precedência entre os operadores matemáticos
através da gramática;
 As atribuições também devem ser realizadas;
o É necessário verificar se é possível realizar as operações, devido aos tipos das
variáveis e ao seu escopo.
 Os comandos de leitura do teclado (scanf) e de impressão na tela (printf) devem
ser disponibilizados.
 O compilador tem que aceitar números decimais.
 A cada utilização de uma variável, é necessário verificar se ela já foi declarada.
O compilador deve fazer a conversão de um programa desenvolvido na Linguagem
definida pelo grupo para a Linguagem Java.
A verificação da corretude do programa será realizada compilando o arquivo gerado
pelo compilador desenvolvido.
Seu compilador deverá receber como entrada um arquivo contendo um programa escrito
na Linguagem definida pelo grupo e gerar uma forma equivalente em Java, que deverá
ser compilada no compilador javac, executada na JVM e não deverá conter erros.
OBS: a gramática não pode conter recursividade à esquerda e produções vazias (que
porventura venham a surgir). Caso seja necessário, efetue sua fatoração à esquerda.
Exemplo de um Compilador
A descrição a seguir ilustra um exemplo de um Compilador que faz a conversão de um
programa desenvolvido em uma linguagem fictícia para uma forma equivalente na
linguagem C.
Os termos em negrito significam palavras reservadas. Preste muita atenção aos sinais de
pontuação.
Prog  programa Declara Bloco fimprog.
Declara  (inteiro | decimal) Id (, Id)* .
Bloco  (Cmd )+
Cmd  CmdLeitura | CmdEscrita | CmdExpr | CmdIf
CmdLeitura  leia ‘(‘ Id ‘)’.
CmdEscrita  escreva ’(‘ Texto | Id ‘)’.
CmdIf  if ‘(‘ Expr Op_rel Expr ‘)’ ‘{‘ Cmd+ ‘}’ (else ‘{‘ Cmd+ ‘}’ )?
CmdExpr  Id ‘:’’=’ Expr .
Op_rel  ‘<’ | ‘>’ | ‘<’’=’ | ‘>’’=’ | ‘!’’=’ | ‘=’’=’
Expr  Expr ‘+’ Termo | Expr ‘-‘ Termo | Termo
Termo  Termo ‘*’ Fator | Termo ‘/’ Fator | Fator
Fator  Num | Id | ‘(‘ Expr ‘)’
Texto  ’ “ ’(0..9 | a..z | A..Z | ‘ ‘ )+ ’ ” ’
Num  (0..9)+
Id  (a..z | A..Z) (a..z | A..Z | 0..9)*
OBS: espaços em branco, tabs e enter podem aparecer e devem ser eliminados.


Alunos 8° semestre Paulista I Ciência da Computação (noturno):
125111361572 - Alan Morais Coutinho
125111352073 - Amanda Rodrigues Velloso Santana
125111376128 - Américo Alves dos Santos
125111356728 - Giovani Silva Santos
125111343786 - Gustavo Santos Nascimento

Descrição:
Arquivo com o codigo fonte se encontra no diretório 'src\antlr' o nome do arquivo .g4 e 'Atres';
No diretório 'src\testes' encontra-se o arquivo .txt denominado 'teste3', o mesmo ja possui um tete de todos os pontos requisitados no trabalho A3, mais um exemplo da gramatica aplicada a nossa linguagem;

para executar e compilar nossa liguagem basta usar os seguintes comandos respectivamente:
//no seu cmd altere o diretorio para onde o projeto esta salvo usando o comando 'cd' caso use Windows;
- cd diretorio_raiz\A3_antlr\src\antlr
//após esse passo vamos gerar os arquivos necessários do ANTLR com o seguinte comando;
- antlr4 Atres.g4
//assim que todos os arquivos ANTLR forem gerados basta compilar em java;
- javac *.java
//em seguida para gerar a arvore em java e verificar a procedencia dos testes sera necessario voltar um diretorio;
- cd ..
//para gerar a arvore em java e executar o arquivo para gerar o resultado final basta ultilizar o seguinte comando;
- grun antlr.Atres comeco testes\teste3.txt -gui

OBS.: para criar ou modificar os testes, recomendamos que altere ou crie dentro da pasta testes no diretorio 'src\testes';
