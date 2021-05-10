package com.cse.mist.prili;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private TextView tvRegBtn,tvRegBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        intUi();


    }

    private void intUi() {

        tvRegBtn = (TextView) findViewById(R.id.tvRegBtn);
        tvRegBtn1 = (TextView) findViewById(R.id.tvRegBtn1);


        tvRegBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, Main2Activity.class);
                startActivity(intent);
            }
        });


        tvRegBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(context, Main3Activity.class);
                startActivity(intent1);
            }
        });

    }
}
