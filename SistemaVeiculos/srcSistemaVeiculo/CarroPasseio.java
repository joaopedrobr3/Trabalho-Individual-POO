import java.time.LocalDate;

public non-sealed class CarroPasseio extends Veiculo {


    public CarroPasseio(int id, String placa, String marca, double valorLocacaoDiaria, LocalDate anoFabricacao, double precoFipe) {
        super(id, placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);
    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
        if(dias <= 0){
            throw new IllegalArgumentException("Dias inválidos!");
        }
        return getValorLocacaoDiaria() * dias;
    }

    @Override
    public double calcularIPVA() {
        if(getIdadeVeiculo() > 20){
            return 0.0;
        }
       return getPrecoFipe() * 0.04;
    }
}
