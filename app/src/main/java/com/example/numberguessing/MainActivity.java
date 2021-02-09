package com.example.numberguessing;

import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView mainTv;
    String textchange;
    int result;
    Button btnOK, btnYES, btnNO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainTv = (TextView) findViewById(R.id.MaintextView);
        btnOK = (Button) findViewById(R.id.OKbutton);
        btnYES = (Button) findViewById(R.id.buttonYES);
        btnNO = (Button) findViewById(R.id.buttonNO);
        btnYES.setVisibility(View.INVISIBLE);
        btnNO.setVisibility(View.INVISIBLE);
        textchange = getString(R.string.tv);
        mainTv.setText(textchange);


        btnOK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnOK.setVisibility(View.GONE);
                btnYES.setVisibility(View.VISIBLE);
                btnNO.setVisibility(View.VISIBLE);
                textchange = getString(R.string.card1);
                mainTv.setText(textchange);

            }
        });



    }

}