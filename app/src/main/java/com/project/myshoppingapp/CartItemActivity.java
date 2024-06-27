package com.project.myshoppingapp;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;

public class CartItemActivity extends Application implements CartUpdate{

    private static Context context3;
    ArrayList<Cart> product3;

    @Override
    public void onCreate() {

        super.onCreate();
        context3 = getApplicationContext();
        product3 = new ArrayList<>();

    }

    public static Context getMyContext(){
        return context3;
    }

    @Override
    public void addItems(String i_name, int i_price, int i_img) {

        product3.add(new Cart(i_name, i_price, i_img));
    }

    @Override
    public ArrayList<Cart> getItems() {
        return product3;
    }

}