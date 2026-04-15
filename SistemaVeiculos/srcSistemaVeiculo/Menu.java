import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);

    public void iniciar (List<Veiculo> veiculos) {

        int opcao;


        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Listar veículos");
            System.out.println("2 - Alugar veículo");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();

            try {
                switch (opcao) {

                    case 1:
                        listarVeiculos(veiculos);
                        break;

                    case 2:
                        alugarVeiculo(veiculos);
                        break;

                    case 0:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");

                }

            } catch (IllegalArgumentException ex) {
                System.out.println("Erro: " + ex.getMessage());
            }


        } while (opcao != 0);


    }
    private void alugarVeiculo(List<Veiculo> veiculos) {

        listarVeiculos(veiculos);

        System.out.print("Escolha o veículo: ");
        int escolha = sc.nextInt();

        Veiculo v = null;

        for (Veiculo veiculo : veiculos) {
            if (veiculo.getId() == escolha) {
                v = veiculo;
                break;
            }
        }

        if (v == null) {
            throw new IllegalArgumentException("Veículo não encontrado!");
        }

        System.out.print("Dias: ");
        int dias = sc.nextInt();

        System.out.print("Peso da carga: ");
        double peso = sc.nextDouble();

        double valor = v.alugarVeiculo(peso, dias);
        System.out.println("====Veículo escolhido!====");
        System.out.println("Marca: " + v.getMarca());
        System.out.println("Placa: " + v.getPlaca());
        System.out.println("Tipo: " + v.getClass().getSimpleName());
        System.out.println("Valor aluguel: " + valor);
        System.out.println("IPVA: " + v.calcularIPVA());
    }

    private void listarVeiculos(List<Veiculo> veiculos) {
        System.out.println("ID " + "   Placa" + "   Marca" + "     Data Fab." + "    Fipe");
        for (int i = 0; i < veiculos.size(); i++) {

            Veiculo v = veiculos.get(i);

            System.out.println(
                    +v.getId() + " - "
                    + v.getPlaca() + " | "
                    + v.getMarca() + " | "
                    + v.getAnoFabricacao() + " | "
                    + v.getPrecoFipe() + " | "
                    + v.getClass().getSimpleName());
        }
    }
}