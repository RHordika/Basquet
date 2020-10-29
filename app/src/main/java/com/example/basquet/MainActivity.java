package com.example.basquet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;

import com.example.basquet.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    private int score1 = 0;
    private int score2 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        scoring();


        binding.lowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score1 = score1 + 1;
                scoring(); //actualiza la visualización del score

            }
        });

       binding.lowB.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               score2 = score2 + 1;
               scoring();

           }
       });

        binding.midA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score1 = score1 + 2;
                scoring();

            }
        });


        binding.midB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score2 = score2 + 2;
                scoring();

            }
        });

        binding.highA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score1 = score1 + 3;
                scoring();

            }
        });

        binding.highB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                score2 = score2 + 3;
                scoring();

            }
        });



    }

    private void scoring(){

        String scoreMessage = "" + score1;
        binding.scoreA.setText(scoreMessage);

        String scoreMessage2 = "" + score2;
        binding.scoreB.setText(scoreMessage2);

    }

}