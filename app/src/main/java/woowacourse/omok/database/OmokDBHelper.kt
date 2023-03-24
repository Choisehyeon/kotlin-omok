package woowacourse.omok.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class OmokDBHelper(
    context: Context?,
) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    companion object {
        const val DATABASE_VERSION = 1
        const val DATABASE_NAME = "lope_db"

        const val TABLE_NAME = "OMOK_STONE"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        var sql: String = "CREATE TABLE $TABLE_NAME (" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "stone_color INTEGER NOT NULL," +
            "x INTEGER NOT NULL," +
            "y INTEGER NOT NULL" +
            ")"

        db!!.execSQL(sql)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        val sql: String = "DROP TABLE IF EXISTS $TABLE_NAME"

        db!!.execSQL(sql)
        onCreate(db)
    }
}
