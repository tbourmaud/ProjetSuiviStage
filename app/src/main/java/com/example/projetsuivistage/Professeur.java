package com.example.projetsuivistage;

public class Professeur {

    protected String Nom;
    protected String Email;
    protected String Divers;

    public Professeur(String Nom, String Email, String Divers){
        this.Nom = Nom;
        this.Email = Email;
        this.Divers = Divers;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDivers() {
        return Divers;
    }

    public void setDivers(String divers) {
        Divers = divers;
    }
}
