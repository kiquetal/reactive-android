package cresterida.me.learning.reactiveandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.stock_updates_recyclerview)
    RecyclerView recyclerView;

    private LinearLayoutManager layoutManager;
    private StockAdapter stockDataAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        stockDataAdapter = new StockAdapter();
        recyclerView.setAdapter(stockDataAdapter);
        Observable.just("APPL", "GOOGLE", "TWTR")
                .subscribe(s-> {
        stockDataAdapter.add(s);

    });
    }
}
