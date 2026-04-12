package E_commerce;

public class ItemPedido {
    private String nomeProduto;
    private Double preco;
    private Integer quantidade;

    public ItemPedido(String nomeProduto, Double preco, Integer quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Double calcularSubtotal(){
        return preco * quantidade;
    }

    public String getNomePedido() {
        return nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }



}
