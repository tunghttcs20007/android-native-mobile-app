package vn.edu.greenwich.cw_1_sample.database;

public class ResidentEntry {
    public static final String TABLE_NAME = "resident";
    public static final String COL_ID = "id";
    public static final String COL_NAME = "name";
    public static final String COL_START_DATE = "start_date";
    public static final String COL_OWNER = "owner";

    public static final String SQL_CREATE_TABLE =
            "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    COL_ID + " INTEGER PRIMARY KEY," +
                    COL_NAME + " TEXT NOT NULL," +
                    COL_START_DATE + " TEXT NOT NULL," +
                    COL_OWNER + " INTEGER NULL)";

    public static final String SQL_DELETE_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;
}