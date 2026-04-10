
public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Ramon", "12943243242");

        Prato prato1 = new Prato("Hamburguer", 25.0);
        Prato prato2 = new Prato("Refrigerante", 8.0);

        Pedido pedido = new Pedido(cliente);
        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);

        pedido.mostrarPedido();
    }
}