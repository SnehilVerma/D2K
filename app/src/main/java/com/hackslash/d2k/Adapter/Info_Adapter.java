package com.hackslash.d2k.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hackslash.d2k.R;
import com.hackslash.d2k.model.Case;

import java.util.ArrayList;

public class Info_Adapter extends RecyclerView.Adapter<Info_Adapter.ViewHolder> {

    private ArrayList<Case> info;
    private Context context;

    public Info_Adapter(Context context,ArrayList<Case> info) {
        this.info = info;
        this.context = context;
    }

    @Override
    public Info_Adapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.case_layout, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Info_Adapter.ViewHolder viewHolder, int i) {

        viewHolder.com_name.setText(info.get(i).get_com_name());
        viewHolder.case_name.setText(info.get(i).get_case_name());
        viewHolder.case_id.setText(info.get(i).get_case_id());
        viewHolder.branch_code.setText(info.get(i).get_branch_code());
        //Picasso.with(context).load(android.get(i).getAndroid_image_url()).resize(240, 120).into(viewHolder.img_android);
    }

    @Override
    public int getItemCount() {
        return info.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView com_name;
        private TextView case_name;
        private TextView case_id;
        private TextView branch_code;


        public ViewHolder(View view) {
            super(view);

            com_name=(TextView)view.findViewById(R.id.com_name);
            case_name=(TextView)view.findViewById(R.id.case_name);
            case_id=(TextView)view.findViewById(R.id.case_id);
            branch_code=(TextView)view.findViewById(R.id.code);
        }
    }




}
