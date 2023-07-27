package fr.doranco.flash.entity;

public class Pays {
    private String nom;
    private String capitale;
    private float population;
    private String drapeau;

    public Pays() {
    }

    public Pays(String nom, String capitale, float population, String drapeau) {
        this.nom = nom;
        this.capitale = capitale;
        this.population = population;
        this.drapeau = drapeau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCapitale() {
        return capitale;
    }

    public void setCapitale(String capitale) {
        this.capitale = capitale;
    }

    public float getPopulation() {
        return population;
    }

    public void setPopulation(float population) {
        this.population = population;
    }

    public String getDrapeau() {
        return drapeau;
    }

    public void setDrapeau(String drapeau) {
        this.drapeau = drapeau;
    }
}
