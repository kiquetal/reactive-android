package cresterida.me.learning.reactiveandroid.storeio;

import java.io.Serializable;

/**
 * Created by kiquetal on 8/6/17.
 */

public class StockUpdate implements Serializable{
     String id;
     String stock_symbol;
     String price="price";
     String date="date";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStock_symbol() {
        return stock_symbol;
    }

    public void setStock_symbol(String stock_symbol) {
        this.stock_symbol = stock_symbol;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
