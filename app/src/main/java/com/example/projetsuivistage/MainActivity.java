package com.example.projetsuivistage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

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


    }
    public void test(){

    }
}

