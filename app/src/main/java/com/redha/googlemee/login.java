package com.redha.googlemee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Locale;
import java.util.Objects;

public class login extends AppCompatActivity {

    Button btnlogin;
    TextInputEditText email, pass;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        btnlogin = (Button) findViewById(R.id.btnlogin);
        pass = (TextInputEditText) findViewById(R.id.etpassword);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Objects.requireNonNull(pass.getText()).toString().equalsIgnoreCase("REDHA")) {
                    Login_sukses();
                } else {
                    Toast.makeText(getApplicationContext(), "Salah password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Login_sukses() {
        Intent login = new Intent(this, meet_utama.class);
        startActivity(login);
    }
}


