package com.androidprograming.martin.mathematicschallenge;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Qfour extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_qfour);

        Button advanceToQfive = (Button) findViewById(R.id.btnCorrect4);
        advanceToQfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qfour.this, Qfive.class);
                startActivity(intent);
            }
        });

        Button backToHome = (Button) findViewById(R.id.btnHomeFour);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qfour.this, Home.class);
                startActivity(intent);
            }
        });

        final MediaPlayer buzzer = MediaPlayer.create(this, R.raw.buzzer);

        Button btnWrong41 = (Button) this.findViewById(R.id.btnWrong41);
        btnWrong41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });

        Button btnWrong42 = (Button) this.findViewById(R.id.btnWrong42);
        btnWrong42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });
    }
}
