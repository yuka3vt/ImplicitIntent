package com.yuka3vt.implicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tampilTelepon(View view){
        Intent buka = new Intent(Intent.ACTION_DIAL);
        startActivity(buka);
    }
    public void tampilSms(View view){
        Intent buka = new Intent(Intent.ACTION_MAIN);
        buka.addCategory(Intent.CATEGORY_APP_MESSAGING);
        startActivity(buka);
    }
    public void tampilKalender(View view){
        Intent buka = new Intent(Intent.ACTION_MAIN);
        buka.addCategory(Intent.CATEGORY_APP_CALENDAR);
        startActivity(buka);
    }
    public void tampilBrowser(View view){
        Intent buka = new Intent(Intent.ACTION_MAIN);
        buka.addCategory(Intent.CATEGORY_APP_BROWSER);
        startActivity(buka);
    }
    public void tampilKalkulator(View view){
        try {
            Intent buka = new Intent(Intent.ACTION_MAIN);
            buka.addCategory(Intent.CATEGORY_LAUNCHER);

            ComponentName cn = new ComponentName("com.android.calculator2","com.android.calculator2.Calculator");
            buka.setComponent(cn);

            startActivity(buka);
        }catch (ActivityNotFoundException anfe){
            Toast.makeText(getApplicationContext(), "Aplikasi Tidak ditemukan", Toast.LENGTH_SHORT).show();
        }

    }
    public void tampilKontak(View view){
        Intent buka = new Intent(Intent.ACTION_MAIN);
        buka.addCategory(Intent.CATEGORY_APP_CONTACTS);
        startActivity(buka);
    }
    public void tampilGaleri(View view){
        Intent buka = new Intent(Intent.ACTION_MAIN);
        buka.addCategory(Intent.CATEGORY_APP_GALLERY);
        startActivity(buka);
    }
    public void tampilWifi(View view){
        Intent buka = new Intent(Settings.ACTION_WIFI_SETTINGS);
        startActivity(buka);
    }
    public void tampilSound(View view){
        Intent buka = new Intent(Settings.ACTION_SOUND_SETTINGS);
        startActivity(buka);
    }
    public void tampilAirplane(View view){
        Intent buka = new Intent(Settings.ACTION_AIRPLANE_MODE_SETTINGS);
        startActivity(buka);
    }
    public void tampilAplikasi(View view){
        Intent buka = new Intent(Settings.ACTION_APPLICATION_SETTINGS);
        startActivity(buka);
    }
    public void tampilBluetooth(View view){
        Intent buka = new Intent(Settings.ACTION_BLUETOOTH_SETTINGS);
        startActivity(buka);
    }




}