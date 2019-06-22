package com.example.eventticketshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by HP on 4/6/2016.
 */
public class ListItemActivity6 extends AppCompatActivity {

    //  LinearLayout home, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticket_booking);
        Button button = (Button) findViewById(R.id.bookingbtn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent =new Intent(ListItemActivity6.this,ListItemActivity8.class);
                startActivity(intent);
    }
});
    }
}