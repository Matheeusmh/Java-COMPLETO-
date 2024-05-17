
/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na 
tela todos os números pares, e também a quantidade de números pares. */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, count = 0;

        System.out.print("Digite a quantidade de numeros: ");
        n = sc.nextInt();
        int[] vetorInt = new int[n];

        for (int i = 0; i < vetorInt.length; i++) {
            System.out.print((i + 1) + "º numero: ");
            vetorInt[i] = sc.nextInt();
        }

        System.out.print("\n Numeros pares:\n");
        for (int i = 0; i < vetorInt.length; i++) {
            if (vetorInt[i] % 2 == 0) {
                System.out.println(vetorInt[i]);
                count++;
            }
        }
        System.out.print("\nQuantidade de pares: " + count);

        sc.close();
    }
}
