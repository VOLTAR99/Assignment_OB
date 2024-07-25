package com.example.assignment_onebanc;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        videoView = findViewById(R.id.videoView);
        Uri video = Uri.parse("android.resource://"+ getPackageName()+"/"+R.raw.splash_vid);
        videoView.setVideoURI(video);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                startNextActivity();



            }
        });
        videoView.start();

    }

    private void startNextActivity() {
        if(isFinishing())
            return;
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
    }


}