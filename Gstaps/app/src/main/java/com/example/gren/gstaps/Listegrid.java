package com.example.gren.gstaps;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class Listegrid extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listegrid);

    }


    public void condidat_btn(View view) {
        Toast.makeText(this,"Hey",Toast.LENGTH_SHORT).show();
        Intent intent2 = new Intent(Listegrid.this,condidatpage.class);
         startActivity(intent2);
    }
}
