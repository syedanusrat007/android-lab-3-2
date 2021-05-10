package com.example.mist.userprofile;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class UserProfile extends AppCompatActivity {


    private static final int PICK_CONTACT_REQUEST = 1;

    private static final int PICK_CONTACT = 0;

   private Button selectImage,load;
    private TextView list;
    ImageView imageView;
    private int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);


        selectImage=(Button) findViewById(R.id.selectInmage);
        imageView=(ImageView)findViewById(R.id.imageView);


        Button btn  = (Button) findViewById(R.id.contact);

        /**    Defining a click event listener    */
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /** Creating an intent with the dialer's action name  */
                /** Since the intent is created with activity's action name, the intent is an implicit intent */
                Intent intent = new Intent("android.intent.action.DIAL");

                /** Starting the Dialer activity */
                startActivity(intent);
            }
        };
        btn.setOnClickListener(listener);
        selectImage.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {

            Intent intent= new Intent();
            intent.setType("image/*");
            intent.setAction(Intent.ACTION_GET_CONTENT);
            startActivityForResult(Intent.createChooser(intent,"Select Picture"),REQUEST_CODE);
              }
         }
                     );
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==REQUEST_CODE && requestCode==RESULT_OK && data!=null && data.getData() !=null) {
            Uri uri=data.getData();
            try{
                Bitmap bitmap= MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
                imageView.setImageBitmap(bitmap);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
