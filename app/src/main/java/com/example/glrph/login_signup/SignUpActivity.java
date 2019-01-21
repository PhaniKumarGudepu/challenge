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
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
       TextView onlyText = (TextView) findViewById(R.id.OnlyText);

        final ImageView logo = (ImageView) findViewById(R.id.logo);
        final Button signUp = (Button) findViewById(R.id.signUp);
        onlyText.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
                Pair[] pairs = new Pair[2];
                pairs[0] = new  Pair<View,String>(logo,"imageTransition");
                pairs[1] = new Pair<View,String>(signUp,"signUpTransition");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUpActivity.this,pairs);
                startActivity(intent);
            }
        });
    }
}