package com.example.projetsuivistage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationStageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_stagiaire);

        //Gestion des boutons enregistrer et annuler
        Button btnValider = (Button) findViewById(R.id.btnValiderInfoStagiaire);
        Button btnAnnuler = (Button) findViewById(R.id.btnAnnulerInfoStagiaire);


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
    }
}