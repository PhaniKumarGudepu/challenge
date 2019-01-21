package com.example.glrph.login_signup;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView logo = (ImageView) findViewById(R.id.logo);
        final Button login = (Button) findViewById(R.id.login);
        final Button signUp = (Button) findViewById(R.id.signUp);
        //Login button onclick listner
        login.setOnClickListener(new View.OnClickListener() {

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,LoginActivity.class);

                  startActivity(intent);
            }
        });
        //signup button onclick listner
        signUp.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SignUpActivity.class);
                               startActivity(intent);
            }
        });
    }
}
