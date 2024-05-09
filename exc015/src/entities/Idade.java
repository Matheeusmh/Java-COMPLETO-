package entities;

public class Idade {
    public static int dias = 0, meses = 0, anos = 0;

    public static int idadeEmDias(int dias, int meses, int anos) {
        return (dias + (meses * 30) + (anos * 365));
    }
}
