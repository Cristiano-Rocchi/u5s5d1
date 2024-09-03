package cristianorocchi.u5s5d1.entities;

import cristianorocchi.u5s5d1.entities.ElementoMenu;
import cristianorocchi.u5s5d1.entities.Tavolo;

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
    private List<ElementoMenu> elementiMenu; // Cambiato da List<String> a List<ElementoMenu>
    private StatoOrdine stato;
    private int numeroCoperti;
    private LocalDateTime oraAcquisizione;
    private double importoTotale;

    public Ordine(int numeroOrdine, Tavolo tavolo, List<ElementoMenu> elementiMenu, StatoOrdine stato, int numeroCoperti, double costoCoperto) {
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
                .mapToDouble(ElementoMenu::getPrezzo)
                .sum();
        return totaleElementi + (numeroCoperti * costoCoperto);
    }


    public int getNumeroOrdine() { return numeroOrdine; }
    public Tavolo getTavolo() { return tavolo; }
    public List<ElementoMenu> getElementiMenu() { return elementiMenu; }
    public StatoOrdine getStato() { return stato; }
    public void setStato(StatoOrdine stato) { this.stato = stato; }
    public int getNumeroCoperti() { return numeroCoperti; }
    public LocalDateTime getOraAcquisizione() { return oraAcquisizione; }
    public double getImportoTotale() { return importoTotale; }
}
