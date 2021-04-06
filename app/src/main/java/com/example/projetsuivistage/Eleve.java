package com.example.projetsuivistage;

public class Eleve {

    protected String Nom;
    protected String Prenom;
    protected String Classe;
    protected String Specialite;
    protected String Id_professeur;
    protected String Id_tuteur_entreprise;

    public Eleve (String Nom, String Prenom, String Classe,String Specialite,String Id_professeur,String Id_tuteur_entreprise){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Classe = Classe;
        this.Specialite = Specialite;
        this.Id_professeur = Id_professeur;
        this.Id_tuteur_entreprise = Id_tuteur_entreprise;
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

    public String getId_professeur() {
        return Id_professeur;
    }

    public void setId_professeur(String id_professeur) {
        Id_professeur = id_professeur;
    }

    public String getId_tuteur_entreprise() {
        return Id_tuteur_entreprise;
    }

    public void setId_tuteur_entreprise(String id_tuteur_entreprise) {
        Id_tuteur_entreprise = id_tuteur_entreprise;
    }
}
