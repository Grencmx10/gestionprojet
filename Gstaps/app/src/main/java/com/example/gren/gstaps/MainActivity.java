package com.example.gren.gstaps;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Btnlog;
    EditText usrtext;
    EditText passtext;

    private void Setups(){
        Btnlog = (Button)findViewById(R.id.Btnlog);
        usrtext = (EditText)findViewById(R.id.usrtext);
        passtext = (EditText)findViewById(R.id.passtext);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*start*/
        Setups();
        Btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loggs();
            }
        });

    }

    void loggs(){
        String user = usrtext.getText().toString();
        String pass = passtext.getText().toString();
        if(user.equals("khadija") && pass.equals("khadija")){
            Toast.makeText(this, " welcome ", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(MainActivity.this,Listegrid.class);
            startActivity(intent);

        }
        else if(user.isEmpty() || pass.isEmpty() ){
            Toast.makeText(this,"Please enter your username or password ",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this, "failed to log in", Toast.LENGTH_LONG).show();
        }

    }
}
