import java.util.Scanner;
public class ContaBancaria{
    private int numero;
    private String titular ;
    private double saldo = 50;
    private int contadorSaques = 0;

    public ContaBancaria (int numero, String titular){
        this.numero = numero;
        this.titular = titular;
    }

    public static ContaBancaria criarConta(){
        Scanner leia = new Scanner(System.in);

        System.out.println("Olá! Bem vindo!");
        System.out.println("Digite o número da conta: ");
        int numero = leia.nextInt();

        while(numero <= 0){
            System.out.println("Número invalido!\nDigite um número válido: ");
            numero = leia.nextInt();
        }
        leia.nextLine();

        System.out.println("Digite o nome do titular da conta: ");
        String titular = leia.nextLine();

        while(titular == null || titular.isEmpty()){
            System.out.println("O nome do titular não pode ficar vazio\nDigite um nome de titular válido:");
            titular = leia.nextLine();
        }
        return new ContaBancaria(numero, titular);
    }

    public void menu(){
        int opcao;
        double valor;

        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("Conta de " + titular);
            System.out.println("MENU");
            System.out.println("1 - Ver Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("0 - Sair");
            opcao = leia.nextInt();

            switch(opcao){

                case 1:
                    System.out.println("Seu saldo é de :R$ " + getSaldo());
                    break;

                case 2:
                    System.out.println("Quanto você deseja depositar: ");
                    valor = leia.nextDouble();
                    depositar(valor);
                    break;

                case 3:
                    System.out.println("Quanto você deseja sacar: ");
                    valor = leia.nextDouble();
                    sacar(valor);
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

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Você realizou um deposito no valor de: R$" + valor);
        }
        else{
            System.out.println("Valor Inválido!");
        }

    }

    public void sacar(double valor){
        if(valor > 1000){
            System.out.println("Valor de saque acima do limite!");
        }
        else if(valor <= 0){
            System.out.println("Valor Inválido!");
        }
        else if(valor > this.getSaldo()){
            System.out.println("Saldo Insuficiente!");
        }
        else if(this.contadorSaques >= 3){
            System.out.println("Limite de saques diários atingido!");
        }
        else{
            saldo -= valor;
            this.contadorSaques++;
            System.out.println("Você realizou um saque no valor de: R$" + valor);
        }

    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public int getContadorSaques(){
        return contadorSaques;
    }
}

