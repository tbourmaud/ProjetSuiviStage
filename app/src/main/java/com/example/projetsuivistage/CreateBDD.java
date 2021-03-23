package com.example.projetsuivistage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class CreateBDD extends SQLiteOpenHelper{

//table Entreprise

    public static final String TABLE_ENTREPRISE = "tEntreprise";
    static final String COL_IDENTREPRISE = "_id_entreprise";
    private static final String COL_NOM = " Raison sociale";
    private static final String COL_ADRESSE = "Adresse";
    private static final String COL_CODEPOSTAL = "Code Postal";
    private static final String COL_VILLE = "Ville";
    private static final String COL_TELEPHONE = "Téléphone";
    private static final CREATE_TABLEENTREPRISE = "CREATE TABLE " + " TABLE_ENTREPRISE " + " (" + COL_IDENTREPRISE + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL_NOM + " TEXT NOT NULL, " + COL_ADRESSE + " TEXT NOT NULL, " + COL_CODEPOSTAL + " TEXT NOT NULL, " + COL_VILLE + " TEXT NOT NULL, " + COL_TELEPHONE + " TEXT NOT NULL);";




    public CreateBDD(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//creation des tables
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

    }

}
