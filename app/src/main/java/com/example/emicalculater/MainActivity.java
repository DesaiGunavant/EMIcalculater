package com.example.emicalculater;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    String data = "", dataA, dataI, dataY, dataM;
    int Year = 0;
    double Loan_Amount, Intrest, AM, IntrestAns, Total, EMI, Divide, IM, IM1, Yearly_EMI, Total_Intrest, Total_payment;
    Button btncalculate, btnreset, btndetail;
    TextView text1, text2, text3, text4, text5, text6, text7, text8, text9, text10, text11, text12, edttext5;
    EditText edttext1, edttext2, edttext3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initBinding();
        initOnClick();

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

    void initOnClick() {
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edttext1.setText("");
                edttext2.setText("");
                edttext3.setText("");
                text9.setText("");
                text10.setText("");
                text11.setText("");
                text12.setText("");
                edttext5.setText("");
            }
        });
        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dataA = edttext1.getText().toString();
                dataI = edttext2.getText().toString();
                dataY = edttext3.getText().toString();
                dataM = edttext3.getText().toString();
                Loan_Amount = Double.parseDouble(dataA);
                Intrest = Double.parseDouble(dataI);
                Year = Integer.parseInt(dataY);

                AM = Year * 12;
                IntrestAns = Intrest / 12 / 100;
                IM = Math.pow(1 + IntrestAns, AM);
                IM1 = Math.pow(1 + IntrestAns, AM) - 1;
                Divide = IM / IM1;
                Total = Loan_Amount * IntrestAns * Divide;
                EMI = Total;

                Yearly_EMI = EMI * 12;
                Total_Intrest = (Loan_Amount * Intrest * Year) / 100;
                Total_payment = Total_Intrest + Loan_Amount;
                edttext5.setText("" +EMI);
            }
            });


                btndetail.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        text9.setText("" + EMI);
                        text10.setText("" + Yearly_EMI);
                        text11.setText("" + Total_Intrest);
                        text12.setText("" + Total_payment);
                    }
                });





    }
}