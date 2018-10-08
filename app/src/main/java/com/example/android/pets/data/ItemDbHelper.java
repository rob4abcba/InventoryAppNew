package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.ItemContract.ItemEntry;

/**
 * Database helper for Pets app. Manages database creation and version management.
 */

public class ItemDbHelper extends SQLiteOpenHelper {

    public static final String LOG_TAG = ItemDbHelper.class.getSimpleName();

    // Name of the database file
    private static final String DATABASE_NAME = "shelter.db";

    // Database version. If you change the database schema, you must increment the version number.
    private static final int DATABASE_VERSION = 1;

    public ItemDbHelper (Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // This is called when the database is created for the first time
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Create a string that contains the SQL statement to create the items table
        String SQL_CREATE_ITEMS_TABLE = "CREATE TABLE " + ItemEntry.TABLE_NAME + " ("
                + ItemEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ItemEntry.COLUMN_ITEM_NAME + " TEXT NOT NULL, "
                + ItemEntry.COLUMN_ITEM_PRICE + " INTEGER NOT NULL, "
                + ItemEntry.COLUMN_ITEM_QUANTITY + "INTEGER NOT NULL DEFAULT 0, "
                + ItemEntry.COLUMN_ITEM_SUPPLIER_NAME + " TEXT"
                + ItemEntry.COLUMN_ITEM_SUPPLIER_PHONE + " TEXT);";

        //Execute the SQL statement
        db.execSQL(SQL_CREATE_ITEMS_TABLE);
    }

    // This is called when the database needs to be upgraded.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        // The database is still at version one, so there's nothing to be done here.
    }
}
