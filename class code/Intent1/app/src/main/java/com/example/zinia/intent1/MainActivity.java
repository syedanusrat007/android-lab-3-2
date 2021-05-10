package com.example.zinia.intent1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    TextView goToNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent in = new Intent(this , Page2.class);

        goToNextPage = (TextView) findViewById(R.id.t1);

        goToNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                 startActivity(in);

                /*Toast toast = Toast.makeText(getApplicationContext(), " feet =  cm" , Toast.LENGTH_SHORT);
                toast.show();*/
            }
        });
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, Page2.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        intent.putExtra("nameID1", "This text is sent to 2nd page");
        intent.putExtra("nameID2", "This Another text is sent to 2nd page");
        startActivity(intent);
    }

    public void usingShare(View view){
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "REPLACE WITH YOUR TEXT");
        startActivity(sharingIntent);
    }


}
