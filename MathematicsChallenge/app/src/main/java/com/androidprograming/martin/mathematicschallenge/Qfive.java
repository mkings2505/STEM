package com.androidprograming.martin.mathematicschallenge;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Qfive extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_qfive);

        Button advanceToQsix = (Button) findViewById(R.id.btnCorrect5);
        advanceToQsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qfive.this, Qsix.class);
                startActivity(intent);
            }
        });

        Button backToHome = (Button) findViewById(R.id.btnHomeFive);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qfive.this, Home.class);
                startActivity(intent);
            }
        });

        final MediaPlayer buzzer = MediaPlayer.create(this, R.raw.buzzer);

        Button btnWrong51 = (Button) this.findViewById(R.id.btnWrong51);
        btnWrong51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });

        Button btnWrong52 = (Button) this.findViewById(R.id.btnWrong52);
        btnWrong52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });
    }
}
