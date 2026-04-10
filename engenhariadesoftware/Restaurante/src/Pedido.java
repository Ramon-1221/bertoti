import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Prato> pratos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public double calcularTotal() {
        double total = 0;
        for (Prato p : pratos) {
            total += p.getPreco();
        }
        return total;
    }

    public void mostrarPedido() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("Pratos:");
        for (Prato p : pratos) {
            System.out.println("- " + p.getNome() + " | R$ " + p.getPreco());
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}