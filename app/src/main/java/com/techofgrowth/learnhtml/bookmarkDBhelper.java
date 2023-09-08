package com.techofgrowth.learnhtml;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class bookmarkDBhelper extends SQLiteOpenHelper {
private static final String DATABASE_NAME = "bookmark_database";
private static final int DATABASE_ID = 1;
private static final String TABLE_NAME = "data_table";
private static final String KEY_ID = "id";
private static final String KEY_FILE = "file";
private static final String KEY_TITLE = "title";

private static final String CREATE_TABLE_QUERY =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    KEY_FILE + " TEXT, " +
                    KEY_TITLE + " TEXT)";

    public bookmarkDBhelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_ID);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_QUERY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }

    public void addBookmark(String file, String title){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(KEY_FILE, file);
        values.put(KEY_TITLE, title);
        db.insert(TABLE_NAME,null, values);
    }

    public ArrayList<bookmark_modle> getBookmark(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(" SELECT * FROM " + TABLE_NAME, null);
        ArrayList<bookmark_modle> bookmarkArray = new ArrayList<>();
        while(cursor.moveToNext()){
            bookmark_modle modle = new bookmark_modle();
            modle.id = cursor.getInt(0);
            modle.file = cursor.getString(1);
            modle.title = cursor.getString(2);
            bookmarkArray.add(modle);
        }
        return bookmarkArray;
    }

    public boolean deleteBookmark(String fileName) {
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, KEY_FILE + "=?", new String[]{fileName}) > 0;
    }
}

