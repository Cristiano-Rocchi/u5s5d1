package cristianorocchi.u5s5d1.entities;

public class ElementoMenu {
    private String nome;
    private double prezzo;

    public ElementoMenu(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }
}
