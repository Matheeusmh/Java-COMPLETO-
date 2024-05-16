package entities;

public class Quarto {
    private int numQuarto;
    private String email;
    private String nomeHospede;

    public Quarto() {
    }

    public Quarto(int numQuarto, String email, String nomeHospede) {
        this.numQuarto = numQuarto;
        this.email = email;
        this.nomeHospede = nomeHospede;
    }

    public int getNumQuarto() {
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto) {
        this.numQuarto = numQuarto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeHospede() {
        return nomeHospede;
    }

    public void setNomeHospede(String nomeHospede) {
        this.nomeHospede = nomeHospede;
    }

    public String toString() {
        return "[" + numQuarto + "] - "
                + nomeHospede + ", "
                + email;
    }
}
