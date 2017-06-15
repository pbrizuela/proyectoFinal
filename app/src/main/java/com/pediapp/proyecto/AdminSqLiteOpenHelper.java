package com.pediapp.proyecto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ara on 20/03/2017.
 */

public class AdminSqLiteOpenHelper extends SQLiteOpenHelper {

    public AdminSqLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table padreshijos (codigo text primary key, nombrehijo text, vacunasapli text, vacunasfal text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}