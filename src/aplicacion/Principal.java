package aplicacion;

import java.util.Random;
import java.util.stream.IntStream;

public class Principal {
    public static void main(String[] args) {
        int pasos = Integer.parseInt(args[0]);
        System.out.println("El número PI es " + generarNumeroPiIterativo(pasos));
    }


