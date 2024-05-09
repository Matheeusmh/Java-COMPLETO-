package entities;

public class Conta {
    private int numeroDaConta;
    private String nomeDoProprietario;
    private double saldoDaConta;

    public Conta(){
    }
    public Conta(int numeroDaConta, String nomeDoProprietario, double saldoDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.nomeDoProprietario = nomeDoProprietario;
        this.saldoDaConta = saldoDaConta;
    }

    public void setSaldoDaConta(double saldoDaConta) {
        this.saldoDaConta = saldoDaConta; 
    }
    public double getSaldoDaConta() {
        return this.saldoDaConta;
    }
    public void setNomeDoProprietario(String nomeDoProprietario) {
        this.nomeDoProprietario = nomeDoProprietario;
    }
    public String getNomeDoProprietario() {
        return this.nomeDoProprietario;
    }
    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public void sacar(double movimentoMonetario) {
        setSaldoDaConta(getSaldoDaConta() - movimentoMonetario - 5);
    }
    public void depositar(double movimentoMonetario) {
        setSaldoDaConta(getSaldoDaConta() + movimentoMonetario);
    }
}
