package aplication;

import java.util.Scanner;
import java.util.Locale;
import entities.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Aluno aluno0 = new Aluno();

        System.out.print("Digite os dados dos alunos: \n Nome: ");
        aluno1.nome = sc.nextLine();
        System.out.print(" Nota 1: ");
        aluno1.nota1 = sc.nextDouble();
        System.out.print(" Nota 2: ");
        aluno1.nota2 = sc.nextDouble();
        System.out.print(" Nota 3: ");
        aluno1.nota3 = sc.nextDouble();

        aluno1.notaFinal();
        aluno1.aprovadoOuReprovado();

        sc.close();
    }
}
