package com.example.expt4new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name,pass,repass;
    Button btn;
    RadioButton rb1,rb2,rb3;
    CheckBox ch1,ch2,ch3;
    Spinner sp1;
    Intent intent;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=findViewById(R.id.editTextTextEmailAddress);
        pass=findViewById((R.id.editTextTextPassword));
        repass=findViewById((R.id.editTextTextPassword2));
        btn=findViewById(R.id.button);
        rb1=findViewById(R.id.radioButton);
        rb2=findViewById(R.id.radioButton2);
        rb3=findViewById(R.id.radioButton3);
        ch1=findViewById(R.id.checkBox);
        ch2=findViewById(R.id.checkBox2);
        ch3=findViewById(R.id.checkBox3);
        sp1=findViewById(R.id.spinner1);

        extras=new Bundle();
        intent=new Intent(this,MainActivity2.class);

        btn.setOnClickListener(new View.OnClickListener() {

            String username,password,repassword,gender="",Quali="";
            @Override
            public void onClick(View v) {

                username=name.getText().toString();
                password=pass.getText().toString();
                repassword=repass.getText().toString();

                if(rb1.isChecked()) {
                    gender = rb1.getText().toString();
                }
                if(rb2.isChecked()) {
                    gender = rb2.getText().toString();
                }
                if(rb3.isChecked()) {
                    gender = rb3.getText().toString();
                }

                if(ch1.isChecked()) {
                    Quali += ch1.getText().toString()+"\n";
                }
                if(ch2.isChecked()) {
                    Quali += ch2.getText().toString()+"\n";
                }
                if(ch3.isChecked()) {
                    Quali += ch3.getText().toString()+"\n";
                }

                String spinn=sp1.getSelectedItem().toString();

                if(password.equals(repassword)) {
                    extras.putString("name", username);
                    extras.putString("password", password);
                    extras.putString("sub",spinn);
                    extras.putString("quali",Quali);
                    extras.putString("gender",gender);
                    intent.putExtras(extras);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Password Not Matching", Toast.LENGTH_LONG).show();
                }


                }
        });
    }
}