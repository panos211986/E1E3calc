package panos.e1e3calc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void E1Activity (View view) {
        Intent E1intent = new Intent(this, E1Activity.class);
        startActivity(E1intent);

    }
    public void E1e3Activity (View view) {
        Intent E3intent = new Intent(this, E1e3Activity.class);
        startActivity(E3intent);


    }

}
