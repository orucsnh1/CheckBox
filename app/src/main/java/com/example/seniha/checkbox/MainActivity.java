package com.example.seniha.checkbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button kaydet;
    CheckBox elma,cilek,muz,kivi,portakal,karpuz,ananas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButtonClick();
    }
      /*  elma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Boolean durum=elma.isChecked();

                if (durum == true)
                    kaydet.setEnabled(true);
                else
                    kaydet.setEnabled(false);

            }
        });

        kaydet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "İşleminiz Kaydedildi.", Toast.LENGTH_SHORT).show();
            }
        });

*/

    public void addListenerOnButtonClick() {
        //Getting instance of CheckBoxes and Button from the activty_main.xml file
        kaydet = (Button) findViewById(R.id.button);
        elma = (CheckBox) findViewById(R.id.elma);
        cilek = (CheckBox) findViewById(R.id.cilek);
        kivi = (CheckBox) findViewById(R.id.kivi);
        portakal = (CheckBox) findViewById(R.id.portakal);
        karpuz = (CheckBox) findViewById(R.id.karpuz);
        ananas = (CheckBox) findViewById(R.id.ananas);
        muz = (CheckBox) findViewById(R.id.muz);
        kaydet.setEnabled(true);
        //Applying the Listener on the Button click
        kaydet.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                if (elma.isChecked()) {
                    result.append("Elma ");
                }
                if (cilek.isChecked()) {
                    result.append("Çilek ");
                }
                if (kivi.isChecked()) {
                    result.append("Kivi ");
                }
                if (portakal.isChecked()) {
                    result.append("Portakal ");
                }
                if (karpuz.isChecked()) {
                    result.append("Karpuz ");
                }
                if (ananas.isChecked()) {
                    result.append("Ananas ");
                }
                if (muz.isChecked()) {
                    result.append("Muz ");
                }
                result.append("\nSeçildi");

                Toast.makeText(getApplicationContext(), result.toString(), Toast.LENGTH_LONG).show();
            }

        });
    }
}


