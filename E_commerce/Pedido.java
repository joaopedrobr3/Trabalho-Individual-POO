package E_commerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<ItemPedido> itens;
    private Double valorTotal = 0.0;

    public Pedido(Cliente cliente, List<ItemPedido> itens, Double valorTotal) {
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.valorTotal = valorTotal;
    }
    public void adicionarProduto(ItemPedido pedido, Integer quantidade){
        ItemPedido item = new ItemPedido(pedido, quantidade);
        itens.add(item);
        valorTotal += item.getPreco();

    }
}
