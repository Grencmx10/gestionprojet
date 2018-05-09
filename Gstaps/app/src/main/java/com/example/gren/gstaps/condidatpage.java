package com.example.gren.gstaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class condidatpage extends AppCompatActivity {
datab db = new datab(this);
    ListView Lst;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_condidatpage);
        Lst = findViewById(R.id.ArrayL);
        Showdata();
    }

    public void modifier_bnt(View view) {
        Toast.makeText(this,"",Toast.LENGTH_SHORT).show();
        Intent intent3 = new Intent(condidatpage.this,Editliste.class);
        startActivity(intent3);
    }
    public void Showdata(){
        ArrayList <String> ListeData = db.getallrecord();
        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,ListeData);
        Lst.setAdapter(arrayAdapter);
    }
}
