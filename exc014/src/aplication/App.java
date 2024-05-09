package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Dolar;

public class App {
    public static final double IOF = 0.06;
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a cotacao atual do dolar: ");
        Dolar.precoDolar = sc.nextDouble();
        System.out.print("Digite a quantidade comprada de dolares: ");
        Dolar.quantidadeComprada = sc.nextDouble();
        System.out.printf("\nO preco que devera ser pago eh: R$%.2f\n", Dolar.totalPago(Dolar.precoDolar, Dolar.quantidadeComprada, IOF));
        
        sc.close();
    }
}
