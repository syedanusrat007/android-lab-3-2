package com.cse.mist.intent;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView goToNextPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent in = new Intent(this , page2.class);

        goToNextPage = (TextView) findViewById(R.id.t1);

        goToNextPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                in.putExtra("nameID1", "complete registration for signing up");
                startActivity(in);

            }
        });
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, page2.class);

        intent.putExtra("nameID1", "you have logged in");

        startActivity(intent);
    }

    public void usingShare(View view){
        Intent sharingIntent = new Intent(Intent.ACTION_SEND);
        sharingIntent.setType("text/plain");
        sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, "REPLACE WITH YOUR TEXT");
        startActivity(sharingIntent);
    }


}