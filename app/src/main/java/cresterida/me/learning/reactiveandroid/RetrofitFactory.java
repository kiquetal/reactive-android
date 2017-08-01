package cresterida.me.learning.reactiveandroid;

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by kiquetal on 7/31/17.
 */

public class RetrofitFactory {
HttpLoggingInterceptor interceptor=new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
OkHttpClient client=new OkHttpClient.Builder().addInterceptor(interceptor).build();

 Retrofit retrofit=new Retrofit.Builder()
         .client(client)
         .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
         .addConverterFactory(GsonConverterFactory.create())
         .baseUrl("https://query.yahooapis.com/v1/public/")
         .build();

    public ServicesYahoo create()
    {
        return retrofit.create(ServicesYahoo.class);
    }

}
