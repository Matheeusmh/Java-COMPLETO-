package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Empregado;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double percentual = 0;
        
        Empregado empregado = new Empregado();

        System.out.print("Nome: ");
        empregado.nome = sc.nextLine();
        System.out.print("Salario bruto: ");
        empregado.salarioBruto = sc.nextDouble();
        System.out.print("Taxa: ");
        empregado.taxa = sc.nextDouble();

        System.out.print("\nEmpregado: " + empregado.nome + ", R$" + empregado.salarioLiquido());
        System.out.print("\n\nDigite o percentual de aumento: ");
        percentual = sc.nextDouble();
        System.out.print("\nDados atualizados: " + empregado.nome + ", R$");
        empregado.aumentarSalario(percentual);

        sc.close();
    }
}
