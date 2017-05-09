package com.hackslash.d2k.Adapter;


import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import com.hackslash.d2k.R;
import com.hackslash.d2k.model.Items;

import java.util.ArrayList;

public class Recycler_Adapter extends RecyclerView.Adapter<Recycler_Adapter.ViewHolder> {
    private ArrayList<Items> items;
    private Context context;

    public Recycler_Adapter(Context context,ArrayList<Items> items) {
        this.items = items;
        this.context = context;
    }

    @Override
    public Recycler_Adapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Recycler_Adapter.ViewHolder viewHolder, int i) {

        viewHolder.item_text.setText(items.get(i).get_name());
        viewHolder.image_item.setImageResource(items.get(i).get_image_src());
        //Picasso.with(context).load(android.get(i).getAndroid_image_url()).resize(240, 120).into(viewHolder.img_android);
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageButton image_item;
        private TextView item_text;

        public ViewHolder(View view) {
            super(view);
            image_item = (ImageButton) view.findViewById(R.id.ic1);
            item_text=(TextView)view.findViewById(R.id.item_text);
        }
    }

}

