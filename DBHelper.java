package com.example.healthgame.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "HealthGame.db";
    private static final int DB_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String recordTable =
                "CREATE TABLE daily_record (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "date TEXT," +
                        "food INTEGER," +
                        "exercise INTEGER," +
                        "net INTEGER," +
                        "rating TEXT)";

        String characterTable =
                "CREATE TABLE character (" +
                        "level INTEGER," +
                        "exp INTEGER," +
                        "state INTEGER," +
                        "streak INTEGER," +
                        "title TEXT)";

        db.execSQL(recordTable);
        db.execSQL(characterTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS daily_record");
        db.execSQL("DROP TABLE IF EXISTS character");
        onCreate(db);
    }
}