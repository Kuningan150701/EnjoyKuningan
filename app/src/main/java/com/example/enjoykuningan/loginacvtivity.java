package com.example.enjoykuningan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

public class loginacvtivity extends AppCompatActivity {
    String username = "admin";
    String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginacvtivity);

        EditText inputUser = findViewById(R.id.username);
        EditText inputPassword = findViewById(R.id.password);
        ImageButton btnLogin = findViewById(R.id.btnloginlo);
        ImageButton btnRegister = findViewById(R.id.cancel);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = inputUser.getText().toString().trim();
                String passwordInput = inputPassword.getText().toString().trim();

                if (TextUtils.isEmpty(userInput) || TextUtils.isEmpty(passwordInput)) {
                    Toast.makeText(loginacvtivity.this, "Username dan password harus diisi", Toast.LENGTH_SHORT).show();
                } else if (userInput.equalsIgnoreCase(username) && passwordInput.equalsIgnoreCase(password)) {
                    startActivity(new Intent(loginacvtivity.this, tab_layout.class));
                    Toast.makeText(loginacvtivity.this, "Login Berhasil", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(loginacvtivity.this, "Username atau password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}