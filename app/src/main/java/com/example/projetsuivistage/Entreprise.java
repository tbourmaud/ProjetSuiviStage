package com.example.projetsuivistage;

public class Entreprise {

    protected String Nom;
    protected String Adresse;
    protected String CodePostal;
    protected String Ville;
    protected String Telephone;


    public Entreprise(String Nom, String Adresse, String CodePostal, String Ville, String Telephone){
        this.Nom = Nom;
        this.Adresse = Adresse;
        this.CodePostal = CodePostal;
        this.Ville = Ville;
        this.Telephone = Telephone;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getCodePostal() {
        return CodePostal;
    }

    public void setCodePostal(String codePostal) {
        CodePostal = codePostal;
    }

    public String getVille() {
        return Ville;
    }

    public void setVille(String ville) {
        Ville = ville;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }
}
