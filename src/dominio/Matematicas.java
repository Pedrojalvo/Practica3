package dominio;

import java.util.Random;
import java.util.stream.IntStream;

public class Matematicas {
    public static double generarNumeroPiIterativo(long pasos) {
        int aciertos = IntStream.range(0, (int) pasos)
                .mapToObj(i -> new Random().nextDouble())
                .mapToDouble(x -> {
                    double y = new Random().nextDouble();
                    return Math.sqrt(x * x + y * y) <= 1.0 ? 1 : 0;
                })
                .sum();

        double areaCuadrado = 4.0;
        return areaCuadrado * (aciertos / pasos);
    }
}
