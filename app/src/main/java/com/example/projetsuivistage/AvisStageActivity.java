package com.example.projetsuivistage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.List;

public class AvisStageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avis);

        //Gestion des boutons enregistrer et annuler
        Button btnValider = (Button) findViewById(R.id.btnValiderAvis);
        Button btnAnnuler = (Button) findViewById(R.id.btnAnnulerAvis);

        // Gestion bouton radios et checkbox
        RadioButton radioButtonOuiParticipe = findViewById(R.id.radioButtonOuiParticipe);
        RadioButton radioButtonNonParticipe = findViewById(R.id.radioButtonNonParticipe);
        RadioButton radioButtonOuiOpportunite = findViewById(R.id.radioButtonOuiOpportunite);
        RadioButton radioButtonNonOpportunite = findViewById(R.id.radioButtonNonOpportunite);
        CheckBox checkboxMaiJuin = findViewById(R.id.checkboxMaiJuin);
        CheckBox checkboxJanvierFevrier = findViewById(R.id.checkboxJanvierFevrier);


        // SharedPreferences
        final SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        final SharedPreferences.Editor editor = pref.edit();


        //on va créer un écouteur pour un groupe de boutons
        View.OnClickListener ecouteur = new View.OnClickListener() {
            //on implémente la méthode onclick
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnAnnulerAvis:
                        finish();
                        break;
                    case R.id.btnValiderAvis:
                        Intent intent = new Intent(AvisStageActivity.this, MainActivity.class);
                        startActivity(intent);
                        finish();
                        break;
                }
            }
        };
        btnAnnuler.setOnClickListener(ecouteur);
        btnValider.setOnClickListener(ecouteur);

        // Récupère l'élève depuis SharedPreferences
        String unEleve = pref.getString("unEleve", null);

        // Récupère les avis du stage depuis la bdd
        final DAOBdd daoBdd = new DAOBdd(this);
        daoBdd.open();
        List avisStage = daoBdd.getAvisStageByIdEleve(daoBdd.getIdByPrenomEleve(unEleve));
        daoBdd.close();

        // Remplir les informations du stage
        //Toast.makeText(AvisStageActivity.this, avisStage.toString(), Toast.LENGTH_SHORT).show();
        if (avisStage.get(0).toString().contains("Oui")) {
            radioButtonOuiParticipe.toggle();
        } else {
            radioButtonNonParticipe.toggle();
        }

        if (avisStage.get(1).toString().contains("Oui")) {
            radioButtonOuiOpportunite.toggle();
            if (avisStage.get(1).toString().contains("Oui1")) {
                checkboxMaiJuin.toggle();
            } else if (avisStage.get(1).toString().contains("Oui2")) {
                checkboxJanvierFevrier.toggle();
            } else if (avisStage.get(1).toString().contains("Oui3")){
                checkboxMaiJuin.toggle();
                checkboxJanvierFevrier.toggle();
            }
        } else {
            radioButtonNonOpportunite.toggle();
        }

    }
}