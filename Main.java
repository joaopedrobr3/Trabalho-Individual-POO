import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner leia = new Scanner(System.in);

        double valor;
        int opcao;

        System.out.println("Digite o número da sua conta:");
        int numero = leia.nextInt();


        System.out.println("Digite o nome do titular:");
        String titular =leia.next();

        ContaBancaria conta = new ContaBancaria(numero , titular);

        do {
            System.out.println("MENU");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            opcao = leia.nextInt();

            switch(opcao){

                case 1:
                    conta.mostrarSaldo();
                    break;

                case 2:
                    System.out.println("Quanto você deseja depositar: ");
                    valor = leia.nextDouble();
                    conta.depositar(valor);
                    break;

                case 3:
                    System.out.println("Quanto você deseja sacar: ");
                    valor = leia.nextDouble();
                    conta.sacar(valor);
                    break;

                case 0:
                    System.out.println("Finalizando Atendimento...");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }
        }while(opcao != 0);
    }
}
