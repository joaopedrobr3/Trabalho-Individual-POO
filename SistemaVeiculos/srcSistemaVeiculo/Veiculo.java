import Interfaces.Fretavel;
import Interfaces.Tributavel;

import java.time.LocalDate;

public abstract sealed class Veiculo implements Tributavel, Fretavel permits Caminhao, CarroPasseio {
    public static int contador = 1;
    private int id;
    private final String placa;
    private final String marca;
    private double valorLocacaoDiaria;
    public final LocalDate anoFabricacao;
    private double precoFipe;


    public Veiculo(int id,String placa, String marca, double valorLocacaoDiaria, LocalDate anoFabricacao, double precoFipe){

        if (placa == null || placa.isBlank())
            throw new IllegalArgumentException("Placa inválida");

        if (marca == null || marca.isBlank())
            throw new IllegalArgumentException("Marca inválida");

        if (valorLocacaoDiaria <= 0)
            throw new IllegalArgumentException("Valor da diária inválido");

        if (precoFipe <= 0)
            throw new IllegalArgumentException("Preço FIPE inválido");

        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
        this.id = contador++;
    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getValorLocacaoDiaria() {
        return valorLocacaoDiaria;
    }

    public void setValorLocacaoDiaria(double valorLocacaoDiaria) {
        this.valorLocacaoDiaria = valorLocacaoDiaria;
    }

    public double getPrecoFipe() {
        return precoFipe;
    }

    public void setPrecoFipe(double precoFipe) {
        this.precoFipe = precoFipe;
    }
    public int getIdadeVeiculo() {
        return LocalDate.now().getYear() - anoFabricacao.getYear();
    }

    public int getId() {
        return id;
    }
}
