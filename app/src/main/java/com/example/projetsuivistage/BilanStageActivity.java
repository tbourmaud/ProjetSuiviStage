package com.example.projetsuivistage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BilanStageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bilan);

        //Gestion des boutons enregistrer et annuler
        Button btnValider = (Button) findViewById(R.id.btnValiderBilan);
        Button btnAnnuler = (Button) findViewById(R.id.btnAnnulerBilan);


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
                        finish();
                        break;
                }
            }
        };
        btnAnnuler.setOnClickListener(ecouteur);
        btnValider.setOnClickListener(ecouteur);
    }
}