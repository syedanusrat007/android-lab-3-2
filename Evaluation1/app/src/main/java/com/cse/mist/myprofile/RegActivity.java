package com.cse.mist.myprofile;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RegActivity extends AppCompatActivity {
    private Context context;
    private TextView tout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);
        context=this;
        iniui();
    }

    private void iniui() {
      tout=(TextView)findViewById(R.id.tout);
        Intent intent = getIntent();
        Person pdata= (Person)intent.getSerializableExtra("personData");

        tout.setText("Name: "+pdata.getName()+"\n Email: "+pdata.getEmail()+"\n Password: "+pdata.getPass()+
                "\n phone: "+pdata.getPhone() +"\n Gender: "+pdata.getGender()+"\n Religion: "+pdata.getReligion());

    }
}
