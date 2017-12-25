package com.example.becks.schiffeversenken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.ToggleButton;

public class SettingsActivity extends AppCompatActivity {

    private Switch sSound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        InitializeActivity();
    }

    private void InitializeActivity() {
        sSound = (Switch) findViewById(R.id.switchSound);

        sSound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SoundClicked();
            }
        });
    }

    private void SoundClicked () {

    }


}
