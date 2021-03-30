package com.example.projetsuivistage;

public class DAOBdd {
    static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "SuiviStage.db";

    //table Entreprise
    static final String TABLE_ENTREPRISE = "tEntreprise";
    static final String COL_ID_ENTREPRISE = "_id_entreprise";
    static final int NUM_COL_ID_ENTREPRISE = 0;
    static final String COL_NOM_ENTREPRISE = "Raison sociale";
    static final int NUM_COL_NOM_ENTREPRISE = 1;
    static final String COL_ADRESSE_ENTREPRISE = "Adresse";
    static final int NUM_COL_ADRESSE_ENTREPRISE = 2;
    static final String COL_CODEPOSTAL_ENTREPRISE = "Code Postal";
    static final int NUM_COL_CODEPOSTAL_ENTREPRISE = 3;
    static final String COL_VILLE_ENTREPRISE = "Ville";
    static final int NUM_COL_VILLE_ENTREPRISE = 4;
    static final String COL_TELEPHONE_ENTREPRISE = "Téléphone";
    static final int NUM_COL_TELEPHONE_ENTREPRISE = 5;

    //table Tuteur de stage
    static final String TABLE_TUTEUR_ENTREPRISE = "tTuteurEntreprise";
    static final String COL_ID_TUTEUR_ENTREPRISE = "_id_tuteur_entreprise";
    static final int NUM_COL_ID_TUTEUR_ENTREPRISE = 0;
    static final String COL_NOM_TUTEUR_ENTREPRISE = "Nom";
    static final int NUM_COL_NOM_TUTEUR_ENTREPRISE = 1;
    static final String COL_PRENOM_TUTEUR_ENTREPRISE = "Prénom";
    static final int NUM_COL_PRENOM_TUTEUR_ENTREPRISE = 2;
    static final String COL_MAIL_TUTEUR_ENTREPRISE = "Email";
    static final int NUM_COL_MAIL_TUTEUR_ENTREPRISE = 3;
    static final String COL_FONCTION_TUTEUR_ENTREPRISE = "Fonction";
    static final int NUM_COL_FONCTION_TUTEUR_ENTREPRISE = 4;
    static final String COL_TELEPHONE_TUTEUR_ENTREPRISE = "Téléphone";
    static final int NUM_COL_TELEPHONE_TUTEUR_ENTREPRISE = 5;

    //table Professeur
    static final String TABLE_PROFESSEUR = "tProfesseur";
    static final String COL_ID_PROFESSEUR = "_id_professeur";
    static final int NUM_COL_ID_PROFESSEUR = 0;
    static final String COL_NOM_PROFESSEUR = "Nom";
    static final int NUM_COL_NOM_PROFESSEUR = 1;
    static final String COL_MAIL_PROFESSEUR = "Email";
    static final int NUM_COL_MAIL_PROFESSEUR = 2;



}
