package com.example.projetsuivistage;

public class Eleve {

    protected String Nom;
    protected String Prenom;
    protected String Classe;
    protected String Specialite;

    public Eleve (String Nom, String Prenom, String Classe,String Specialite){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Classe = Classe;
        this.Specialite = Specialite;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String classe) {
        Classe = classe;
    }

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String specialite) {
        Specialite = specialite;
    }
}
