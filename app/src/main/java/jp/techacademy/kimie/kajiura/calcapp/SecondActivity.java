package jp.techacademy.kimie.kajiura.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import java.io.*;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

            Intent intent = getIntent();
            double value1 = intent.getDoubleExtra("VALUE", 0);

            TextView textView = (TextView) findViewById(R.id.textView);
            textView.setText(Double.toString(value1));
    }
}
