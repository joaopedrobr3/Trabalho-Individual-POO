package E_commerce;

public class ItemPedido {
    private String nomePedido;
    private Double preco;
    private Integer quantidade;

    public ItemPedido(String nomePedido, Double preco, Integer quantidade) {
        this.nomePedido = nomePedido;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNomePedido() {
        return nomePedido;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}
