package com.project.myshoppingapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Cart_Adapter extends RecyclerView.Adapter<Cart_Adapter.CartViewHolder> {

    private ArrayList<Cart> cart;
    Activity activity;

    public Cart_Adapter(Activity activity){
        this.activity = activity;
        cart = ((CartUpdate) CartItemActivity.getMyContext()).getItems();
    }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        TextView name, price;
        ImageView img;
        public CartViewHolder(@NonNull View itemView) {
            super(itemView);

            name = itemView.findViewById(R.id.cart_pro_title);
            price = itemView.findViewById(R.id.cart_pro_price);
            img = itemView.findViewById(R.id.cart_pro_img);
        }
    }

    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cart_product_layout,parent,false);
        CartViewHolder cartViewHolder = new CartViewHolder(view);
        return cartViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {

        Cart currentItem = cart.get(position);
        holder.name.setText(currentItem.getiName());
    }

    @Override
    public int getItemCount() {
        return cart.size();
    }

}