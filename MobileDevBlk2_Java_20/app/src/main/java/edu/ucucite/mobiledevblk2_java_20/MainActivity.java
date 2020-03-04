package edu.ucucite.mobiledevblk2_java_20;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Objects
    Button btnConnect;
    EditText eUsername;
    EditText ePassword;
    TextView txtDis;
    TextView txtUCU;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            ePassword=findViewById(R.id.mEditPassword);
            btnConnect=findViewById(R.id.mbtnConnect);
            eUsername=findViewById(R.id.mEditUsername);
            txtDis=findViewById(R.id.mtxtDis);
            txtUCU=findViewById(R.id.mtxtUCU);
           btnConnect.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   String stUsername=eUsername.getText().toString();
                   String stPassword=ePassword.getText().toString();

                   txtDis.setText("Your Username: " + stUsername
                                + "\nYour Password: " + stPassword);

                   txtUCU.setText("Your Username: " + stUsername
                           + "\nYour Password: " + stPassword);



               }

           });//Button End
/*
        btnConnect.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

               Toast.makeText(MainActivity.this,"Text Here", Toast.LENGTH_LONG).show();


                return false;

            }
        });*/



    }//OnCreate

    public void clickConnect(View view){
        Toast.makeText(this, "Short Button Function", Toast.LENGTH_SHORT).show();
    }
}
