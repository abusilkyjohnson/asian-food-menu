package com.example.chinesefood;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ItemClickListener{

    //1-AdapterView
    RecyclerView recyclerView;

    //2-Data Source
    List<IndividualDish> individualDishList;

    //3-Create an instance of our custom adapter class
    AbuAdapter abuAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        individualDishList = new ArrayList<>();

        IndividualDish wings = new IndividualDish(R.drawable.chickenwings,"4 piece wing", " 4 ChickenWing 6.99");
        IndividualDish beefSkewer = new IndividualDish(R.drawable.beefskewers,"Beef Skewer", " 4.99");
        IndividualDish crabRangoon = new IndividualDish(R.drawable.crabragon,"Crab Rangoon", " 5.99");
        IndividualDish friedRice = new IndividualDish(R.drawable.housefriedrice,"House Fried Rice", " 10.99");
        IndividualDish friedDumpling = new IndividualDish(R.drawable.frieddumplings,"Fried Dumplings", " 8.99");
        IndividualDish loMein = new IndividualDish(R.drawable.lomein,"Lo Mein", " 11.99");
        IndividualDish springRolls = new IndividualDish(R.drawable.springroll,"Spring Rolls", " 1.99");


        individualDishList.add(wings);
        individualDishList.add(beefSkewer);
        individualDishList.add(crabRangoon);
        individualDishList.add(friedRice);
        individualDishList.add(friedDumpling);
        individualDishList.add(loMein);
        individualDishList.add(springRolls);

        ///// we need to work with LinearLayoutManager our program wont show rn since recyclerview has linearlayout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);//now the list will show because  we are handling the list

        abuAdapter = new AbuAdapter(individualDishList);
        recyclerView.setAdapter(abuAdapter);

        abuAdapter.setClickListener(this);

    }

    @Override
    public void onClick(View v, int pos) {

        Toast.makeText(this,"You Choose: "+individualDishList.get(pos).getItemName(), Toast.LENGTH_SHORT).show();

    }
}