package com.example.becks.schiffeversenken;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StartScreenActivity extends AppCompatActivity {
// neu eingefügt: background music
    private MediaPlayer mpBackground;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        InitializeActivity();
    }

    public void startSettings(View view) {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }

    public void startHistory (View view) {
        Intent intent = new Intent(this, HistoryTabbedActivity.class);
        startActivity(intent);
    }

    private void InitializeActivity (){
        mpBackground = MediaPlayer.create(this, R.raw.reggae_feeling_terrasound_de);
        PlaybackBrackground();
    }

    private void PlaybackBrackground () {
        mpBackground.start();
        mpBackground.setLooping(true);
    }
}
