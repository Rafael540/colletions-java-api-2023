package list.OperacoesBasicas;

public class Item{

    private String nome;
    private Double preco;
    private int quantidade;

    public Item(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public Double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }   

    public String toString(){
        return nome;
    }

    public Double toDouble(){
        return preco;
    }

    public int toInt(){
        return quantidade;
    }

}