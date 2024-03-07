package dominio;

import java.util.Random;
import java.util.stream.IntStream;

public class Matematicas {
    public static double generarNumeroPiIterativo(long pasos) {
        Random random = new Random(); // Creamos una sola instancia de Random
        int aciertos = (int) IntStream.range(0, (int) pasos)
                .mapToObj(i -> new double[]{random.nextDouble(), random.nextDouble()})
                .mapToDouble(xy -> Math.sqrt(xy[0] * xy[0] + xy[1] * xy[1]) <= 1.0 ? 1 : 0)
                .sum();

        double areaCuadrado = 4.0;
        return areaCuadrado * (aciertos / (double) pasos); // Convertimos pasos a double para obtener la división correcta
    }
}
