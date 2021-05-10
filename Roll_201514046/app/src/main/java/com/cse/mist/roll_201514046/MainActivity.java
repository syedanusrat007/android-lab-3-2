package com.cse.mist.roll_201514046;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private EditText etName;
    private TextView  tproceed ;
    private RadioGroup rgBtnpaysys;
    private RadioButton rBtndelvr,rBtnpay;
    private Spinner spspinner1,spspinner2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=this;
        iniui();
    }

    private void iniui() {


        etName = (EditText) findViewById(R.id.etname);

        tproceed = (TextView) findViewById(R.id.tproceed);
        rgBtnpaysys=(RadioGroup) findViewById(R.id.rgBtnpaysys);
        rBtndelvr = (RadioButton) findViewById(R.id.rBtndelvr);
        rBtnpay = (RadioButton) findViewById(R.id.rBtnpay);
        spspinner1=(Spinner) findViewById(R.id.spspinner1);
        spspinner2=(Spinner) findViewById(R.id.spspinner2);


        ArrayList<String> type1= new ArrayList<String>();
        type1.add("choose a type");
        type1.add("Meat");
        type1.add("Chicken");
        type1.add("Mutton");

        CustomSpinnerAdapter customSpinnerAdapter1=new CustomSpinnerAdapter(context,type1);
        spspinner1.setAdapter(customSpinnerAdapter1);

        ArrayList<String> type2= new ArrayList<String>();
        type2.add("choose a type");
        type2.add("Mango");
        type2.add("banana");
        type2.add("Apple");

        CustomSpinnerAdapter1 customSpinnerAdapter=new CustomSpinnerAdapter1(context,type2);
        spspinner2.setAdapter(customSpinnerAdapter);


        tproceed.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {

                String name = etName.getText().toString().trim();
                String spinnerItem1 = spspinner1.getItemAtPosition(spspinner1.getSelectedItemPosition()).toString();
                String spinnerItem2 = spspinner2.getItemAtPosition(spspinner2.getSelectedItemPosition()).toString();
                String valueitem = ((RadioButton)findViewById( rgBtnpaysys.getCheckedRadioButtonId() )).getText().toString();
                //AlertDialog.Builder alertDialog = new AlertDialog.Builder(context);



                /*if (TextUtils.isEmpty(name)){

                    alertDialog.setMessage(getString(R.string.alertName));
                    alertDialog.setPositiveButton("Yes",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                    alertDialog.show();
                    return;
                }else if(spinnerItem1.equalsIgnoreCase("Choose a Type")) {

                    alertDialog.setMessage(getString(R.string.alertType1));
                    alertDialog.setPositiveButton("Yes",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                    alertDialog.show();
                    return;
                }
                else if(spinnerItem2.equalsIgnoreCase("Choose a Type")) {

                    alertDialog.setMessage(getString(R.string.alertType2));
                    alertDialog.setPositiveButton("Yes",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int id) {
                                    dialog.cancel();
                                }
                            });
                    alertDialog.show();
                    return;
                }else {*/


                    Person p = new Person();
                    p.setName(name);
                    p.setMeat(spinnerItem1);
                    p.setFruit(spinnerItem2);
                    p.setItem(valueitem);

                    Intent intent = new Intent(MainActivity.this, RegActivity.class);
                    intent.putExtra("personData", "fghfghf");
                    startActivity(intent);
//                }
            }
        });





    }
}
