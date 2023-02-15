package com.project.projectt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,name,pass,number;
    Button btn;
    TextView dispName,dispNumber,dispEmail,note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        name = findViewById(R.id.name);
        pass = findViewById(R.id.password);
        number = findViewById(R.id.number);
        btn =findViewById(R.id.dispData);
        dispName = findViewById(R.id.dispName);
        dispEmail = findViewById(R.id.dispEmail);
        dispNumber = findViewById(R.id.dispNumber);
        note = findViewById(R.id.note);

        //button onclick to display Data
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //this will be called when button is clicked
                if(TextUtils.isEmpty(name.getText()) || TextUtils.isEmpty(email.getText()) || TextUtils.isEmpty(number.getText())){
                    Toast.makeText(MainActivity.this, "Please Enter All Details..!", Toast.LENGTH_LONG).show();
                    note.setText("Please Ensure to Fill All Fields..!");
                }
                else{
                    note.setVisibility(View.INVISIBLE);
                    dispName.setText(name.getText().toString());
                    dispEmail.setText(email.getText().toString());
                    dispNumber.setText(number.getText().toString());
                }
            }
        });

    }
}