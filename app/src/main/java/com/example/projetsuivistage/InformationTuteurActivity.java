package com.example.projetsuivistage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class InformationTuteurActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_tuteur);

        //Gestion des boutons enregistrer et annuler
        Button btnValider = (Button) findViewById(R.id.btnValiderInfoTuteur);
        Button btnAnnuler = (Button) findViewById(R.id.btnAnnulerInfoTuteur);


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
                        Intent intent = new Intent(InformationTuteurActivity.this, InformationTuteurActivity.class); // Changer en BilanStageActivity
                        startActivity(intent);
                        finish();
                        break;
                }
            }
        };
        btnAnnuler.setOnClickListener(ecouteur);
        btnValider.setOnClickListener(ecouteur);
    }
}