/* Calcular a area de um triangulo com o uso de classe e metódo. */
package aplication;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Double area;

        Triangle x;

        x = new Triangle();

        x.base = sc.nextDouble();
        x.altura = sc.nextDouble();

        area = x.area();

        System.out.printf("Area: %.2f", area);

        sc.close();
    }
}
