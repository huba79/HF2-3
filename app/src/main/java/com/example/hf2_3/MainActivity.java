package com.example.hf2_3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView cimke;
    EditText szovegmezo;
    CheckBox csekk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cimke = findViewById(R.id.textView);
        szovegmezo = findViewById(R.id.editTextTextMultiLine);
        szovegmezo.setBackgroundColor(15);
        csekk = findViewById(R.id.checkBox);


        if (savedInstanceState == null) {
            Log.d("Info:", "onCreate() method was invoked WITHOUT a previous state");
        } else {
            //todo
            Log.d("Info:", "onCreate() method was invoked WITH a previous state");


        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
       outState.putString("Szoveg",szovegmezo.getText().toString());
        outState.putString("Beleegyezes",String.valueOf(csekk.isChecked()) );
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        szovegmezo.setText( savedInstanceState.getString("Szoveg") );
        csekk.setChecked( Boolean.valueOf(savedInstanceState.getString("Beleegyezes")) );
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Info::", "Esemény: onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Info::", "Esemény: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Info::", "Esemény: onDestroy()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Info::", "Esemény: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Info::", "Esemény: onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Info::",  "Esemény: onRestart()");
    }

}