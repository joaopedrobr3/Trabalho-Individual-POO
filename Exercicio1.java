import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args){
        Scanner leia = new Scanner(System.in);
        double saldo = 6000;
        double deposito;
        double saque;
        int opcao;
        int contadorSaques = 0;

        do {
            System.out.println("MENU");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            opcao = leia.nextInt();

            switch(opcao){

                case 1:
                    System.out.println("Seu saldo é de:" + saldo);
                    break;

                case 2:
                    System.out.println("Quanto você deseja depositar? ");
                    deposito = leia.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Você realizou um deposito no valor de: R$" + deposito);
                    break;

                case 3:
                    System.out.println("Quanto você deseja sacar? ");
                    saque = leia.nextDouble();

                    if (saque > 1000){
                        System.out.println("Valor de saque acima do limite!");
                    }
                    else if(saque < 0){
                        System.out.println("Valor inválido!");
                    }
                    else if(saldo < saque){
                        System.out.println("Saldo Insuficiente!");
                    }
                    else if(contadorSaques < 3){
                        contadorSaques++;
                        saldo = saldo - saque;
                        System.out.println("Você realizou um saque no valor de: R$" + saque);
                        System.out.println("Deseja mais alguma coisa?");
                    }
                    else{
                        System.out.println("Limites de saques diários atingido!");
                    }
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
