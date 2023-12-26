package com.example.chinesefood;

import android.content.ClipData;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AbuAdapter extends RecyclerView.Adapter<AbuAdapter.MyViewHolder> {

    //2nd
    private List<IndividualDish> individualDishList;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

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
