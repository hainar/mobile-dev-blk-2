package edu.ucucite.mobiledevblk2_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText eUsername;
    EditText ePassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eUsername=findViewById(R.id.mEditUsername);
        ePassword=findViewById(R.id.mEditPassword);

    }

    //Button
    public void clickConnect(View view){
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        String stName=bundle.get("name").toString();
        String stUser=bundle.get("username").toString();
        String stPassword=bundle.get("pass").toString();

        String stUsername=eUsername.getText().toString();
        String stPass=ePassword.getText().toString();

        if(stUser.equals(stUsername) && stPassword.equals(stPass)){
                //startActivity(new Intent(MainActivity.this,HomeActivity.class));
            Intent intentProfile=new Intent(MainActivity.this,HomeActivity.class);
            intentProfile.putExtra("name", stName.toString());
            startActivity(intentProfile);
        }else{
            Toast.makeText(this, "Invalid Username and Password" , Toast.LENGTH_SHORT).show();
        }




    }

    public void clickSignUp(View view){
        startActivity(new Intent(MainActivity.this, SignUp.class));
    }
}
