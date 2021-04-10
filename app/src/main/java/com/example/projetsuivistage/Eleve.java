package com.example.projetsuivistage;

public class Eleve {

    protected String Nom;
    protected String Prenom;
    protected String Classe;
    protected String Specialite;
    protected String _id_professeur_eleve;
    protected String _id_tuteur_entreprise;

    public Eleve (String Nom, String Prenom, String Classe,String Specialite,String _id_professeur_eleve,String _id_tuteur_entreprise){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Classe = Classe;
        this.Specialite = Specialite;
        this._id_professeur_eleve = _id_professeur_eleve;
        this._id_tuteur_entreprise = _id_tuteur_entreprise;
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
        return _id_professeur_eleve;
    }

    public void setId_professeur(String _id_professeur_eleve) {
        _id_professeur_eleve = _id_professeur_eleve;
    }

    public String getId_tuteur() {
        return _id_tuteur_entreprise;
    }

    public void setId_tuteur(String _id_tuteur_entreprise) {
        _id_tuteur_entreprise = _id_tuteur_entreprise;
    }
}
