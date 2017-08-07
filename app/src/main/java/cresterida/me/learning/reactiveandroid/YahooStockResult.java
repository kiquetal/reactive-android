package cresterida.me.learning.reactiveandroid;
import com.google.gson.annotations.SerializedName;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by kiquetal on 7/31/17.
 */

public class YahooStockResult {

    private YahooStockQuery query;
    public YahooStockQuery getQuery()
    {
        return query;
    }

}
class YahooStockQuery
{
    private int count;
    private Date created;
    private YahooStockResults results;
    public YahooStockResults getResults()
    {
        return results;
    }
}


class YahooStockResults
{
    private List<YahooQuote> quote;
    public List<YahooQuote> getQuote()
    {
        return quote;
    }
}
class YahooQuote
{
    private String symbol;
    @SerializedName("Name")
    private String name;
    @SerializedName("LastTradePriceOnly")
    private BigDecimal lastTradePriceOnly;
    @SerializedName("DaysLow")
    private BigDecimal daysLow;
    public String getSymbol() {
        return symbol;
    }
    public String getName() {
        return name;
    }
    public BigDecimal getLastTradePriceOnly() {
        return lastTradePriceOnly;
    }
    public BigDecimal getDaysLow() {
        return daysLow;
    }
}