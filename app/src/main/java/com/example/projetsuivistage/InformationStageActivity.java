package com.example.projetsuivistage;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import java.util.List;

public class InformationStageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_stagiaire);

        //Gestion des boutons enregistrer et annuler
        Button btnValider = (Button) findViewById(R.id.btnValiderInfoStagiaire);
        Button btnAnnuler = (Button) findViewById(R.id.btnAnnulerInfoStagiaire);

        // Gestion des cases des cases EditText
        EditText nomEleve = findViewById(R.id.editNomStg);
        EditText prenomEleve = findViewById(R.id.editPrenomStg);

        // Désactive la modification des cases
        nomEleve.setEnabled(false);
        prenomEleve.setEnabled(false);

        // Gestion des boutons radios
        RadioButton radioButtonSlam = findViewById(R.id.radioButtonSlam);
        RadioButton radioButtonSisr = findViewById(R.id.radioButtonSisr);

        // SharedPreferences
        final SharedPreferences pref = getApplicationContext().getSharedPreferences("MyPref", 0); // 0 - for private mode
        SharedPreferences.Editor editor = pref.edit();

        //on va créer un écouteur pour un groupe de boutons
        View.OnClickListener ecouteur = new View.OnClickListener() {
            //on implémente la méthode onclick
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnAnnulerInfoStagiaire:
                        finish();
                        break;
                    case R.id.btnValiderInfoStagiaire:
                        Intent intent = new Intent(InformationStageActivity.this, InformationTuteurActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        btnAnnuler.setOnClickListener(ecouteur);
        btnValider.setOnClickListener(ecouteur);

        // Récupère l'élève depuis SharedPreferences
        String unEleve = pref.getString("unEleve", null);
        //Toast.makeText(InformationStageActivity.this, unEleve, Toast.LENGTH_SHORT).show();

        // Récupère les infos de l'élève depuis la bdd
        final DAOBdd daoBdd = new DAOBdd(this);
        daoBdd.open();
        List infoEleve = daoBdd.getEleveByPrenom(unEleve);
        daoBdd.close();

        // Rempli les informations de l'élève
        //Toast.makeText(InformationStageActivity.this, infoEleve.toString(), Toast.LENGTH_SHORT).show();
        nomEleve.setText(infoEleve.get(0).toString());
        prenomEleve.setText(infoEleve.get(1).toString());
        Toast.makeText(InformationStageActivity.this, infoEleve.get(2).toString(), Toast.LENGTH_SHORT).show();
        // Active le bouton radio en fonction de l'option de l'élève
        if (infoEleve.get(2).toString().contains("SLAM")) {
            radioButtonSlam.toggle();
        } else {
            radioButtonSisr.toggle();
        }





    }

}