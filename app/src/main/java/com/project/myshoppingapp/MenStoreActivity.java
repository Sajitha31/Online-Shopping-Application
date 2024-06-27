package com.project.myshoppingapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenStoreActivity extends AppCompatActivity {

    RecyclerView recyclerView1;
    Product_Adapter productAdapter1;
    ArrayList<Product> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.productstore_layout);

        recyclerView1 = findViewById(R.id.men_recycler0);
        list = new ArrayList<>();
        productAdapter1 = new Product_Adapter(this,list);


        list.add(new Product("White Shirt","1",1200,R.drawable.white_shirt,5,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));
        list.add(new Product("White Denim","2",1800,R.drawable.white_denim,10,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));
        list.add(new Product("Blue Shirt","3",800,R.drawable.blue_shirt,20,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));
        list.add(new Product("Brown T-shirt","4",1400,R.drawable.brown_tshirt,20,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));
        list.add(new Product("White T-shirt","5",850,R.drawable.white_tshirt,20,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));
        list.add(new Product("Black Denim","6",1470,R.drawable.black_denim,20,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));
        list.add(new Product("Beige Jacket","7",1800,R.drawable.beige_jacket,20,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));
        list.add(new Product("Grey Jacket","8",1400,R.drawable.grey_jacket,20,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));
        list.add(new Product("Pant","9",700,R.drawable.pant,20,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));
        list.add(new Product("Jeans","10",1200,R.drawable.jeans,20,"Casual, Partywear Shirt For Men Elevate Your Look With Our Meticulously Crafted Shirt, Designed To Exude Sophistication And Style. Made From High-quality Popcorn Fabric, This Shirt Offers A Luxurious Feel Against Your Skin While Ensuring Breathability For All-day Comfortability. Its Regular Fit Accentuates Your Physique, While The Classic Collar And Button-down Front Add A Touch Of Refinement. Whether You're Dressing For A Party, Vacation Or A Weekend Brunch, This Shirt Effortlessly Transitions From Partywear To Casual Settings. Complete With Subtle Detailing Such As Self Design And Premium Quality Fabric, It's The Epitome Of Understated Elegance. "));


        GridLayoutManager glm1 = new GridLayoutManager(this,2);
        recyclerView1.setLayoutManager(glm1);
        recyclerView1.setAdapter(productAdapter1);
        recyclerView1.setHasFixedSize(true);

    }
}