package E_commerce;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer id;
    private Cliente cliente;
    private List<ItemPedido> itens;


    public Pedido(Integer id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.itens = new ArrayList<>() ;

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

    public Double calcularFrete() {
        if (calcularTotal() >= 250) {
            return 0.0;
        } else {
            return 25.0;
        }
    }

    public void fecharPedido(){
            double total = calcularTotal();
            double frete = calcularFrete();
            double totalFinal = total + frete;



            System.out.println("==================");
            System.out.println(" Recibo do pedido Número: " + getId());
            System.out.println("\nCliente: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("==================\n");
              for (ItemPedido item : itens) {  //
               System.out.println(item);
             }
            System.out.println("\nTotal: R$" + calcularTotal());
            if(frete == 0){
                System.out.println("Frete: Grátis!\n");
            }
            else{
                System.out.println("Frete: R$" + calcularFrete());
            }


       }


    public Integer getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

}
