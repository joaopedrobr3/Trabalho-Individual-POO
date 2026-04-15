import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new CarroPasseio(1,"ABC1234", "Toyota", 100, LocalDate.of(
                2015,
                1,
                1),
                40000));

        veiculos.add(new CarroPasseio(2,
                "GHI9999", "Honda", 120, LocalDate.of(
                2000,
                8,
                8),
                25000));

        veiculos.add(new CarroPasseio(3,"JKL1111", "Ford", 90, LocalDate.of(
                2018,
                10,
                26),
                35000));
        veiculos.add(new CarroPasseio(4,"MNO2222", "Chevrolet", 110, LocalDate.of(
                2020,
                4,
                5),
                50000));
        veiculos.add(new Caminhao(5,"DEF5678", "Volvo", 500, LocalDate.of(
                2010,
                8,
                7),
                200000,
                10));
        veiculos.add(new Caminhao(6,"HIJ1010", "Scania", 650, LocalDate.of(
                2018,
                1,
                3),
                350000,
                15));
        Menu menu = new Menu();
        menu.iniciar(veiculos);

    }

}
