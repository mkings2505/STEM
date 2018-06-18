package com.androidprograming.martin.mathematicschallenge;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Qten extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_qten);

        Button advanceToEnd = (Button) findViewById(R.id.btnCorrect10);
        advanceToEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qten.this, End.class);
                startActivity(intent);
            }
        });

        Button backHome = (Button) findViewById(R.id.btnHomeTen);
        backHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qten.this, Home.class);
                startActivity(intent);
            }
        });

        final MediaPlayer buzzer = MediaPlayer.create(this, R.raw.buzzer);

        Button btnWrong101 = (Button) this.findViewById(R.id.btnWrong101);
        btnWrong101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });

        Button btnWrong102 = (Button) this.findViewById(R.id.btnWrong102);
        btnWrong102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });
    }
}
