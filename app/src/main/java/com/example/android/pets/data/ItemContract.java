package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * API Contract for the inventory app.
 */
public final class ItemContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private ItemContract() {}

    /**
     * Inner class that defines constant values for the inventory database table.
     * Each entry in the table represents a single item.
     */
    public static final class ItemEntry implements BaseColumns {

        /** Name of database table for items */
        public final static String TABLE_NAME = "items";

        // Unique ID number for the item (only for use in the database table).
        // Type: INTEGER
        public final static String _ID = BaseColumns._ID;

        // Name of the item.
        // Type: TEXT
        public final static String COLUMN_ITEM_NAME ="name";

        // Price of the item.
        // Type: INTEGER
        public final static String COLUMN_ITEM_PRICE = "price";

        // Quantity of the item.
        // Type: INTEGER
        public final static String COLUMN_ITEM_QUANTITY = "quantity";

        // Name of the item supplier.
        // Type: TEXT
        public final static String COLUMN_ITEM_SUPPLIER_NAME = "supplierName";

        // Phone number of item supplier.
        // Type: INTEGER
        public final static String COLUMN_ITEM_SUPPLIER_PHONE = "supplierPhone";

    }

}

