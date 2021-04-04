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
    MediaPlayer player;
    MediaPlayer player1;

    public void move1(View view) {
        player.stop();
        player=null;
        if(player==null)
        {
            player=MediaPlayer.create(this,R.raw.start);

        }
        player.start();
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        player=MediaPlayer.create(this, raw.coco);
        player.start();


    }

        public void move3 (View view){
            player=MediaPlayer.create(this, raw.coco);
            player.start();
            Intent intent = new Intent(this, MainActivity2.class);
            startActivity(intent);
        }

    }

