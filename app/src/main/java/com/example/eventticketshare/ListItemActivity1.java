package com.example.eventticketshare;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by HP on 4/6/2016.
 */
public class ListItemActivity1 extends AppCompatActivity {

 LinearLayout home,profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_movies);
        home = (LinearLayout) findViewById(R.id.home);
        profile = (LinearLayout) findViewById(R.id.profile);
        home.setBackgroundColor(Color.parseColor("#aeaeae"));
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home.setBackgroundColor(Color.parseColor("#aeaeae"));
                profile.setBackgroundColor(Color.parseColor("#dddddd"));
                setContentView(R.layout.activity_main);
            }
        });
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                home.setBackgroundColor(Color.parseColor("#dddddd"));
                profile.setBackgroundColor(Color.parseColor("#aeaeae"));
            }

        });

        Button button = (Button) findViewById(R.id.btnpublishmv);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(ListItemActivity1.this,ListItemActivity7.class);
                startActivity(intent);
                //setContentView(R.layout.activity_movie_publish);
            }
        });
        Button button2 = (Button) findViewById(R.id.btnbookmv);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(ListItemActivity1.this,ListItemActivity9.class);
                startActivity(intent);
              //  setContentView(R.layout.activity_movie_book);
            }
        });
    }
}
