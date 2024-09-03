package cristianorocchi.u5s5d1.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Ordine {

    public enum StatoOrdine {
        IN_CORSO,
        PRONTO,
        SERVITO
    }

    private int numeroOrdine;
    private Tavolo tavolo;
    private List<String> elementiMenu;
    private StatoOrdine stato; 
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private double importoTotale;

    public Ordine(int numeroOrdine, Tavolo tavolo, List<String> elementiMenu, StatoOrdine stato, int numeroCoperti, double costoCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.tavolo = tavolo;
        this.elementiMenu = elementiMenu;
        this.stato = stato;
        this.numeroCoperti = numeroCoperti;
        this.oraAcquisizione = LocalDateTime.now();
        this.importoTotale = calcolaImportoTotale(costoCoperto);
    }

    private double calcolaImportoTotale(double costoCoperto) {
        double totaleElementi = elementiMenu.stream()

        return 2;
    }

    // Getter e Setter
    public int getNumeroOrdine() { return numeroOrdine; }
    public Tavolo getTavolo() { return tavolo; }
    public List<String> getElementiMenu() { return elementiMenu; }
    public StatoOrdine getStato() { return stato; }
    public void setStato(StatoOrdine stato) { this.stato = stato; }
    public int getNumeroCoperti() { return numeroCoperti; }
    public LocalDateTime getOraAcquisizione() { return oraAcquisizione; }
    public double getImportoTotale() { return importoTotale; }
}
