package cresterida.me.learning.reactiveandroid;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by kiquetal on 7/30/17.
 */

public class TesingActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i("app","prueba");
        Observable.just("One","Two","Three","Four","Five","Six","Seven")
                .subscribeOn(Schedulers.newThread())
                .doOnDispose(()->log("onDispose"))
                .doOnComplete(()->log("onComplete"))
                .doOnNext(e->log("OnNext",e))
                .doOnEach(e -> log("doOnEach"))
                .doOnSubscribe((e) -> log("doOnSubscribe"))
                .doOnTerminate(() -> log("doOnTerminate"))
                .doFinally(() -> log("doFinally"))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(e -> log("subscribe baby", e));
    }
    private void log(String item)
    {
        log(item,Thread.currentThread().getName());
    }
    private void log(String stage,String item)
    {
        Log.d("App",stage+" : "+item+":"+Thread.currentThread().getName());
    }
}
