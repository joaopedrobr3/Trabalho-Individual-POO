package E_commerce;

public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente (1, "João Pedro", "151.865.247-60");
        Pedido p1 = new Pedido(1 , c1);
        p1.adicionarItem(new ItemPedido("Mouse Gamer",200.00, 1));
        p1.adicionarItem(new ItemPedido("Teclado Gamer",300.00, 1));
        p1.adicionarItem(new ItemPedido("Monitor",2000.00, 1));
        p1.fecharPedido();

        Cliente c2 = new Cliente (2, "Izabella", "687.364.230-70");
        Pedido p2 = new Pedido(2 , c2);
        p2.adicionarItem(new ItemPedido("Batom",80.00, 2));
        p2.adicionarItem(new ItemPedido("Vestido",300.00, 1));
        p2.adicionarItem(new ItemPedido("Pulseira",400.00, 1));
        p2.fecharPedido();
    }
}
