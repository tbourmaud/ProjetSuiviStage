package com.example.projetsuivistage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AvisStageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avis);

        //Gestion des boutons enregistrer et annuler
        Button btnValider = (Button) findViewById(R.id.btnValiderAvis);
        Button btnAnnuler = (Button) findViewById(R.id.btnAnnulerAvis);


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
    }
}