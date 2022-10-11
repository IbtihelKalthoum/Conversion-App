package com.example.conversionapp;

/* import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ConversionTemperatureActivity extends AppCompatActivity {

    RadioButton CelciusToFarenheit , FarenheitToCelcius ;
    EditText entree;
    TextView sortie ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_temperature);

        entree = (EditText) findViewById(R.id.temperature);
        sortie = (TextView) findViewById(R.id.resultat);

        CelciusToFarenheit = (RadioButton) findViewById(R.id.conv1);
        FarenheitToCelcius = (RadioButton) findViewById(R.id.conv2);

        CelciusToFarenheit.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                v.showContextMenu();
                return false;
            }
        });

        FarenheitToCelcius.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                v.showContextMenu();
                return false;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Conversion E <-> D");
        menu.add(0, 2, 0, "Quitter");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Intent i = new Intent(ConversionTemperatureActivity.this,MainActivity.class);
                startActivity(i);
                break;
            case 2:
                this.finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


    public void convertir(View v) {

        if (entree.getText().toString().equals("")) {
            AlertDialog alertDialog;
            alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Un champ incorrect");
            alertDialog
                    .setMessage("Il faut insérer le temperature à convertir !!");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();

                }
            });
            alertDialog.show();


        } else {
            float valeurInitiale = Float.valueOf(entree.getText().toString());

            float resultat;
            if (CelciusToFarenheit.isChecked()) {
                resultat = CelciusToFarenheit(valeurInitiale);
            } else {
                resultat = FarenheitToCelcius(valeurInitiale);
            }

            sortie.setText(String.valueOf(resultat));
        }
    }

    private float CelciusToFarenheit(float valeurCelcius) {
        return (float) (9/5)*valeurCelcius + 32;
    }

    private float FarenheitToCelcius(float valeurFarenheit) {
        return (float) (5/9)*(valeurFarenheit - 32);
    }
} */
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class ConversionTemperatureActivity extends AppCompatActivity {

    RadioButton CelciusToFarenheit , FarenheitToCelcius ;
    EditText entree;
    TextView sortie ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversion_temperature);

        entree = (EditText) findViewById(R.id.temperature);
        sortie = (TextView) findViewById(R.id.resultat);

        CelciusToFarenheit = (RadioButton) findViewById(R.id.conv1);
        FarenheitToCelcius = (RadioButton) findViewById(R.id.conv2);

        CelciusToFarenheit.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                v.showContextMenu();
                return false;
            }
        });

        FarenheitToCelcius.setOnLongClickListener(new View.OnLongClickListener() {

            @Override
            public boolean onLongClick(View v) {
                v.showContextMenu();
                return false;
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, "Conversion E <-> D");
        menu.add(0, 2, 0, "Quitter");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case 1:
                Intent i = new Intent(ConversionTemperatureActivity.this,MainActivity.class);
                startActivity(i);
                break;
            case 2:
                this.finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }


    public void convertir(View v) {

        if (entree.getText().toString().equals("")) {
            AlertDialog alertDialog;
            alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Un champ incorrect");
            alertDialog
                    .setMessage("Il faut insérer le temperature à convertir !!");
            alertDialog.setButton("OK", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.dismiss();

                }
            });
            alertDialog.show();


        } else {
            float valeurInitiale = Float.valueOf(entree.getText().toString());

            float resultat;
            if (CelciusToFarenheit.isChecked()) {
                resultat = CelciusToFarenheit(valeurInitiale);
            } else {
                resultat = FarenheitToCelcius(valeurInitiale);
            }

            sortie.setText(String.valueOf(resultat));
        }
    }

    private float CelciusToFarenheit(float valeurCelcius) {
        return (float) (9/5)*valeurCelcius + 32;
    }

    private float FarenheitToCelcius(float valeurFarenheit) {
        return (float) (5/9)*(valeurFarenheit - 32);
    }
}