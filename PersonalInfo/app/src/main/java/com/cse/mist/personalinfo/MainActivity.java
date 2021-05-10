package com.cse.mist.personalinfo;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private EditText ename,eroll,ebatch;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        iniui();

    }

    private void iniui() {
        ename = (EditText) findViewById(R.id.ename);
        eroll = (EditText) findViewById(R.id.eroll);
        ebatch = (EditText) findViewById(R.id.ebatch);
        button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String name = ename.getText().toString();
                String roll = eroll.getText().toString();
                String batch = ebatch.getText().toString();
                Toast.makeText(context,"My name is "+name+" roll "+roll+" from batch "+batch,Toast.LENGTH_LONG).show();
            }
        } );

    }
}
