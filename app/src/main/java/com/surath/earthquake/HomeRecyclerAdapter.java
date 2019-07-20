package com.surath.earthquake;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeRecyclerAdapter extends RecyclerView.Adapter<HomeRecyclerAdapter.ViewHolder> {

    Context context;

    public HomeRecyclerAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_home_item,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        for (int i = 0;i<20;i++){

            holder.item_scale.setText("4.5");
            holder.item_location.setText("Kathamndu");
            holder.item_date.setText("12/12/12");
        }

    }

    @Override
    public int getItemCount() {
        return 20;
    }

    public class  ViewHolder extends RecyclerView.ViewHolder {

        TextView item_scale;
        TextView item_location;
        TextView item_date;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            item_scale = itemView.findViewById(R.id.recycler_item_title);
            item_location = itemView.findViewById(R.id.recycler_item_location);
            item_date = itemView.findViewById(R.id.recycler_item_date);


        }
    }
}
