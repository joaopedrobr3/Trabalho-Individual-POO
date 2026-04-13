package E_commerce;

public class ItemPedido {
    private String nomeProduto;
    private Double preco;
    private Integer quantidade;


    public ItemPedido() {
    }

    public ItemPedido(String nomeProduto, Double preco, Integer quantidade) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public Double calcularSubtotal(){
        return preco * quantidade;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }


    @Override
    public String toString() {
        return String.format( "\nProduto: " + getNomeProduto()
                            + "\nQuantidade: " + getQuantidade()
                            + "\nPreco Unitário: R$ " + getPreco()
                            + "\nSubtotal: R$" + calcularSubtotal())
                            + "\n" +
                                 "\n=======================\n";


    }
}
