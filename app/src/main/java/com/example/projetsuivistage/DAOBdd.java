package com.example.projetsuivistage;

public class DAOBdd {
    static final int VERSION_BDD = 1;
    private static final String NOM_BDD = "SuiviStage.db";



    //table STAGE
    static final String TABLE_STAGE = "tStage";
    static final String COL_ID_STAGE = "_id_stage";
    static final int NUM_COL_ID_STAGE = 0;
    static final String COL_INTITULE_STAGE = "Intitulé";
    static final int NUM_COL_INTITULE_STAGE = 1;
    static final String COL_DEBUT_STAGE = "Début";
    static final int NUM_COL_DEBUT_STAGE = 2;
    static final String COL_FIN_STAGE = "Fin";
    static final int NUM_COL_FIN_STAGE = 3;
    static final String COL_DATE_VISITE_STAGE = "Date visite";
    static final int NUM_COL_DATE_VISITE_STAGE = 4;
    static final String COL_COMPTE_RENDU_STAGE = "Compte rendu";
    static final int NUM_COL_COMPTE_RENDU_STAGE = 5;
    static final String COL_CONDITIONS_STAGE = "Conditions";
    static final int NUM_COL_CONDITIONS_STAGE = 6;
    static final String COL_BILAN_TRAVAUX_STAGE = "Bilan travaux réalisés";
    static final int NUM_COL_BILAN_TRAVAUX_STAGE = 7;
    static final String COL_RESSOURCES_OUTILS_STAGE = "Ressources stage";
    static final int NUM_COL_RESSOURCES_OUTILS_STAGE = 8;
    static final String COL_COMMENTAIRE_STAGE = "Commentaire";
    static final int NUM_COL_COMMENTAIRES_STAGE = 9;
    static final String COL_JURY_STAGE = "Jury";
    static final int NUM_COL_JURY_STAGE = 10;
    static final String COL_OPPORTUNITES_STAGE = "Opportunités stage";
    static final int NUM_COL_OPPORTUNITES_STAGE = 11;
    static final String COL_FK_ID_ELEVE = "_id_eleve";
    static final int NUM_COL_FK_ELEVE_STAGE = 12;
    static final String COL_FK_ID_PROFESSEUR_STAGE = "_id_professeur";
    static final int NUM_COL_FK_ID_PROFESSEUR_STAGE = 13;
    static final String COL_FK_ID_TUTEUR_ENTREPRISE_STAGE = "_id_tuteur_entreprise";
    static final int NUM_COL_FK_TUTEUR_ENTREPRISE_STAGE = 14;
    static final String COL_FK_ID_ENTREPRISE_STAGE = "_id_entreprise";
    static final int NUM_COL_FK_ENTREPRISE_STAGE = 15;

    //table ELEVE
    static final String TABLE_ELEVE = "tEleve";
    static final String COL_ID_ELEVE = "_id_eleve";
    static final int NUM_COL_ELEVE = 0;
    static final String COL_NOM_ELEVE = "Nom";
    static final int NUM_COL_NOM_ELEVE = 1;
    static final String COL_PRENOM_ELEVE = "Prénom";
    static final int NUM_COL_PRENOM_ELEVE = 2;
    static final String COL_CLASSE_ELEVE = "Classe";
    static final int NUM_COL_CLASSE_ELEVE = 3;
    static final String COL_SPECIALITE_ELEVE = "Spécialité";
    static final int NUM_COL_SPECIALITE_ELEVE = 4;
    static final String COL_FK_PROFESSEUR_ELEVE = "_id_professeur";
    static final int NUM_COL_FK_PROFESSEUR_ELEVE = 5;
    static final String COL_FK_TUTEUR_ENTREPRISE_ELEVE = "_id_tuteur_entreprise";
    static final int NUM_COL_FK_TUTEUR_ENTREPRISE_ELEVE = 6;











}
