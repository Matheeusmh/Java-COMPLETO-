package entities;

public class Aluno {
    public String nome;
    public double nota1, nota2, nota3;

    public double notaFinal() {
        return nota1 + nota2 + nota3;
    }
    public void aprovadoOuReprovado() {
        System.out.printf("\n Nota final: %.2f\n", notaFinal());

        if(notaFinal() >= 60)
        {
            System.out.println(" Aprovado!");
        }
        else
        {
            System.out.println(" Reprovado!");
            System.out.printf(" Precisa de %.2f pontos.\n", 60 - notaFinal());
        }
    }
}
