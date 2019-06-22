package com.example.eventticketshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class ListItemActivity3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener, View.OnClickListener {
    private Spinner spinner1, spinner2, spinner3;
    private Button mButton;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train);

        addListenerOnButton();
        addListenerOnSpinnerItemSelection();
    }

    public void addListenerOnSpinnerItemSelection() {
        //Spinner element
        spinner1 = (Spinner) findViewById(R.id.train_source_spinner);
        spinner1.setOnItemSelectedListener(this);

        spinner2 = (Spinner) findViewById(R.id.train_destination_spinner);
        spinner2.setOnItemSelectedListener(this);

        spinner3 = (Spinner) findViewById(R.id.train_number_spinner);
        spinner3.setOnItemSelectedListener(this);
    }

    // get the selected dropdown list value
    public void addListenerOnButton() {
        spinner1 = (Spinner) findViewById(R.id.train_source_spinner);
        spinner2 = (Spinner) findViewById(R.id.train_destination_spinner);
        spinner3 = (Spinner) findViewById(R.id.train_number_spinner);
        mButton = (Button) findViewById(R.id.train_publish);
        mButton.setOnClickListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }
    @Override
    public void onClick(View v) {
        Intent intent =new Intent(ListItemActivity3.this,ListItemActivity4.class);
        startActivity(intent);

    }

}
