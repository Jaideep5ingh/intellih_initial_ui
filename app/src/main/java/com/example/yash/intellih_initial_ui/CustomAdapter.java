package com.example.yash.intellih_initial_ui;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 31-03-2017.
 */

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    private ArrayList<DataModel> dataSet;



    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView roomName;
        ImageView imageViewIcon;


        public MyViewHolder(View itemView) {
            super(itemView);
            this.roomName = (TextView) itemView.findViewById(R.id.room_name);
            this.imageViewIcon = (ImageView) itemView.findViewById(R.id.room_icon);
        }
    }


    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_layout, parent, false);

        view.setOnClickListener(MainActivity.myOnClickListener);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;

    }
    public CustomAdapter(ArrayList<DataModel> data) {
        this.dataSet = data;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.MyViewHolder holder, int position) {
        TextView textViewName = holder.roomName;
        ImageView imageView = holder.imageViewIcon;

        textViewName.setText(dataSet.get(position).getRoom());
        imageView.setImageResource(dataSet.get(position).getImage());

    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
