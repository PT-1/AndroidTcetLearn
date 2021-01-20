package co.in.pratik.tcet_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.button);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(username.getText().toString().equals(password.getText().toString())){
                    Log.d("logusername", String.valueOf(username.getText()));
                    Intent i = new Intent(getApplicationContext(), MainActivity2.class);
                    startActivity(i);
                }
                else{
                    Toast tt =Toast.makeText(getApplicationContext(), "Enter proper name & password!", Toast.LENGTH_LONG);
                    tt.show();
                }
            }
        });

    }
}