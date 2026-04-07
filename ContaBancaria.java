import java.util.Scanner;
public class ContaBancaria{
    private int numero;
    private String titular ;
    private double saldo = 50;
    private int contadorSaques = 0;

    public static ContaBancaria validacao(){
        Scanner leia = new Scanner(System.in);

        ContaBancaria validacao = new ContaBancaria();

        System.out.println("Olá!");
        System.out.println("Digite o número da conta que deseja acessar: ");
        int numero = leia.nextInt();

        while(numero <= 0){
            System.out.println("Número invalido!\nDigite um número válido: ");
            numero = leia.nextInt();
        }
        leia.nextLine();

        System.out.println("Digite o nome do titular da conta que deseja acessar: ");
        String titular = leia.nextLine();

        while(titular == null || titular.isEmpty()){
            System.out.println("O nome do titular não pode ficar vazio\nDigite um nome de titular válido:");
            titular = leia.nextLine();
        }
        return validacao;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo = saldo + valor;
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
            System.out.println("Limites de saques diários atingido!");
        }
        else{
            saldo = saldo - valor;
            this.contadorSaques++;
            System.out.println("Você realizou um saque no valor de: R$" + valor);
        }

    }

    public int getNumero(){
        return numero;
    }
    public void setNumero(int n){
        this.numero = n;
    }

    public String getTitular(){
        return titular;
    }
    public void setTitular(String t){
        this.titular = t;
    }

    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double s){
        this.saldo = s;
    }

    public int getcontadorSaques(){
        return contadorSaques;
    }




}

