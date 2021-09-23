package com.example.foodorderapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodorderapp.Models.OrderModels;
import com.example.foodorderapp.R;

import java.util.ArrayList;

public class OrdersAdapters extends RecyclerView.Adapter<OrdersAdapters.viewHolder> {
    ArrayList<OrderModels> list;
    Context context;

    public OrdersAdapters(ArrayList<OrderModels> list, Context context){
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.ordersample , parent , false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
        final OrderModels model = list.get(position);
        holder.orderImage.setImageResource(model.getOrderImage());
        holder.soldItemName.setText(model.getSoldItems());
        holder.orderNumber.setText(model.getOrderNumber());
        holder.price.setText(model.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView orderImage;
        TextView soldItemName , orderNumber , price;

        public viewHolder(@NonNull View itemView){
            super(itemView);
            orderImage = itemView.findViewById(R.id.orderimage);
            soldItemName = itemView.findViewById(R.id.orderItemName);
            orderNumber = itemView.findViewById(R.id.orderNumber);
            price = itemView.findViewById(R.id.sold_price);
        }
    }
}
