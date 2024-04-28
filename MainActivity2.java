package com.example.expt4new;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    TextView nm,pwd,gend,sub,quali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nm=findViewById(R.id.name1);
        pwd=findViewById(R.id.pass1);
        gend=findViewById(R.id.gend1);
        sub=findViewById(R.id.sub1);
        quali=findViewById(R.id.qualif);

        Intent intent=getIntent();
        Bundle extras=intent.getExtras();

        if(extras!=null) {
            nm.setText(extras.getString("name"));
            pwd.setText(extras.getString("password"));
            gend.setText(extras.getString("gender"));
            sub.setText(extras.getString("sub"));
            quali.setText(extras.getString("quali"));

        }

    }
}