package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Pizza", R.drawable.sushi));
        items.add(new Item("Burger", R.drawable.burger));
        items.add(new Item("Pasta", R.drawable.pasta));
        items.add(new Item("Sushi", R.drawable.sushi));
        items.add(new Item("Tacos", R.drawable.tacos));
        items.add(new Item("Salad", R.drawable.salad));
        items.add(new Item("Steak", R.drawable.steak));
        items.add(new Item("Ice Cream", R.drawable.ice_cream));
        items.add(new Item("Fried Chicken", R.drawable.fried_chicken));
        items.add(new Item("Apple Pie", R.drawable.apple_pie));
        items.add(new Item("Hot Dog", R.drawable.hot_dog));
        items.add(new Item("French Fries", R.drawable.french_fries));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));

    }
}