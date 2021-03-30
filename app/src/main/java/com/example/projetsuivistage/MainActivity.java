package com.example.projetsuivistage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    //test pour voir
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);

        Button btnValider = (Button) findViewById(R.id.btnValiderAccueil);

        //on va créer un écouteur pour un groupe de boutons
        View.OnClickListener ecouteur = new View.OnClickListener() {
            //on implémente la méthode onclick
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnRetourAccueil:
                        // clear
                        break;
                    case R.id.btnValiderAccueil:
                        Intent intent = new Intent(MainActivity.this, InformationStageActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        btnValider.setOnClickListener(ecouteur);


        //gestion de la liste déroulante des profs
        final Spinner spinnerProf = (Spinner) findViewById(R.id.spinnerProf);
        //        Création d'une instance de la classe DAObdd
        final DAOBdd daoBdd = new DAOBdd(this);
        //On ouvre la table
        daoBdd.open();
        // On récupère le nom de tous les professeurs
        List lesProfs = daoBdd.getAllNomProf();
        daoBdd.close();

        //String[] lesProfs = {"M. Bourgeois", "Kevin", "Mme. Contant"};
        ArrayAdapter<String> dataAdapterR = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lesProfs);
            dataAdapterR.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerProf.setAdapter(dataAdapterR);
            spinnerProf.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {
            public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
                String unProf = String.valueOf(spinnerProf.getSelectedItem());
            //Toast.makeText(NewReleveActivity.this, "Vous avez choisi : " + "\nl'heure : " + uneHeure[0], Toast.LENGTH_SHORT).show();
        }

            @Override
            public void onNothingSelected (AdapterView < ? > adapterView){

        }
        });

        //gestion de la liste déroulante des élèves
        final Spinner spinnerEleves = (Spinner) findViewById(R.id.spinnerEleves);
//        Création d'une instance de la classe DAObdd
//        final DAOBdd daoBdd = new DAOBdd(this);
//        //On ouvre la table
//        daoBdd.open();
//        // On récupère le nom de tous les élèves en fonction du professeur
//        List lesEleves = daoBdd.getAllElevesByProfesseur();
//        daoBdd.close();

        String[] lesEleves = {"Thomas", "Kevin", "bastiens"};
        ArrayAdapter<String> dataAdapterEleves = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lesEleves);
        dataAdapterEleves.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEleves.setAdapter(dataAdapterEleves);
        spinnerEleves.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()

        {
            public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
                String unEleves = String.valueOf(spinnerEleves.getSelectedItem());
                //Toast.makeText(NewReleveActivity.this, "Vous avez choisi : " + "\nl'heure : " + uneHeure[0], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected (AdapterView < ? > adapterView){

            }
        });
    }

    public void remplirProfs(){
        DAOBdd daoBdd = new DAOBdd(this);
        Professeur prof1 = new Professeur("M. Bourgeois", "bourgeois@la-joliverie.com");
        Professeur prof2 = new Professeur("Mme. Contant", "contant@la-joliverie.com");
        Professeur prof3 = new Professeur("M. Etesse", "etesse@la-joliverie.com");
        Professeur prof4 = new Professeur("Mme. Loiret", "loiret@la-joliverie.com");
        //on ouvre la base de données
        daoBdd.open();
        //on insère les lacs
        daoBdd.insererProf(prof1);
        daoBdd.insererProf(prof2);
        daoBdd.insererProf(prof3);
        daoBdd.insererProf(prof4);
        //le curseur pour afficher le nombre de professeurs dans la base
        //Cursor c = daoBdd.getDataProf();
        //Toast.makeText(getApplicationContext(), " il y a " + String.valueOf(c.getCount()) + " lacs ", Toast.LENGTH_LONG).show();
    }
}

