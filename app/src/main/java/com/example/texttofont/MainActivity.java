package com.example.texttofont;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceView;
import android.widget.Toast;

import com.lucem.anb.characterscanner.Scanner;
import com.lucem.anb.characterscanner.ScannerListener;
import com.lucem.anb.characterscanner.ScannerView;
import com.mapzen.speakerbox.Speakerbox;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SurfaceView surfaceView = findViewById(R.id.surface);

        Speakerbox speakerbox = new Speakerbox(getApplication());

        Scanner scanner = new Scanner(this, surfaceView, new ScannerListener() {
            @Override
            public void onDetected(String s) {
                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
                Speakerbox speakerbox = new Speakerbox(getApplication());
                speakerbox.play(s);
            }

            @Override
            public void onStateChanged(String s, int i) {

            }
        });
    }


}