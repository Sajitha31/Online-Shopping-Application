package com.project.myshoppingapp;

import android.os.Bundle;

import java.util.ArrayList;

public interface CartUpdate {

    void addItems(String i_name, int i_price, int i_img);

    ArrayList<Cart> getItems();
}
