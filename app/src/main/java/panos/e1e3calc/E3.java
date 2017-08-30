package panos.e1e3calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static panos.e1e3calc.R.id.d1;
import static panos.e1e3calc.R.id.d2;
import static panos.e1e3calc.R.id.d3;
import static panos.e1e3calc.R.id.d4;
import static panos.e1e3calc.R.id.d5;
import static panos.e1e3calc.R.id.d6;
import static panos.e1e3calc.R.id.d7;
import static panos.e1e3calc.R.id.da8;

public class E3 extends AppCompatActivity {
    int d8 = 0;
    int da8 = 0;
    int db8 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e3);
    }

    public void E3B (View view)
    {
        Intent e3bIintent = new Intent(this, E3B.class);
        startActivity(e3bIintent);



    }
//Καταχώρηση τιμών για το δ)
    public void displaySumd8(View view) {
        try {
            EditText d1 = (EditText) findViewById(R.id.d1);
            int Calcd1 = Integer.parseInt(d1.getText().toString());
            EditText d2 = (EditText) findViewById(R.id.d2);
            int Calcd2 = Integer.parseInt(d2.getText().toString());
            EditText d3 = (EditText) findViewById(R.id.d3);
            int Calcd3 = Integer.parseInt(d3.getText().toString());
            EditText d4 = (EditText) findViewById(R.id.d4);
            int Calcd4 = Integer.parseInt(d4.getText().toString());
            EditText d5 = (EditText) findViewById(R.id.d5);
            int Calcd5 = Integer.parseInt(d5.getText().toString());
            EditText d6 = (EditText) findViewById(R.id.d6);
            int Calcd6 = Integer.parseInt(d6.getText().toString());
            EditText d7 = (EditText) findViewById(R.id.d7);
            int Calcd7 = Integer.parseInt(d7.getText().toString());
            Button Sum = (Button) findViewById(R.id.d8);
            d8 = Calcd1 + Calcd2 + Calcd3 + Calcd4 + Calcd5 + Calcd6 + Calcd7;
            Sum.setText("Σύνολο δαπανών = " + String.valueOf(d8));
        }
        catch (java.lang.NumberFormatException e) {
            Toast.makeText(E3.this, "Tα κενά πεδία πρέπει να περιέχουν το 0", Toast.LENGTH_SHORT).show();
            Button Sum = (Button) findViewById(R.id.d8);
            Sum.setText("Σύνολο δαπανών");
        }
    }
    //Καταχώρηση τιμών για το δα)
    public void displaySumda8(View view) {
        try {
            EditText da1 = (EditText) findViewById(R.id.da1);
            int Calcda1 = Integer.parseInt(da1.getText().toString());
            EditText da2 = (EditText) findViewById(R.id.da2);
            int Calcda2 = Integer.parseInt(da2.getText().toString());
            EditText da3 = (EditText) findViewById(R.id.da3);
            int Calcda3 = Integer.parseInt(da3.getText().toString());
            EditText da4 = (EditText) findViewById(R.id.da4);
            int Calcda4 = Integer.parseInt(da4.getText().toString());
            EditText da5 = (EditText) findViewById(R.id.da5);
            int Calcda5 = Integer.parseInt(da5.getText().toString());
            EditText da6 = (EditText) findViewById(R.id.da6);
            int Calcda6 = Integer.parseInt(da6.getText().toString());
            EditText da7 = (EditText) findViewById(R.id.da7);
            int Calcda7 = Integer.parseInt(da7.getText().toString());
            Button Sum = (Button) findViewById(R.id.da8);
            da8 = Calcda1 + Calcda2 + Calcda3 + Calcda4 + Calcda5 + Calcda6 + Calcda7;
            Sum.setText("Σύνολο δαπανών = " + String.valueOf(da8));
        }
        catch (java.lang.NumberFormatException e) {
            Toast.makeText(E3.this, "Tα κενά πεδία πρέπει να περιέχουν το 0", Toast.LENGTH_SHORT).show();
            Button Sum = (Button) findViewById(R.id.da8);
            Sum.setText("Σύνολο δαπανών");
        }
    }
    //Καταχώρηση τιμών για το δβ)
    public void displaySumdb8(View view) {
        try {
            EditText db1 = (EditText) findViewById(R.id.db1);
            int Calcdb1 = Integer.parseInt(db1.getText().toString());
            EditText db2 = (EditText) findViewById(R.id.db2);
            int Calcdb2 = Integer.parseInt(db2.getText().toString());
            EditText db3 = (EditText) findViewById(R.id.db3);
            int Calcdb3 = Integer.parseInt(db3.getText().toString());
            EditText db4 = (EditText) findViewById(R.id.db4);
            int Calcdb4 = Integer.parseInt(db4.getText().toString());
            EditText db5 = (EditText) findViewById(R.id.db5);
            int Calcdb5 = Integer.parseInt(db5.getText().toString());
            EditText db6 = (EditText) findViewById(R.id.db6);
            int Calcdb6 = Integer.parseInt(db6.getText().toString());
            EditText db7 = (EditText) findViewById(R.id.db7);
            int Calcdb7 = Integer.parseInt(db7.getText().toString());
            Button Sum = (Button) findViewById(R.id.db8);
            db8 = Calcdb1 + Calcdb2 + Calcdb3 + Calcdb4 + Calcdb5 + Calcdb6 + Calcdb7;
            Sum.setText("Σύνολο δαπανών = " + String.valueOf(db8));
        }
        catch (java.lang.NumberFormatException e) {
            Toast.makeText(E3.this, "Tα κενά πεδία πρέπει να περιέχουν το 0", Toast.LENGTH_SHORT).show();
            Button Sum = (Button) findViewById(R.id.db8);
            Sum.setText("Σύνολο δαπανών");
        }
    }

}
