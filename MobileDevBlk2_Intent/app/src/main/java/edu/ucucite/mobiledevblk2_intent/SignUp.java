package edu.ucucite.mobiledevblk2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class SignUp extends AppCompatActivity {

    EditText eName;
    EditText eUsername;
    EditText ePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        eName = findViewById(R.id.sEditName);
        eUsername = findViewById(R.id.sEditUsername);
        ePassword=findViewById(R.id.sEditPassword);
    }//OnCreate

    //Button
    public void clickSignUp(View view){
            String stName=eName.getText().toString();
            String stUsername=eUsername.getText().toString();
            String stPassword=ePassword.getText().toString();



            //Passing Data

        Intent intent=new Intent(SignUp.this,MainActivity.class);
        intent.putExtra("name", stName.toString());
        intent.putExtra("username", stUsername.toString());
        intent.putExtra("pass", stPassword.toString());
        startActivity(intent);




    }

}