package ir.sematec.saturdays;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TestDBOpenHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "students";
    String createTableQuery = "" +
            "CREATE TABLE " + TABLE_NAME +
            "(" +
            "_id INTEGER PRIMARY KEY AUTO INCREMENT ," +
            "name TEXT ," +
            "score INTEGER" +
            ")" +
            "";


    public TestDBOpenHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(createTableQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
