package com.store.atozcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    int counter=0;
    ProgressBar pb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        pb=findViewById(R.id.progressBar2);

        final Timer t=new Timer();
        TimerTask tt=new TimerTask() {
            @Override
            public void run() {
                counter++;

                pb.setProgress(counter);

                if(counter==100)
                {
                    Intent hh=new Intent(splash.this,MainActivity.class);
                    startActivity(hh);
                }
                else
                {

                }

            }
        };
        t.schedule(tt,0,20);

    }
}
