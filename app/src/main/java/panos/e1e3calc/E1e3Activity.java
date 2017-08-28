package panos.e1e3calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class E1e3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_e1e3);
    }
    public void E3 (View view)
    {
        Intent E3intent = new Intent(this, E3.class);
        startActivity(E3intent);


    }
}
