package panos.e1e3calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static panos.e1e3calc.R.id.d1;
import static panos.e1e3calc.R.id.d2;

public class E3 extends AppCompatActivity {
    int d8 = 0;

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
//Kataxwrisi timwn se metablites
    private int kataxwrisi(View view) {
        //Gets the values
        EditText d1 = (EditText) findViewById(R.id.d1);
        Integer Calcd1 = Integer.parseInt(d1.getText().toString());
        EditText d2 = (EditText) findViewById(R.id.d2);
        Integer Calcd2 = Integer.parseInt(d1.getText().toString());

        d8 = Calcd1+Calcd2;

    return d8;
    }


    private void displaySumd8(int kataxwrisi) {
        TextView Sum = (TextView) findViewById(R.id.d8);
        Sum.setText(kataxwrisi);
    }
}
