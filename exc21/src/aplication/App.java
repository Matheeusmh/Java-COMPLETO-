/* Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na 
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos, 
bem como os nomes dessas pessoas caso houver. */
package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        double alturaMedia, somatoriaAlturas = 0, percentulAbaixo;

        System.out.print("Digite o numero de pessoas: ");
        n = sc.nextInt();
        sc.nextLine();
        Pessoa[] pessoas = new Pessoa[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\n" + (i + 1) + "º pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            sc.nextLine();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            sc.nextLine();

            somatoriaAlturas += altura;

            if(idade < 16) {
                contador++;
            }

            pessoas[i] = new Pessoa(nome, altura, idade);
        }

        alturaMedia = somatoriaAlturas / n;
        percentulAbaixo = (100 * contador) / n;

        System.out.print("\n\t__DADOS__\n");
        System.out.printf("Media das alturas: %.2f\n", alturaMedia);
        System.out.printf("Percentural de pessoas com menos de 16 anos: %.2f\n", percentulAbaixo);
        System.out.println("  -Nomes: ");
        for(int i = 0; i < n; i++) {
            if(pessoas[i].getIdade() < 16) {
                System.out.printf("   %s\n", pessoas[i].getNome());
            }
        }

        sc.close();
    }
}
