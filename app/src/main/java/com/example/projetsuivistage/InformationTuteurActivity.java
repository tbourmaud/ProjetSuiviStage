package com.example.projetsuivistage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class InformationTuteurActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_tuteur);

        //Gestion des boutons enregistrer et annuler
        Button btnValider = (Button) findViewById(R.id.btnValiderInfoTuteur);
        Button btnAnnuler = (Button) findViewById(R.id.btnAnnulerInfoTuteur);

        //Gestion des cases des EditText
        EditText nomTuteurEcole = findViewById(R.id.editTextNomTuteurEcole);
        EditText mailTuteurEcole = findViewById(R.id.editTextMailTuteurEcole);
        EditText visiteTuteurEcole = findViewById(R.id.editTextDateVisite);
        EditText diversTuteurEcole = findViewById(R.id.editTextDivers);
        EditText nomTuteurEntreprise = findViewById(R.id.editTextNomTuteurEts);
        EditText telephoneTuteurEntreprise = findViewById(R.id.editTextTuteurTelEts);
        EditText mailTuteurEntreprise = findViewById(R.id.editTextTuteurMailEts);

        // SharedPreferences
        final SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        SharedPreferences.Editor editor = pref.edit();


        //on va créer un écouteur pour un groupe de boutons
        View.OnClickListener ecouteur = new View.OnClickListener() {
            //on implémente la méthode onclick
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnAnnulerInfoTuteur:
                        finish();
                        break;
                    case R.id.btnValiderInfoTuteur:
                        Intent intent = new Intent(InformationTuteurActivity.this, BilanStageActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        btnAnnuler.setOnClickListener(ecouteur);
        btnValider.setOnClickListener(ecouteur);


        // Récupère l'élève depuis SharedPreferences
        String unEleve = pref.getString("unEleve", null);

        // Récupère les infos du stage depuis la bdd
        final DAOBdd daoBdd = new DAOBdd(this);
        daoBdd.open();
        List infoStage = daoBdd.getStageByIdEleve(daoBdd.getIdByPrenomEleve(unEleve));
        daoBdd.close();

        //Remplir les informations du stage
        //Toast.makeText(InformationTuteurActivity.this, infoStage.toString(), Toast.LENGTH_SHORT).show();
        nomTuteurEcole.setText(infoStage.get(0).toString());
        mailTuteurEcole.setText(infoStage.get(1).toString());
        visiteTuteurEcole.setText(infoStage.get(2).toString());
        if (infoStage.get(3) != null) {
            diversTuteurEcole.setText(infoStage.get(3).toString());
        }
        nomTuteurEntreprise.setText(infoStage.get(4).toString());
        telephoneTuteurEntreprise.setText(infoStage.get(5).toString());
        mailTuteurEntreprise.setText(infoStage.get(6).toString());

    }
}