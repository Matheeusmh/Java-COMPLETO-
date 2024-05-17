/* Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela 
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento, 
considerando a primeira posição como 0 (zero). */
import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n, posicao = 0;
        double maiorValor = 0;

        System.out.print("Digite o numero de elementos: ");
        n = sc.nextInt();
        double[] vetorReais = new double[n];

        for(int i = 0; i < vetorReais.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º numero: ");
            vetorReais[i] = sc.nextDouble();

            if(i == 0){
                maiorValor = vetorReais[i];
                posicao = i;
            }
            else if(vetorReais[i] > maiorValor && i != 0) {
                maiorValor = vetorReais[i];
                posicao = i;
            }
        }
        
        System.out.print("\n Maior valor: " + maiorValor);
        System.out.print("\n Posicao: " + posicao);

        sc.close();
    }
}
