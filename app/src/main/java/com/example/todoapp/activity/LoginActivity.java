package com.example.todoapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.todoapp.R;

public class LoginActivity extends AppCompatActivity {
EditText edtUser, edtPass ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button btnLogin = findViewById(R.id.btnLogin);
        edtUser = findViewById(R.id.edtUser);
        edtPass= findViewById(R.id.edtPass);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtUser.getText().toString().equals("admin") && edtPass.getText().toString().equals("admin")){
                    startActivity(new Intent(LoginActivity.this,ListActivity.class));
                }
               else {
                    Toast.makeText(LoginActivity.this, "SAI SAI SAI", Toast.LENGTH_SHORT).show();
                }
              
            }
        });
    }
}