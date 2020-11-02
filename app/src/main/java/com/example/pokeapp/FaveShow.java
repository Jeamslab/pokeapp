package com.example.pokeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

import java.util.Locale;

public class FaveShow extends AppCompatActivity {

    ImageButton btnfave;
    private int i = 0;
   // private String name = "";
    ViewGroup cardView;



    @Override
    protected void onResume() {
        super.onResume();
        clickHeart();
    }



    private void clickHeart(){
        cardView = (ViewGroup) findViewById(R.id.hype);

        btnfave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i == 0){
                    btnfave.setImageResource(R.mipmap.filledhe);
                    Snackbar.make(cardView,
                            String.format(Locale.getDefault(),
                                    "Has agregado %s a favoritos.", btnfave
                            ),
                            Snackbar.LENGTH_LONG
                    ).show();
                    i=1;
                    return;
                } else if(i == 1){
                    btnfave.setImageResource(R.mipmap.emptyh);
                    Snackbar.make(cardView,
                            String.format(Locale.getDefault(),
                                    "Has eliminado %s de favoritos.", btnfave
                            ),
                            Snackbar.LENGTH_LONG
                    ).show();
                    i=0;
                    return;
                }
            }
        });
    }


    }
