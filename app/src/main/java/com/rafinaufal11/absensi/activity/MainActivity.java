package com.rafinaufal11.absensi.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rafinaufal11.absensi.R;

public class MainActivity extends AppCompatActivity {

    private Button scan, daftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scan = findViewById(R.id.btn_scan);

        daftar = findViewById(R.id.btn_daftar);

        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Ketika tombol scan di tekan apa yang terjadi
                //Ke halaman scan
                startActivity(new Intent(MainActivity.this, ScanActivity.class));
            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Ketika tombol daftar di tekan apa yang terjadi
                //Ke Halaman Daftar Hadir
                startActivity(new Intent(MainActivity.this, DaftarActivity.class));

            }
        });


    }
}