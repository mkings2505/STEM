package com.androidprograming.martin.mathematicschallenge;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Qthree extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_qthree);

        Button advanceToQfour = (Button) findViewById(R.id.btnCorrect3);
        advanceToQfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qthree.this, Qfour.class);
                startActivity(intent);
            }
        });

        Button backToHome = (Button) findViewById(R.id.btnHomeThree);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qthree.this, Home.class);
                startActivity(intent);
            }
        });

        final MediaPlayer buzzer = MediaPlayer.create(this, R.raw.buzzer);

        Button btnWrong31 = (Button) this.findViewById(R.id.btnWrong31);
        btnWrong31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });

        Button btnWrong32 = (Button) this.findViewById(R.id.btnWrong32);
        btnWrong32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });
    }
}
