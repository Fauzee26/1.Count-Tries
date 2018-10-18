package fauzi.hilmy.mvp32api.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import fauzi.hilmy.mvp32api.Main.activity.DetailActivity;
import fauzi.hilmy.mvp32api.Main.model.ResponseItem;
import fauzi.hilmy.mvp32api.R;

import static fauzi.hilmy.mvp32api.Main.activity.DetailActivity.EXTRA_CURRENCY;
import static fauzi.hilmy.mvp32api.Main.activity.DetailActivity.EXTRA_FLAG;
import static fauzi.hilmy.mvp32api.Main.activity.DetailActivity.EXTRA_NAME;
import static fauzi.hilmy.mvp32api.Main.activity.DetailActivity.EXTRA_NATIVE_NAME;
import static fauzi.hilmy.mvp32api.Main.activity.DetailActivity.EXTRA_REGION;
import static fauzi.hilmy.mvp32api.Main.activity.DetailActivity.EXTRA_SUB_REGION;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MyViewHolder> {

    private Context context;
    private List<ResponseItem> itemList;

    public MainAdapter(Context context, List<ResponseItem> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public MainAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listitem, viewGroup, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.MyViewHolder myViewHolder, int i) {
        final ResponseItem item = itemList.get(i);
        myViewHolder.txtCountry.setText(item.getName());
        Glide.with(context)
                .load(item.getFlagPng())
                .into(myViewHolder.imageView);

        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailActivity.class);
                i.putExtra(EXTRA_FLAG, item.getFlagPng());
                i.putExtra(EXTRA_NAME, item.getName());
                i.putExtra(EXTRA_SUB_REGION, item.getSubRegion());
                i.putExtra(EXTRA_REGION, item.getRegion());
                i.putExtra(EXTRA_CURRENCY, item.getCurrencyName() + " / " + item.getCurrencySymbol());
                i.putExtra(EXTRA_NATIVE_NAME, item.getNativeName());
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView txtCountry;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgCountry);
            txtCountry = itemView.findViewById(R.id.txtCountry);
        }
    }
}
