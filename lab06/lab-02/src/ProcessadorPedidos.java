import java.util.*;
import java.util.stream.Collectors;

public class ProcessadorPedidos {
    public static void main(String[] args) {
        List<Pedido> pedidos = Arrays.asList(
                new Pedido("Alice", Arrays.asList(
                        new Item("Notebook", 2500),
                        new Item("Mouse", 150)), true),
                new Pedido("Bruno", Arrays.asList(
                        new Item("Monitor", 800),
                        new Item("Teclado", 200)), false),
                new Pedido("Carla", Arrays.asList(
                        new Item("Smartphone", 1800)), true),
                new Pedido("Daniel", Arrays.asList(
                        new Item("Cadeira Gamer", 950),
                        new Item("Headset", 300)), true),
                new Pedido("Eva", Arrays.asList(
                        new Item("Tablet", 1200)), true)
        );

        List<Pedido> pagos = pedidos.stream()
                .filter(Pedido::isPago)
                .collect(Collectors.toList());

        List<Double> totaisComDesconto = pagos.stream()
                .map(p -> {
                    double total = p.calcularTotal();
                    return total > 1000 ? total * 0.9 : total;
                })
                .collect(Collectors.toList());

        List<String> clientesAcima1500 = pagos.stream()
                .filter(p -> {
                    double total = p.calcularTotal();
                    double comDesconto = total > 1000 ? total * 0.9 : total;
                    return comDesconto > 1500;
                })
                .map(Pedido::getCliente)
                .collect(Collectors.toList());

        System.out.println("Pedidos pagos:");
        pagos.forEach(p -> System.out.println("- " + p.getCliente()));

        System.out.println("\nTotais com desconto:");
        totaisComDesconto.forEach(v -> System.out.println("R$ " + v));

        System.out.println("\nClientes com pedidos acima de R$1500 após desconto:");
        clientesAcima1500.forEach(System.out::println);
    }
}
