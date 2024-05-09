/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.) */
package aplication;

import java.util.Scanner;
import entities.Idade;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade...\nAnos: ");
        Idade.anos = sc.nextInt();
        System.out.print("Meses: ");
        Idade.meses = sc.nextInt();
        System.out.print("Dias: ");
        Idade.dias = sc.nextInt();

        System.out.printf("\nIdade em dias: %d\n", Idade.idadeEmDias(Idade.dias, Idade.meses, Idade.anos));

        sc.close();
    }
}
