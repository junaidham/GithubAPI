package com.junaid.githubapi.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.junaid.githubapi.R;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText inputUserName;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btnLogin);
        inputUserName = (EditText) findViewById(R.id.etName);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(LoginActivity.this, UserActivity.class);
                i.putExtra("STRING_I_NEED", inputUserName.getText().toString());
                startActivity(i);
            }
        });
    }
}
