/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        int codigoPecaUm, codigoPecaDois, quantidadePecaUm, quantidadePecaDois;
        double precoUnidadeUm, precoUnidadeDois, valorTotal;

        System.out.print("Digite o codigo da peca: ");
        codigoPecaUm = sc.nextInt();
        System.out.print("Digite a quantidade desta peca: ");
        quantidadePecaUm = sc.nextInt();
        System.out.printf("Digite o preco da peca de codigo %d: ", codigoPecaUm);
        precoUnidadeUm = sc.nextDouble();

        System.out.print("\nDigite o codigo da segunda peca: ");
        codigoPecaDois = sc.nextInt();
        System.out.print("Digite a quantidade desta peca: ");
        quantidadePecaDois = sc.nextInt();
        System.out.printf("Digite o preco da peca de codigo %d: ", codigoPecaDois);
        precoUnidadeDois = sc.nextDouble();

        valorTotal = precoUnidadeUm * quantidadePecaUm + precoUnidadeDois * quantidadePecaDois;

        System.out.printf("\nValor total a ser pago: R$%.2f\n", valorTotal);

        sc.close();
    }
}
