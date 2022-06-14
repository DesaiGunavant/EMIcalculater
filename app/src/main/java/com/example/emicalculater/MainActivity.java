package com.example.emicalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    String data = "";
    Button btncalculate, btnreset, btndetail;
    TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12;
    EditText edttext1, edttext2, edttext3, edttext4, edttext5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
        initOnClick();
        calculate();

    }

    void initBinding() {
        btncalculate = findViewById(R.id.btncalculate);
        btnreset = findViewById(R.id.btnreset);
        btndetail = findViewById(R.id.btndetail);
        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        text3 = findViewById(R.id.text3);
        text4 = findViewById(R.id.text4);
        edttext1 = findViewById(R.id.edttext1);
        edttext2 = findViewById(R.id.edttext2);
        edttext3 = findViewById(R.id.edttext3);
        edttext4 = findViewById(R.id.edttext4);
        edttext5 = findViewById(R.id.edttext5);
        text5 = findViewById(R.id.text5);
        text6 = findViewById(R.id.text6);
        text7 = findViewById(R.id.text7);
        text8 = findViewById(R.id.text8);
        text9 = findViewById(R.id.text9);
        text10 = findViewById(R.id.text10);
        text11 = findViewById(R.id.text11);
        text12 = findViewById(R.id.text12);

    }

    void initOnClick()

    {
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttext1.setText("");
                edttext2.setText("");
                edttext3.setText("");
                edttext4.setText("");
            }
        });

    }
    void calculate()
    {
        int a;
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




            }
        });
    }


}