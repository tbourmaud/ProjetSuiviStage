package com.example.projetsuivistage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accueil);

        // Vide les tables
        deleteProfs();
        deleteEleves();
        // Remplit les tables
        remplirProfs();
        remplirEleves();

        // SharedPreferences
        SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        final SharedPreferences.Editor editor = pref.edit();

        // Eleve choisi via le spinner
        final String[] unEleve = new String[1];

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
                        // L'élève choisi est envoyé dans le SharedPreferences
                        editor.putString("unEleve", unEleve[0]);
                        editor.commit();

                        Intent intent = new Intent(MainActivity.this, InformationStageActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        btnValider.setOnClickListener(ecouteur);


        // Gestion de la liste déroulante des profs
        final Spinner spinnerProf = (Spinner) findViewById(R.id.spinnerProf);
        // Création d'une instance de la classe DAObdd
        final DAOBdd daoBdd = new DAOBdd(this);
        // On ouvre la table
        daoBdd.open();
        // On récupère le nom de tous les professeurs
        List lesProfs = daoBdd.getAllNomProf();

        // Liste Eleves
        final List[] lesEleves = new List[1];
        // spinner Eleves
        final Spinner spinnerEleves = (Spinner) findViewById(R.id.spinnerEleves);


        //String[] lesProfs = {"M. Bourgeois", "Kevin", "Mme. Contant"};
        ArrayAdapter<String> dataAdapterR = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lesProfs);
            dataAdapterR.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            spinnerProf.setAdapter(dataAdapterR);
            spinnerProf.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
                String unProf = String.valueOf(spinnerProf.getSelectedItem());
                //Toast.makeText(MainActivity.this, unProf, Toast.LENGTH_SHORT).show();

                // On ouvre la bdd pour récupérer les élèves en fonction de l'id du prof sélectionné
                daoBdd.open();
                lesEleves[0] = daoBdd.getElevesByIdProf(daoBdd.getIdByNomProf(unProf));
                daoBdd.close();

                // Gestion de l'affichage du spinner Eleves
                ArrayAdapter<String> dataAdapterEleves = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_item, lesEleves[0]);
                dataAdapterEleves.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
                spinnerEleves.setAdapter(dataAdapterEleves);
            }
            @Override
            public void onNothingSelected (AdapterView < ? > adapterView){
        }
        });
        daoBdd.close();

        // Gestion de la liste déroulante des élèves
        //String[] lesEleves = {"Thomas", "Kevin", "bastiens"};

        spinnerEleves.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected (AdapterView < ? > parent, View view,int position, long id){
                unEleve[0] = String.valueOf(spinnerEleves.getSelectedItem());
                //Toast.makeText(NewReleveActivity.this, "Vous avez choisi : " + "\nl'élève : " + unEleve[0], Toast.LENGTH_SHORT).show();
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
    }

    public void deleteProfs() {
        DAOBdd daoBdd = new DAOBdd(this);
        daoBdd.open();
        daoBdd.deleteProfs();
    }

    public void remplirEleves(){
        DAOBdd daoBdd = new DAOBdd(this);
        Eleve eleve10 = new Eleve("Stephan", "Enzoent", "2SLAM", "SLAM", "1", "1");
        Eleve eleve11 = new Eleve("Traineau", "Bastien", "2SLAM", "SLAM", "1", "1");
        Eleve eleve20 = new Eleve("Debut", "Kevin", "1SIO", "SLAM", "2", "4");
        Eleve eleve21 = new Eleve("Test", "Flavienne", "1SIO", "SLAM", "2", "3");
        Eleve eleve30 = new Eleve("Ok", "Pol", "1SIO", "SISR", "3", "2");
        Eleve eleve31 = new Eleve("Braus", "Sasha", "1SIO", "SISR", "3", "5");
        Eleve eleve40 = new Eleve("Jäger", "Eren", "1SIO", "SISR", "4", "5");
        Eleve eleve41 = new Eleve("Ackerman", "Mikasa", "1SIO", "SLAM", "4", "4");
        //on ouvre la base de données
        daoBdd.open();
        //on insère les élèves
        daoBdd.insererEleve(eleve10);
        daoBdd.insererEleve(eleve11);
        daoBdd.insererEleve(eleve20);
        daoBdd.insererEleve(eleve21);
        daoBdd.insererEleve(eleve30);
        daoBdd.insererEleve(eleve31);
        daoBdd.insererEleve(eleve40);
        daoBdd.insererEleve(eleve41);
        //le curseur pour afficher le nombre de professeurs dans la base
        //Cursor c = daoBdd.getDataProf();
        //Toast.makeText(getApplicationContext(), " il y a " + String.valueOf(c.getCount()) + " lacs ", Toast.LENGTH_LONG).show();
    }


    public void deleteEleves() {
        DAOBdd daoBdd = new DAOBdd(this);
        daoBdd.open();
        daoBdd.deleteEleves();
    }

    public void remplirTuteursEntreprise(){
        DAOBdd daoBdd = new DAOBdd(this);
        TuteurEntreprise te1 = new TuteurEntreprise("Jacquemonde", "Jean", "jj@gmail.com", "1234567890","Manager");
        TuteurEntreprise te2 = new TuteurEntreprise("Ackerman", "Levi", "la@snk.eld", "0404040404","Développeur");
        TuteurEntreprise te3 = new TuteurEntreprise("Test", "Testman", "test@testdomaine.fr", "0101010101","Patron");
        TuteurEntreprise te4 = new TuteurEntreprise("Vent", "Relou", "rvent@stop.hernandez", "9247384322","Manager");
        TuteurEntreprise te5 = new TuteurEntreprise("Promise", "Isabella", "ip@orange.com", "0105080206","Technicienne");


        //on ouvre la base de données
        daoBdd.open();
        //on insère les tuteurs
        daoBdd.insererTuteurEntreprise(te1);
        daoBdd.insererTuteurEntreprise(te2);
        daoBdd.insererTuteurEntreprise(te3);
        daoBdd.insererTuteurEntreprise(te4);
        daoBdd.insererTuteurEntreprise(te5);
        //le curseur pour afficher le nombre de professeurs dans la base
        //Cursor c = daoBdd.getDataProf();
        //Toast.makeText(getApplicationContext(), " il y a " + String.valueOf(c.getCount()) + " lacs ", Toast.LENGTH_LONG).show();
    }
    public void deleteTuteursEntreprise() {
        DAOBdd daoBdd = new DAOBdd(this);
        daoBdd.open();
        daoBdd.deleteTuteursEntreprise();
    }

}

