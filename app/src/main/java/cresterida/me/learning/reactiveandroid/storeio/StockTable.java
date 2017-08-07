package cresterida.me.learning.reactiveandroid.storeio;

/**
 * Created by kiquetal on 8/6/17.
 */

public class StockTable {
    static final String TABLE="stock_updates";
    static class Columns{
        static final String ID="_id";
        static final String STOCK_SYMBOL="stock_symbol";
        static final String PRICE="price";
        static final String DATE="date";

    }
    private StockTable(){

    }
    static String createTable()
    {
        return "CREATE TABLE "+TABLE + "("+ Columns.ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + Columns.STOCK_SYMBOL + " TEXT NOT NULL, "
                + Columns.DATE + " LONG NOT NULL, "
                + Columns.PRICE + " LONG NOT NULL"
                + ");";
    }
}
