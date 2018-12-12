package example.android.schatze.com.currencyconverter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Convert(View view) {
        EditText amountDollars = findViewById(R.id.etAmount);
        Double dollars = Double.parseDouble(amountDollars.getText().toString());
        Double kenya = dollars * 102.45;
        Toast.makeText(MainActivity.this,"Kshs." + String.format("%.2f", kenya),Toast.LENGTH_SHORT).show();
    }
}
