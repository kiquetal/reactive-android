package cresterida.me.learning.reactiveandroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.support.v7.recyclerview.R.styleable.RecyclerView;

/**
 * Created by kiquetal on 7/25/17.
 */

public class StockAdapter extends RecyclerView.Adapter<StockViewAdapterViewHolder> {

    private final List<String> data=new ArrayList<>();

    @Override
    public StockViewAdapterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_stock,parent,false);
        StockViewAdapterViewHolder vh=new StockViewAdapterViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(StockViewAdapterViewHolder holder, int position) {

        holder.textView.setText(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    public void add(String stock)
    {
        this.data.add(stock);
        notifyItemInserted(data.size()-1);
    }
}
class StockViewAdapterViewHolder extends RecyclerView.ViewHolder
{

    @BindView(R.id.stock_item_symbol)
    TextView textView;
    public StockViewAdapterViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
}


