package ir.sematec.saturdays;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class TestDBOpenHelper extends SQLiteOpenHelper {

    String TABLE_NAME = "students";
    String createTableQuery = "" +
            "CREATE TABLE " + TABLE_NAME +
            "(" +
            "_id INTEGER PRIMARY KEY AUTOINCREMENT ," +
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


    public void insertScore(String name, int score) {

        String insertScoreIntoDB = "" +
                "INSERT INTO " + TABLE_NAME +
                "(" +
                "name ," +
                "score" +
                ")" +
                "VALUES(" +
                "'" + name + "'" +
                "," +
                score +
                ")" +
                "";

        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL(insertScoreIntoDB);
        db.close();
    }


    public String getAllNames() {
        String names = "";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT name FROM " + TABLE_NAME, null);

        while (cursor.moveToNext()) {
            names = names + cursor.getString(0) + "\n";
        }


        db.close();
        return names;
    }
}
