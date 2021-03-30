package com.example.projetsuivistage;

public class TuteurProfesseur {

    protected String Nom;
    protected String Email;

    public TuteurProfesseur(String Nom, String Email){
        this.Nom = Nom;
        this.Email = Email;
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
}
