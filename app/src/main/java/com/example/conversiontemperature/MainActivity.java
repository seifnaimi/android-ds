package com.example.conversiontemperature;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.*;
public class MainActivity extends AppCompatActivity {

    private Button celafar, faracel;
    private TextView result;
    private EditText enterTemp;
    double result0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        celafar = findViewById(R.id.celafar);
        faracel = findViewById(R.id.faracel);
        result = findViewById(R.id.result);
        enterTemp = findViewById(R.id.enterTemp);

        celafar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = Math.round((temp * 1.8) + 32);
                result.setText(String.valueOf(result0)+"F");
            }
        });
        faracel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double temp = Double.parseDouble(enterTemp.getText().toString());
                result0 = Math.round((temp - 32) / 1.8);
                result.setText(String.valueOf(result0)+"C");
            }
        });
    }
}