package com.example.asheransari.prototype;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private TextView name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        name = (TextView)findViewById(R.id.conpany_name);

        Typeface face = null;
        face = Typeface.createFromAsset(this.getAssets(), "font/font_bold.ttf");
        name.setTypeface(face);

        Thread timer = new Thread() {
            @Override
            public void run() {
                try {
                    Log.e("Launching try", "Launched");
                    sleep(3000);
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            /*visibleComponent();*/
                        }
                    });
                } catch (Exception e) {
                    Log.e("Launching Exception", "Launched");
                    e.printStackTrace();
                }
                finally {
                    Intent i = new Intent(Splash.this,MainActivity.class);
                    startActivity(i);
                    finish();
                }

            }
        };
        timer.start();

    }
}
