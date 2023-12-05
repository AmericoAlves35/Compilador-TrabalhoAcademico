package antlr;

import java.util.ArrayList;
import java.util.Scanner;
public class ValidacaoVariavel {

    Scanner scanner = new Scanner(System.in);
    private ArrayList<NovasVariaveis> contvar;

    public ValidacaoVariavel() {
        contvar = new ArrayList<NovasVariaveis>();
    }



    public boolean adiciona(NovasVariaveis v){
        for(int i=0; i<contvar.size(); i++){
            if( (contvar.get(i).getNome().equals(v.getNome())) && (contvar.get(i).getEscopo() == v.getEscopo()) )
                return false;
        }
        contvar.add(v);
        return true;
    }

    public NovasVariaveis busca(String nome){
        for(int i=contvar.size()-1; i>=0; i--){
            if(contvar.get(i).getNome().equals(nome))
                return contvar.get(i);
        }
        return null;
    }

    public boolean jaExiste(String nome){
        for(int i=contvar.size()-1; i>=0; i--){
            if(contvar.get(i).getNome().equals(nome))
                return true;
        }
        return false;
    }

    public void print(){
        for(int i=0; i<contvar.size(); i++){
            contvar.get(i).imprime();
            System.out.println("\n\n");
        }

    }
}
