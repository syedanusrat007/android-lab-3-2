package com.cse.mist.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by Tonni on 15/07/2017.
 */

public class page2 extends AppCompatActivity {

    TextView tx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        tx2 = (TextView) findViewById(R.id.textView2);

        Intent j = getIntent();
        String val = j.getStringExtra("nameID1");
        tx2.setText(val);



    }
}
