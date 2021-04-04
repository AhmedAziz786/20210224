package com.example.animations;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import static com.example.animations.R.*;

public class MainActivity extends AppCompatActivity {
    public void move1(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

    private Button start;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
       start=findViewById(id.start);
        final MediaPlayer mediaPlayer=MediaPlayer.create(this, raw.start);

        start.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                mediaPlayer.start();


            }

        });
    }





    public void move3(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }

}

