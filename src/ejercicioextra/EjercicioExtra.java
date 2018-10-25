package ejercicioextra;

import java.util.Scanner;

public class EjercicioExtra {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float radio;
        final float PI = (float) 3.14;
        System.out.print("Introducir radio:");
        radio = ler.nextFloat();
        System.out.println("Lonxitude=" + 2 * PI * radio);
        System.out.println("Area=" + (radio * radio) * PI);
        System.out.println("Volumen= " + PI * (3 / 4) * radio * radio);

    }

}
