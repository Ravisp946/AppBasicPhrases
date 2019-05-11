package com.example.asus.appbasicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    public void onClick(View view)
    {
        Button onpressed=(Button)view;

        Log.i("This Button is Pressed",onpressed.getTag().toString());
        String name=onpressed.getTag().toString();
        mediaPlayer=MediaPlayer.create(this, getResources().getIdentifier(name, "raw", getPackageName()));
        mediaPlayer.start();

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
