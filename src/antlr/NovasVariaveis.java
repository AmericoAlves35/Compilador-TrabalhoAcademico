package antlr;

public class NovasVariaveis {
    private String nome;
    private int tipo;
    private int escopo;

    public NovasVariaveis(String nome, int tipo, int escopo) {
        this.nome = nome;
        this.tipo = tipo;
        this.escopo = escopo;
    }

    public NovasVariaveis() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEscopo() {
        return escopo;
    }

    public void setEscopo(int escopo) {
        this.escopo = escopo;
    }

    public void imprime(){
        System.out.println("Nome: "+nome+"\nTipo: "+tipo+"\nEscopo: "+escopo);
    }
}
