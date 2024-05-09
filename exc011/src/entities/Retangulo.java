package entities;

public class Retangulo {
    public double comprimento, largura;

    public double area() {
        return comprimento * largura;
    }
    public double perimetro() {
        return (comprimento + largura) * 2;
    }
    public double diagonal() {
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(comprimento, 2));
    }
    public String toString() {
        return "\nArea: " 
        + String.format("%.2f", area())
        + "\nPerimetro: " + String.format("%.2f", perimetro())
        + "\nDiagonal: " + String.format("%.2f", diagonal());
    }
}
