package com.arif.foodlicious;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView cdfood;
    private ArrayList<Food> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cdfood = findViewById(R.id.cd_food);
        cdfood.setHasFixedSize(true);
        list.addAll(FoodData.getListData());
        showRecylerList();
    }

    private void showRecylerList() {
        cdfood.setLayoutManager(new LinearLayoutManager(this));
        ListFoodAdapter listFoodAdapter= new ListFoodAdapter(list);
        cdfood.setAdapter(listFoodAdapter);
        listFoodAdapter.setOnItemClickCallback(new ListFoodAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Food data) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(DetailActivity.ex_name,data.getNama());
                intent.putExtra(DetailActivity.ex_tipe, data.getNamaDaerah());
                intent.putExtra(DetailActivity.ex_detail, data.getDetailMakanan());
                intent.putExtra(DetailActivity.ex_image, data.getImage());

                startActivity(intent);

            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.button_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.id_profil:
                Intent intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}




