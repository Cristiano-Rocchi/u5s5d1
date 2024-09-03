package cristianorocchi.u5s5d1.entities;

public class Tavolo {
    private int numero;
    private int numeroCopertiMax;
    private boolean occupato;

    public Tavolo(int numero, int numeroCopertiMax) {
        this.numero = numero;
        this.numeroCopertiMax = numeroCopertiMax;
        this.occupato = false;
    }


    public int getNumero() { return numero; }
    public int getNumeroCopertiMax() { return numeroCopertiMax; }
    public boolean isOccupato() { return occupato; }

    public void setOccupato(boolean occupato) {
        this.occupato = occupato;
    }
}
