package cresterida.me.learning.reactiveandroid;

import io.reactivex.Single;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by kiquetal on 7/31/17.
 */

public interface ServicesYahoo {
@GET("yql?format=json")
Single<YahooStockResult> yahooQuery(@Query("q") String query, @Query("env") String env);

}
