/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159 */
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        
        double raio;
        double pi = 3.14159;
        double area;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextDouble();

        area = pi * (Math.pow(raio, 2));

        System.out.printf("\nArea do circulo = %.4f", area);

        sc.close();
    }
}
