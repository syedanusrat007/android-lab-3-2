package com.cse.mist.myprofile;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private EditText etName,etemail,etpass,etphone;
    private TextView tdone;
    private RadioGroup rgBtnGender;
    private RadioButton rBtnMale,rBtnFemale,rBtnOthers;
    private Spinner spspinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        iniui();
    }

    private void iniui() {


        etName = (EditText) findViewById(R.id.etName);
        etemail = (EditText) findViewById(R.id.etemail);
        etpass = (EditText) findViewById(R.id.etpass);
        etphone = (EditText) findViewById(R.id.etphone);
        tdone = (TextView) findViewById(R.id.tdone);
        rgBtnGender=(RadioGroup) findViewById(R.id.rgBtnGender);
        rBtnMale = (RadioButton) findViewById(R.id.rBtnMale);
        rBtnFemale = (RadioButton) findViewById(R.id.rBtnFemale);
        rBtnOthers = (RadioButton) findViewById(R.id.rBtnOthers);
        spspinner=(Spinner) findViewById(R.id.spspinner);

        ArrayList<String> type= new ArrayList<String>();
        type.add("choose a type");
        type.add("Islam");
        type.add("Hindu");
        type.add("Christian");
        type.add("Buddha");
        type.add("other");

        CustomSpinnerAdapter customSpinnerAdapter=new CustomSpinnerAdapter(context,type);
        spspinner.setAdapter(customSpinnerAdapter);

        tdone.setOnClickListener( new View.OnClickListener(){


            @Override
            public void onClick(View v) {



                String name = etName.getText().toString().trim();
                String email = etemail.getText().toString().trim();
                String passWord= etpass.getText().toString().trim();
                String phone= etphone.getText().toString().trim();
                String valueGender = ((RadioButton)findViewById(rgBtnGender.getCheckedRadioButtonId() )).getText().toString();
                String spinnerItem =  spspinner.getItemAtPosition(spspinner.getSelectedItemPosition()).toString();



                Person p = new Person();
                p.setName(name);
                p.setEmail(email);
                p.setPass(passWord);
                p.setPhone(phone);
                p.setGender(valueGender);
                p.setReligion(spinnerItem);

                Intent intent = new Intent(context,RegActivity.class);
                intent.putExtra("personData",p);
                startActivity(intent);
            }
        });

    }



}




