

class ContaBancaria{
    private int numero;
    private String titular ;
    private double saldo = 50;
    private int contadorSaques = 0;


    public int getNumero(){
        return numero;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }

    public ContaBancaria(int numero, String titular){
        this.numero = numero;
        this.titular = titular;
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
        else if(valor > saldo){
            System.out.println("Saldo Insuficiente!");
        }
        else if(contadorSaques >= 3){
            System.out.println("Limites de saques diários atingido!");
        }
        else{
            saldo = saldo - valor;
            contadorSaques++;
            System.out.println("Você realizou um saque no valor de: R$" + valor);
        }


    }

    }


