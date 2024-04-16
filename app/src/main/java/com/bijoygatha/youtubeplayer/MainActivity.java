package com.bijoygatha.youtubeplayer;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    LinearLayout noMusic,noMusic1,noMusic2,noMusic3,noMusic4,noMusic5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        noMusic = findViewById(R.id.noMusic);
        noMusic1 = findViewById(R.id.noMusic1);
        noMusic2 = findViewById(R.id.noMusic2);
        noMusic3 = findViewById(R.id.noMusic3);
        noMusic4 = findViewById(R.id.noMusic4);
        noMusic5 = findViewById(R.id.noMusic5);


        noMusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayerActivity.video_link = "https://www.youtube.com/embed/cw8mkb2HkBw";

                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                startActivity(intent);
            }
        });


        noMusic1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayerActivity.video_link = "https://www.youtube.com/embed/VAvL-rm476c";

                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                startActivity(intent);
            }
        });


        noMusic2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayerActivity.video_link = "https://www.youtube.com/embed/VamZ-Jr8o5o";

                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                startActivity(intent);
            }
        });


        noMusic3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayerActivity.video_link = "https://www.youtube.com/embed/1ECTtkj_7nA";

                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                startActivity(intent);
            }
        });


        noMusic4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayerActivity.video_link = "https://www.youtube.com/embed/Dy4YSBA6P5Q";

                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                startActivity(intent);
            }
        });


        noMusic5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                VideoPlayerActivity.video_link = "https://www.youtube.com/embed/naWQJpsbPFM";

                Intent intent = new Intent(MainActivity.this, VideoPlayerActivity.class);
                startActivity(intent);
            }
        });

    }
}