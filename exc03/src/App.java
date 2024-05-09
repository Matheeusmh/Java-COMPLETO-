/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;

        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        num2 = sc.nextInt();

        soma = num1 + num2;

        System.out.printf("\nSOMA = %d", soma);

        sc.close();
    }
}
