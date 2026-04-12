package E_commerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;


    public Pedido(Cliente cliente, List<ItemPedido> itens) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }
    public void adicionarItem(ItemPedido item){
        itens.add(item);
    }
    public Double calcularTotal(){
        Double total = 0.0;

        for(ItemPedido item : itens){
            total += item.calcularSubtotal();
        }
        return total;
    }
    public Double calcularFrete(){
        if(total > 250){
            return 0.0;
        }
        else{
            return 25.0;
        }
    }


}
