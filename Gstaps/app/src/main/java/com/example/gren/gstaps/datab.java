package com.example.gren.gstaps;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class datab extends SQLiteOpenHelper {
    public static final String DBname="data.db";

    public datab(Context context) {
        super(context, DBname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("create table condidat (code INTEGER PRIMARY KEY , CIN TEXT , Nom TEXT ,Prénom1 TEXT , Prénom2 TEXT , Adresse TEXT , Telephone INTEGER," +
            " GSM INTEGER , CodeSté INTEGER , Email TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS condidat ");
    onCreate(db);
    }
    public  boolean insertdata(String code,String CIN,String Nom,String Prénom1,String Prénom2 , String Adresse , String Telephone,String GSM,String CodeSté,String Email){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("code",code);
        contentValues.put("CIN",CIN);
        contentValues.put("Nom",Nom);
        contentValues.put("Prénom1",Prénom1 );
        contentValues.put("Prénom2",Prénom2);
        contentValues.put("Adresse",Adresse);
        contentValues.put("Telephone",Telephone);
        contentValues.put("GSM",GSM);
        contentValues.put("CodeSté",CodeSté);
        contentValues.put("Email",Email);
        long result = db.insert("condidat",null,contentValues);
        if (result == -1)
            return false;
        else
            return true;
    }
    public ArrayList getallrecord(){
        ArrayList arrayList = new ArrayList();
        SQLiteDatabase db =this.getReadableDatabase();
        Cursor res = db.rawQuery("select * from condidat",null);
        res.moveToFirst();
        while (res.isAfterLast()==false){
            String t1 = res.getString(0);
            String t2 = res.getString(1);
            String t3 = res.getString(2);
            arrayList.add(t1+"-"+t2+"-"+t3);
            res.moveToNext();
        }
        return arrayList;
    }
}

