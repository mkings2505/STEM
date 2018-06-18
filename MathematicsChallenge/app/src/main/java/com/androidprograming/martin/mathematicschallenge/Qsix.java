package com.androidprograming.martin.mathematicschallenge;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Qsix extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_qsix);

        Button advanceToQseven = (Button) findViewById(R.id.btnCorrect6);
        advanceToQseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qsix.this, Qseven.class);
                startActivity(intent);
            }
        });

        Button backToHome = (Button) findViewById(R.id.btnHomeSix);
        backToHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Qsix.this, Home.class);
                startActivity(intent);
            }
        });

        final MediaPlayer buzzer = MediaPlayer.create(this, R.raw.buzzer);

        Button btnWrong61 = (Button) this.findViewById(R.id.btnWrong61);
        btnWrong61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });

        Button btnWrong62 = (Button) this.findViewById(R.id.btnWrong62);
        btnWrong62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                buzzer.start();
            }
        });
    }
}
