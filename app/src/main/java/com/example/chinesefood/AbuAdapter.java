package com.example.chinesefood;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AbuAdapter extends RecyclerView.Adapter<AbuAdapter.MyViewHolder> {

    //2nd
    private List<IndividualDish> individualDishList;

    public AbuAdapter(List<IndividualDish> individualDishList) {
        this.individualDishList = individualDishList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //this is responsible for creating new view holder for your items
        //You inflate the item layout XML and return an instance of your custom Viewholder class.

        //Inflator The layout inflator class is used to inflate or create a view hierarchy from an XML layout
        //resource.It's an essential part of building UI components in Android, allowing you to convert XML layout definitions into
        //actual view objects to displayed
        View dishView = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_layout,parent,false);



        return new MyViewHolder(dishView);
    }
    //2nd

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }


    //1st do this so we can pass it in the class bracket
    public static class MyViewHolder extends RecyclerView.ViewHolder{

        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
        }
    }
    //1st
}
