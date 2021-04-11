package com.example.projetsuivistage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

public class BilanStageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bilan);

        //Gestion des boutons enregistrer et annuler
        Button btnValider = (Button) findViewById(R.id.btnValiderBilan);
        Button btnAnnuler = (Button) findViewById(R.id.btnAnnulerBilan);

        // Gestion des cases editText
        EditText editTextConditions = findViewById(R.id.editTextConditions);
        EditText editTextBilanTravaux = findViewById(R.id.editTextBilanTravaux);
        EditText editTextRessources = findViewById(R.id.editTextRessources);
        EditText editTextCommentaires = findViewById(R.id.editTextCommentaires);

        // SharedPreferences
        final SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        SharedPreferences.Editor editor = pref.edit();

        //on va créer un écouteur pour un groupe de boutons
        View.OnClickListener ecouteur = new View.OnClickListener() {
            //on implémente la méthode onclick
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnAnnulerBilan:
                        finish();
                        break;
                    case R.id.btnValiderBilan:
                        Intent intent = new Intent(BilanStageActivity.this, AvisStageActivity.class);
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
        List bilanStage = daoBdd.getBilanByIdEleve(daoBdd.getIdByPrenomEleve(unEleve));
        daoBdd.close();

        //Remplir les informations du stage
        //Toast.makeText(InformationTuteurActivity.this, infoStage.toString(), Toast.LENGTH_SHORT).show();
        editTextConditions.setText(bilanStage.get(0).toString());
        editTextBilanTravaux.setText(bilanStage.get(1).toString());
        editTextRessources.setText(bilanStage.get(2).toString());
        editTextCommentaires.setText(bilanStage.get(3).toString());

    }
}