/* Faça um programa que leia 3 notas de 5 alunos e imprima a menor/maior média das notas 
com os nomes dos respectivos alunos. */
package aplication;

import entities.Aluno;
import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String args[]) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double[] media;

        for(int i = 0; i < 5; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            System.out.print("Nota 1: ");
            double notaUm = sc.nextDouble();
            System.out.print("Nota 2:");
            double notaDois = sc.nextDouble();
            System.out.print("Nota 3:");
            double notaTres = sc.nextDouble();
            System.out.printf("Media: %.2f", Aluno.calcularMedia(notaUm, notaDois, notaTres));
            Aluno alunos = new Aluno(nome,notaUm, notaDois, notaTres);
            System.out.println();
        }
        
        sc.close();
    }
}
