package cresterida.me.learning.reactiveandroid.storeio;

import android.content.ContentValues;
import android.support.annotation.NonNull;

import com.pushtorefresh.storio.sqlite.operations.put.DefaultPutResolver;
import com.pushtorefresh.storio.sqlite.queries.InsertQuery;
import com.pushtorefresh.storio.sqlite.queries.UpdateQuery;

/**
 * Created by kiquetal on 8/6/17.
 */

public class PutResolverStockUpdate extends DefaultPutResolver<StockUpdate> {

    @NonNull
    @Override
    protected InsertQuery mapToInsertQuery(@NonNull StockUpdate object) {

        return InsertQuery.builder()
                .table(StockTable.TABLE)
                .build();
    }

    @NonNull
    @Override
    protected UpdateQuery mapToUpdateQuery(@NonNull StockUpdate object) {
        return UpdateQuery.builder()
                .table(StockTable.TABLE)
                .where(StockTable.Columns.ID)
                .whereArgs(object.getId())
                .build();
    }

    @NonNull
    @Override
    protected ContentValues mapToContentValues(@NonNull StockUpdate object) {

        final ContentValues cv=new ContentValues();
        cv.put(StockTable.Columns.ID,object.getId());
        cv.put(StockTable.Columns.STOCK_SYMBOL,object.getStock_symbol());
        cv.put(StockTable.Columns.PRICE,object.getPrice());
        cv.put(StockTable.Columns.DATE,object.getDate());
        return cv;
    }
}
