package com.example.projetsuivistage;

import android.sax.TextElementListener;

public class TuteurEntreprise {

    protected String Nom;
    protected String Prenom;
    protected String Email;
    protected String Telephone;
    protected String Fonction;

    public TuteurEntreprise(String Nom, String Prenom, String Email, String Telephone, String Fonction){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.Email = Email;
        this.Telephone = Telephone;
        this.Fonction = Fonction;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getFonction() {
        return Fonction;
    }

    public void setFonction(String fonction) {
        Fonction = fonction;
    }
}
