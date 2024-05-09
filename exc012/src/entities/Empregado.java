package entities;

public class Empregado {
    public String nome;
    public double salarioBruto;
    public double taxa;

    public double salarioLiquido() {
        return salarioBruto - taxa;
    }
    public void aumentarSalario(double percentual) {
        System.out.printf("%.2f", ((percentual / 100) * salarioBruto) + salarioLiquido());
    }
}
