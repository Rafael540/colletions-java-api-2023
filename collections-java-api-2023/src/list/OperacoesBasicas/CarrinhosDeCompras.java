package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhosDeCompras {
    

    private List<Item> itemlist;

    public CarrinhosDeCompras(){
        this.itemlist = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco,quantidade);
        this.itemlist.add(item);
    }

    public void removerItem(String nome){
        List<Item> itemsParaRemover = new ArrayList<>();
        for(!itemlist.isEmpty()){
            for (Item i : itemlist){
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemlist.removeAll(itemsParaRemover);
            }else {    System.out.println("A listá está vazia!");
                 }
        }

        
    }
   public double calcularValorTotal(double preco) {
        return itemlist.size() * preco;
   }

   public void exibirItens(){
    System.out.println(itemlist);
   }
public static void main(String[] args) {
   
    CarrinhosDeCompras adicionarItem = new CarrinhosDeCompras();
   
    CarrinhosDeCompras.adicionarItem("Lápis", 2d, 3);

}
}

