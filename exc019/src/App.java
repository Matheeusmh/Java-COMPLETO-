/* Faça um programa que leia um número inteiro positivo N e depois N números inteiros 
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 0;
        
        System.out.print("Digite quantos numeros quer amarzenar: ");
        n = sc.nextInt();
        int[] vetorInt = new int[n];

        for(; i < vetorInt.length; i++) {
            System.out.print("Numero: ");
            vetorInt[i] = sc.nextInt();
        }

        System.out.println("\nNumeros negativos: ");
        for(i = 0; i < vetorInt.length; i++) {
            if(vetorInt[i] < 0) {
                System.out.println(vetorInt[i]);
            }
        }

        sc.close();
    }
}
