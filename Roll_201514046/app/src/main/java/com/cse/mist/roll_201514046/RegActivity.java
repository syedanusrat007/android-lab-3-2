package com.cse.mist.roll_201514046;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;


public class RegActivity extends AppCompatActivity {
    private Context context;
    private TextView tout, tbtn;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        //context=this;
        tout = (TextView) findViewById(R.id.tout);
        Intent intent = getIntent();
        //Person pdata= (Person)intent.getSerializableExtra("personData");

        /*tout.setText("Reciept for  "+pdata.getName()+"\n Item list "+pdata.getMeat()+"\n "+
                pdata.getFruit()+"\n Payment will be done by using( "+pdata.getItem() +")");

        tbtn.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                Intent intent = new Intent(RegActivity.this,MainActivity.class);

                startActivity(intent);
            }
        });

    }*/


    }

}