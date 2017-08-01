package cresterida.me.learning.reactiveandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by kiquetal on 7/31/17.
 */

public class ActivityRetroFit extends Activity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String query = "select * from yahoo.finance.quote where symbol in ('YHOO','AAPL','GOOG','MSFT')";
        String env = "store://datatables.org/alltableswithkeys";
        ServicesYahoo services=new RetrofitFactory().create();
        services.yahooQuery(query,env)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(d->{
                    Log.d("APP",d.getQuery().getResults().getQuote().get(0).getSymbol());

                });
    }
}
