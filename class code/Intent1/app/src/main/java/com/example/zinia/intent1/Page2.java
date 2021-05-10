package com.example.zinia.intent1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    TextView tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        tx2 = (TextView) findViewById(R.id.textView2);

        Intent j = getIntent();
        String val = j.getStringExtra("nameID2");
        tx2.setText(val);



    }
}
