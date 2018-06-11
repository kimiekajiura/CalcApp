package jp.techacademy.kimie.kajiura.calcapp;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.LinearLayout;

import java.io.*;
import java.lang.Exception;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 =(Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 =(Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 =(Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 =(Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v){

        Intent intent = new Intent(this,SecondActivity.class);
        try {
            EditText editText1 = (EditText) findViewById(R.id.editText1);
            EditText editText2 = (EditText) findViewById(R.id.editText2);
            //editText1.getText().toString()：EditText1,2に入っている値を取りに行く
            //String value1 = editText1.getText().toString();
            double value1 = Double.parseDouble(editText1.getText().toString());
            double value2 = Double.parseDouble(editText2.getText().toString());

                if (v.getId() == R.id.button1) {
                    intent.putExtra("VALUE", value1 + value2);
                } else if (v.getId() == R.id.button2) {
                    intent.putExtra("VALUE", value1 - value2);
                } else if (v.getId() == R.id.button3) {
                    intent.putExtra("VALUE", value1 * value2);
                } else if (v.getId() == R.id.button4) {
                    intent.putExtra("VALUE", value1 / value2);
                }
                startActivity(intent);
                //Exception：どんなエラーにも利用可能
            }catch (Exception e) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.relativeLayout);
            Snackbar.make(linearLayout,"SnackBar",Snackbar.LENGTH_SHORT)
                    .setAction("値を入力してください", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Log.d("UI_PARTS",String.valueOf("error"));
                        }
                    }).show();

            }
    }
}


