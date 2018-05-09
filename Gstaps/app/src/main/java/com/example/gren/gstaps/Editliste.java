package com.example.gren.gstaps;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Editliste extends AppCompatActivity {

    datab db = new datab(this);
    EditText codex,cin,nom,prenom1,prenom2,adresse,gsm,tele,codeste,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editliste);
        codex=findViewById(R.id.codetext);
        cin=findViewById(R.id.cintext);
        nom=findViewById(R.id.nomtext);
        prenom1=findViewById(R.id.prenom1text);
        prenom2=findViewById(R.id.prenom2text);
        adresse=findViewById(R.id.adressetext);
        gsm=findViewById(R.id.gsmtext);
        tele=findViewById(R.id.teletext);
        codeste=findViewById(R.id.codestetext);
        email=findViewById(R.id.emailtext);
    }

    public void add_btn(View view) {
        String Codex = codex.getText().toString();
        String Cin = cin.getText().toString();
        String Nom = nom.getText().toString();
        String Prenom1 = prenom1.getText().toString();
        String Prenom2 = prenom2.getText().toString();
        String Adresse = adresse.getText().toString();
        String Gsm = gsm.getText().toString();
        String Tele = tele.getText().toString();
        String Codeste = codeste.getText().toString();
        String Email = email.getText().toString();
        boolean result = db.insertdata(Codex,Cin,Nom,Prenom1,Prenom2,Adresse,Gsm,Tele,Codeste,Email);
        if (result == true){
            Toast.makeText(this,"valide ",Toast.LENGTH_LONG).show();

        }
        else {   Toast.makeText(this," non valide ",Toast.LENGTH_LONG).show();  }

    }
}
