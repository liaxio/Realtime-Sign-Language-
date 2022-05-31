package com.example.sign_lang_ml;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login_user extends AppCompatActivity {
    EditText username, password;
    Button btnlogin;
    DBHelper DB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        username = (EditText) findViewById(R.id.username1);
        password = (EditText) findViewById(R.id.password1);
        btnlogin = (Button) findViewById(R.id.btnsignin1);
        DB = new DBHelper(this);
//        btnlogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                String user = username.getText().toString();
//                String pass = password.getText().toString();
//
//                if(user.equals("")||pass.equals(""))
//                    Toast.makeText(login_user.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
//                else{
//                    Boolean checkuserpass = DB.checkusernamepassword(user, pass);
//                    if(checkuserpass==true){
//                        Toast.makeText(login_user.this, "Sign in successfull", Toast.LENGTH_SHORT).show();
//                        Intent intent  = new Intent(getApplicationContext(), MainActivity.class);
//                        startActivity(intent);
//                    }else{
//                        Toast.makeText(login_user.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            }
//        });
    }

    public void onClick(View view) {
        String user = username.getText().toString();
        String pass = password.getText().toString();

        if(user.equals("")||pass.equals(""))
            Toast.makeText(login_user.this, "Please enter all the fields", Toast.LENGTH_SHORT).show();
        else{
            Boolean checkuserpass = DB.checkusernamepassword(user, pass);
            if(checkuserpass==true){
                Toast.makeText(login_user.this, "Sign in successfull", Toast.LENGTH_SHORT).show();
                Intent intent  = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }else{
                Toast.makeText(login_user.this, "Invalid Credentials", Toast.LENGTH_SHORT).show();
            }
        }
    }
}