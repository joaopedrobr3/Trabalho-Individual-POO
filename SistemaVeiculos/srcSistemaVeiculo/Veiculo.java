import java.time.LocalDate;

public abstract sealed class Veiculo implements Tributavel, Fretavel permits  {
    final String placa;
    final String marca;
    private double valorLocacaoDiaria;
    public final LocalDate anoFabricacao;
    private double precoFipe;

    public Veiculo(String placa, String marca, double valorLocacaoDiaria, LocalDate anoFabricacao, double precoFipe) {
        this.placa = placa;
        this.marca = marca;
        this.valorLocacaoDiaria = valorLocacaoDiaria;
        this.anoFabricacao = anoFabricacao;
        this.precoFipe = precoFipe;
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
}
