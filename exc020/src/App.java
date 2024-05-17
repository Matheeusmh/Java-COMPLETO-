/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida: 
- Imprimir todos os elementos do vetor 
- Mostrar na tela a soma e a média dos elementos do vetor */
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, i = 0;
        double media, soma = 0;

        System.out.print("Quantos numeros deseja amarzenar? R: ");
        n = sc.nextInt();
        double[] vetorReais = new double[n];

        for(; i < vetorReais.length; i++) {
            System.out.print(i + 1 + "º numero: ");
            vetorReais[i] = sc.nextDouble();
            soma += vetorReais[i];
        }

        media = soma / vetorReais.length;

        System.out.print("Vetor:\n");
        for(i = 0; i < vetorReais.length; i++) {
            System.out.println(vetorReais[i]);
        }

        System.out.print("\n\t__DADOS__\n");
        System.out.printf("Soma: %f\nMedia: %.2f", soma, media);

        sc.close();
    }
}
