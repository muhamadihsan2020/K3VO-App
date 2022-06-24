package com.example.k3vo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    Button btn_login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_screen);

        getSupportActionBar().hide();

        btn_login = findViewById(R.id.login_button);
        username = findViewById(R.id.username_input);
        password = findViewById(R.id.password_input);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(String.valueOf(username.getText()).equals("admin") && String.valueOf(password.getText()).equals("admin")) {
                    String nama = username.getText().toString();
                    Intent x = new Intent(LoginActivity.this, MainActivity.class);
                    x.putExtra("nama", nama);
                    startActivity(x);
                }
                else{
                    Toast.makeText(getBaseContext(), "Username or password is incorrect!", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}