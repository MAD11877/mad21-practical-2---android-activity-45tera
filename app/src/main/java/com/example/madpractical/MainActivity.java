package com.example.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //New user on start
    User user1 = new User("guest","guest",1,false);
    //button change
    Button but = (Button)findViewById(R.id.follow);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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