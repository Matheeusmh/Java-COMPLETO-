package entities;

public class Aluno {
    public String nome;
    public double notaUm = 0, notaDois = 0, notaTres = 0, media = 0;

    public Aluno(String nome, double notaUm, double notaDois, double notaTres) {
        this.nome = nome;
        this.notaUm = notaUm;
        this.notaDois = notaDois;
        this.notaTres = notaTres;
    }

    public static double calcularMedia(double notaUm, double notaDois, double notaTres) {
        return ((notaUm + notaDois + notaTres) / 3);
    }
}
