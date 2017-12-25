package net.oneread.redditbros;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Backend backend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        backend = new Backend();

        final EditText emailView = findViewById(R.id.email );
        final Button loginButton = findViewById(R.id.loginButton);
        final EditText passwordView = findViewById(R.id.password);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = emailView.getText().toString();
                String password =  passwordView.getText().toString();

                boolean result = backend.login(email, password);

                if (result) {
                    showToast("Login success");
                } else {
                    showToast("Login fail");
                }

            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(LoginActivity.this, message, Toast.LENGTH_LONG).show();
    }

}
