package cristianorocchi.u5s5d1.entities;

import java.util.List;

public class Pizza {
    private String nome;
    private List<Topping> toppings;
    private int calorie;
    private double prezzo;

    public Pizza(String nome, List<Topping> toppings, int calorie, double prezzo) {
        this.nome = nome;
        this.toppings = toppings;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", toppings=" + toppings +
                ", calorie=" + calorie +
                ", prezzo=" + prezzo +
                '}';
    }
}
