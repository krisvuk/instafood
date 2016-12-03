package com.example.admin.instafood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class AddRestaurant extends AppCompatActivity {

    private ListView restaurantListView;

    ListView list;
    String[] restaurantNames ={
            "Canoe",
            "CN Tower Restaurant",
            "The Keg",
            "The Mandarin"
    };

    Integer[] imgIds={
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_restaurant);
        RestaurantListAdapter adapter = new RestaurantListAdapter(this, restaurantNames, imgIds);
        list=(ListView)findViewById(R.id.restaurantsListView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(AddRestaurant.this, MainMenu.class);
                startActivity(i);

            }
        });
    }
}