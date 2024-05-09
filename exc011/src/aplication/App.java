package aplication;
import entities.Retangulo;
import java.util.Scanner;
import entities.Retangulo;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Retangulo retangulo = new Retangulo();

        System.out.print("Digite o comprimento: ");
        retangulo.comprimento = sc.nextDouble();
        System.out.print("Digite a largura: ");
        retangulo.largura = sc.nextDouble();

        System.out.print(retangulo);
        
        sc.close();
    }
}
