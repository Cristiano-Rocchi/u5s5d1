package cristianorocchi.u5s5d1.entities;

public class Topping {
    private String nome;
    private int calorie;
    private double prezzo;

    public Topping(String nome, int calorie, double prezzo) {
        this.nome = nome;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }


    public String getNome() {
        return nome;
    }

    public int getCalorie() {
        return calorie;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Topping{" +
                "nome='" + nome + '\'' +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}

