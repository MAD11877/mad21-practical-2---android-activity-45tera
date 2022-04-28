package com.example.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button but;
    User user1 = new User("guest","guest",1,true);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //New user on start
        but = findViewById(R.id.follow);

        //button change
        // but.setOnClickListener((View.OnClickListener) this);
        //but.setOnClickListener(new View.OnClickListener()){
        // public void onClick(View v){
        // log.v()
        // }
        // }

        if (!user1.followed){
            but.setText("Follow");
        }
        else{
            but.setText("Followed");
        }

    }
    public void onClick(View v){
        if(but.getText().toString().equals("Followed")){ //unfollowed
            but.setText("Follow");
            user1.followed= false;
        }
        else if( but.getText().toString().equals("Follow")){ //followed
            but.setText("Followed");
            user1.followed=true;

        }

    }
}