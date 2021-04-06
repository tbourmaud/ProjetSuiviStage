package com.example.projetsuivistage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CreateBDD extends SQLiteOpenHelper{



    //table Entreprise
    public static final String TABLE_ENTREPRISE = "tEntreprise";
    static final String COL_ID_ENTREPRISE = "_id_entreprise";
    private static final String COL_NOM_ENTREPRISE = "Raison sociale";
    private static final String COL_ADRESSE_ENTREPRISE = "Adresse";
    private static final String COL_CODEPOSTAL_ENTREPRISE = "Code Postal";
    private static final String COL_VILLE_ENTREPRISE = "Ville";
    private static final String COL_TELEPHONE_ENTREPRISE = "Téléphone";

    private static final String CREATE_TABLE_ENTREPRISE = "CREATE TABLE " + TABLE_ENTREPRISE + " (" + COL_ID_ENTREPRISE + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NOM_ENTREPRISE + " TEXT NOT NULL, " + COL_ADRESSE_ENTREPRISE + " TEXT NOT NULL, " + COL_CODEPOSTAL_ENTREPRISE + " TEXT NOT NULL, " + COL_VILLE_ENTREPRISE + " TEXT NOT NULL, " + COL_TELEPHONE_ENTREPRISE + " TEXT NOT NULL);";

    //table Tuteur de stage
    public static final String TABLE_TUTEUR_ENTREPRISE = "tTuteurEntreprise";
    static final String COL_ID_TUTEUR_ENTREPRISE = "_id_tuteur_entreprise";
    private static final String COL_NOM_TUTEUR_ENTREPRISE = "Nom";
    private static final String COL_PRENOM_TUTEUR_ENTREPRISE = "Prénom";
    private static final String COL_MAIL_TUTEUR_ENTREPRISE = "Email";
    private static final String COL_FONCTION_TUTEUR_ENTREPRISE = "Fonction";
    private static final String COL_TELEPHONE_TUTEUR_ENTREPRISE = "Téléphone";

    private static final String CREATE_TABLE_TUTEUR_ENTREPRISE = "CREATE TABLE " + TABLE_TUTEUR_ENTREPRISE + " (" + COL_ID_TUTEUR_ENTREPRISE + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NOM_TUTEUR_ENTREPRISE + " TEXT NOT NULL, " + COL_PRENOM_TUTEUR_ENTREPRISE + " TEXT NOT NULL, " + COL_MAIL_TUTEUR_ENTREPRISE + " TEXT NOT NULL, " + COL_FONCTION_TUTEUR_ENTREPRISE + " TEXT NOT NULL, " + COL_TELEPHONE_TUTEUR_ENTREPRISE + " TEXT NOT NULL);";

    //table professeur

    public static final String TABLE_PROFESSEUR = "tProfesseur";
    static final String COL_ID_PROFESSEUR = "_id_professeur";
    private static final String COL_NOM_PROFESSEUR = "Nom";
    private static final String COL_MAIL_PROFESSEUR = "Email";

    private static final String CREATE_TABLE_PROFESSEUR = "CREATE TABLE " + TABLE_PROFESSEUR + " (" + COL_ID_PROFESSEUR + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NOM_PROFESSEUR + " TEXT NOT NULL, " + COL_MAIL_PROFESSEUR + " TEXT NOT NULL);";

    //table eleve

    private static final String TABLE_ELEVE = "tEleve";
    static final String COL_ID_ELEVE = "_id_eleve";
    private static final String COL_NOM_ELEVE = "Nom";
    private static final String COL_PRENOM_ELEVE = "Prénom";
    private static final String COL_CLASSE_ELEVE = "Classe";
    private static final String COL_SPECIALITE_ELEVE = "Spécialité";
    private static final String CREATE_TABLE_ELEVE = "CREATE TABLE " + TABLE_ELEVE + " (" + COL_ID_ELEVE + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NOM_ELEVE + " TEXT NOT NULL, " + COL_PRENOM_ELEVE + "TEXT NOT NULL, " + COL_CLASSE_ELEVE + " TEXT NOT NULL, " + COL_SPECIALITE_ELEVE + "TEXT NOT NULL" +
            ", FOREIGN KEY (" +COL_ID_ELEVE+ ") REFERENCES " + TABLE_PROFESSEUR + "("+ COL_ID_PROFESSEUR + "), FOREIGN KEY (" +COL_ID_ELEVE+ ") REFERENCES " + TABLE_TUTEUR_ENTREPRISE + "("+ COL_ID_TUTEUR_ENTREPRISE + "));";

    //table Stage
    public static final String TABLE_STAGE = "tStage";
    static final String COL_ID_STAGE = "_id_stage";
    private static final String COL_INTITULE_STAGE = "Intitulé";
    private static final String COL_DEBUT_STAGE = "Début";
    private static final String COL_FIN_STAGE = "Fin";
    private static final String COL_DATE_VISITE_STAGE = "Date visite";
    private static final String COL_COMPTE_RENDU_STAGE = "Compte rendu";
    private static final String COL_CONDITIONS_STAGE = "Conditions";
    private static final String COL_BILAN_TRAVAUX_STAGE = "Bilan travaux réalisés";
    private static final String COL_RESSOURCES_OUTILS_STAGE = "Ressources stage";
    private static final String COL_COMMENTAIRE_STAGE = "Commentaire";
    private static final String COL_JURY_STAGE = "Jury";
    private static final String COL_OPPORTUNITES_STAGE = "Opportunités stage";

    private static final String CREATE_TABLE_STAGE = "CREATE TABLE " + TABLE_STAGE + " (" + COL_ID_STAGE + " INTEGER PRIMARY KEY AUTOINCREMENT," + COL_INTITULE_STAGE + " TEXT NOT NULL," + COL_DEBUT_STAGE + " TEXT NOT NULL,"
            + COL_FIN_STAGE + " TEXT NOT NULL, " + COL_DATE_VISITE_STAGE + " TEXT NOT NULL, " + COL_COMPTE_RENDU_STAGE + " TEXT NOT NULL, " + COL_CONDITIONS_STAGE + " TEXT NOT NULL, " + COL_BILAN_TRAVAUX_STAGE
            + " TEXT NOT NULL," + COL_RESSOURCES_OUTILS_STAGE + " TEXT NOT NULL,"
            + COL_COMMENTAIRE_STAGE + " TEXT NOT NULL, " + COL_JURY_STAGE + " TEXT NOT NULL," + COL_OPPORTUNITES_STAGE + "TEXT NOT NULL," +
            " FOREIGN KEY (" +COL_ID_STAGE+ ") REFERENCES " + TABLE_ENTREPRISE + "("+ COL_ID_ENTREPRISE + ")," +
            " FOREIGN KEY (" +COL_ID_STAGE+ ") REFERENCES " + TABLE_PROFESSEUR + "("+ COL_ID_PROFESSEUR + ")," +
            " FOREIGN KEY (" +COL_ID_STAGE+ ") REFERENCES " + TABLE_TUTEUR_ENTREPRISE + "("+ COL_ID_TUTEUR_ENTREPRISE + ")," +
            " FOREIGN KEY (" +COL_ID_STAGE+ ") REFERENCES " + TABLE_ELEVE + "("+ COL_ID_ELEVE + "));";



/*

    private static final String ALTER_TABLE_ELEVE = "ALTER TABLE " + TABLE_ELEVE + " ADD FOREIGN KEY (" + COL_ID_ELEVE + ") REFERENCES " + TABLE_PROFESSEUR +"(" + COL_ID_PROFESSEUR
            + " ), ADD FOREIGN KEY + (" + COL_ID_ELEVE + ") REFERENCES " + TABLE_TUTEUR_ENTREPRISE + " (" + COL_ID_TUTEUR_ENTREPRISE + ");";

    private static final String ALTER_TABLE_STAGE = "ALTER TABLE " + TABLE_STAGE + " ADD FOREIGN KEY (" + COL_ID_STAGE + ") REFERENCES " + TABLE_ENTREPRISE +"(" + COL_ID_ENTREPRISE
            + "), ADD FOREIGN KEY (" + COL_ID_STAGE + ") REFERENCES " + TABLE_PROFESSEUR + " (" + COL_ID_PROFESSEUR
            + "), ADD FOREIGN KEY (" + COL_ID_STAGE + ") REFERENCES " + TABLE_TUTEUR_ENTREPRISE + " (" + COL_ID_TUTEUR_ENTREPRISE
            + "), ADD FOREIGN KEY (" + COL_ID_STAGE + ") REFERENCES " + TABLE_ELEVE + " (" + COL_ID_ELEVE + ");";

*/

    public CreateBDD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//creation des tables
        db.execSQL(CREATE_TABLE_ENTREPRISE);
        db.execSQL(CREATE_TABLE_TUTEUR_ENTREPRISE);
        db.execSQL(CREATE_TABLE_PROFESSEUR);
        db.execSQL(CREATE_TABLE_ELEVE);
        db.execSQL(CREATE_TABLE_STAGE);
        //db.execSQL(ALTER_TABLE_STAGE);
       // db.execSQL(ALTER_TABLE_ELEVE);

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TUTEUR_ENTREPRISE + ";");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PROFESSEUR + ";");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_STAGE + ";");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ENTREPRISE + ";");
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ELEVE + ";");
        onCreate(db);
    }

}
