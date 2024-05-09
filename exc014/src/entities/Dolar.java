package entities;

public class Dolar {
    public static double precoDolar = 0;
    public static double quantidadeComprada = 0;

    public static double totalPago(double precoDolar, double quantidadeComprada, double IOF) {
        return  (precoDolar * quantidadeComprada + ( IOF * precoDolar * quantidadeComprada));
    }
}
