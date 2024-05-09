/* Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int a, b, c, d, diferenca;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor para A: ");
        a = sc.nextInt();
        System.out.print("Digite um valor para B: ");
        b = sc.nextInt();
        System.out.print("Digite um valor para C: ");
        c = sc.nextInt();
        System.out.print("Digite um valor para D: ");
        d = sc.nextInt();

        diferenca = a * b - c * d;

        System.out.printf("\nDIFERENCA: %d", diferenca);

        sc.close();
    }
}
