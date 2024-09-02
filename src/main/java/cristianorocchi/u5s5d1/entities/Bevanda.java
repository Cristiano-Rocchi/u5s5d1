package cristianorocchi.u5s5d1.entities;

public class Bevanda {
    private String nome;
    private String volume;
    private int calorie;
    private double prezzo;

    public Bevanda(String nome, String volume, int calorie, double prezzo) {
        this.nome = nome;
        this.volume = volume;
        this.calorie = calorie;
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
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
        return "Bevanda{" +
                "nome='" + nome + '\'' +
                ", volume='" + volume + '\'' +
                '}';
    }
}
