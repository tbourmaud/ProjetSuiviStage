package com.example.projetsuivistage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.Cursor;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

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




    private CreateBDD tableCourante;
    private Context context;
    private SQLiteDatabase db;
    //le constructeur
    public DAOBdd(Context context){
        this.context = context;
        tableCourante = new CreateBDD(context, NOM_BDD, null, VERSION_BDD);
    }
    //si la bdd n’existe pas, l’objet SQLiteOpenHelper exécute la méthode onCreate
    // si la version de la base a changé, la méthode onUpgrade sera lancée
    // dans les 2 cas l’appel à getWritableDatabase ou getReadableDatabase renverra la base
    // de données en cache, nouvellement ouverte, nouvellement créée ou mise à jour
    //les méthodes d'instance

    public DAOBdd open(){
        db = tableCourante.getWritableDatabase();
        return this;
    }
    public DAOBdd close(){
        db.close();
        return null;
    }




    public List<String> getAllEleveByProf(String IdProfesseur){
        List<String> listeEleves = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT "+COL_NOM_ELEVE+" FROM tEleve INNER JOIN tProfesseur on "+TABLE_ELEVE+"."+COL_FK_PROFESSEUR_ELEVE+"="+TABLE_PROFESSEUR+"."+COL_ID_PROFESSEUR+" WHERE "+COL_FK_PROFESSEUR_ELEVE+"="+IdProfesseur+";", null);
        if(c.moveToFirst()){
            do{
                listeEleves.add(c.getString(0));
            } while(c.moveToNext());
        }
        c.close();
        return listeEleves;
    }


    // Permet de retourner une liste contenant uniquement le noms des professeurs
    public List<String> getAllNomProf(){
        List<String> listeNomProfs = new ArrayList<>();
        Cursor c = db.rawQuery("SELECT Nom FROM tProfesseur", null);
        if(c.moveToFirst()) {
            do {
                listeNomProfs.add(c.getString(1));
            } while (c.moveToNext());
        }
        c.close();
        //db.close();
        return listeNomProfs;
    }








}
