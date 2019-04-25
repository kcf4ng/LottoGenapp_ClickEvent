package com.example.lottogenapp_clickevent;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InitialComponent();
    }


    @Override
    public void onClick(View v) {
        x.setText(new CLottoGen().GetLotto());
    }

    private void InitialComponent() {
        x = findViewById(R.id.lblHello);
        btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(this);
    }


    TextView x;
    Button btnOK;

}