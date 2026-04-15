import java.time.LocalDate;

public non-sealed class Caminhao extends Veiculo {
     public final double capacidadeCargaToneladas;

    public Caminhao( int id, String placa, String marca, double valorLocacaoDiaria, LocalDate anoFabricacao, double precoFipe, double capacidadeCargaToneladas) {
        super(id, placa, marca, valorLocacaoDiaria, anoFabricacao, precoFipe);

        if(capacidadeCargaToneladas <= 0){
            throw new IllegalArgumentException("Capacidade inválida");
        }

        this.capacidadeCargaToneladas = capacidadeCargaToneladas;

    }

    @Override
    public double alugarVeiculo(double pesoCarga, int dias) {
      if(pesoCarga <= 0 || dias <= 0){
          throw new IllegalArgumentException("Parâmetros inválidos");
      }
      double total = getValorLocacaoDiaria() * dias;

      if(pesoCarga > capacidadeCargaToneladas){
          total *= 1.10;
      }

      return total;
    }

    @Override
    public double calcularIPVA() {
        if(getIdadeVeiculo() > 20){
            return 0.0;
        }
        return getPrecoFipe() * 0.015;

    }
}
