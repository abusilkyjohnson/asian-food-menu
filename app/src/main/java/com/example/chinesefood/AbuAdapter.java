package com.example.chinesefood;

import android.content.ClipData;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AbuAdapter extends RecyclerView.Adapter<AbuAdapter.MyViewHolder> {

    //2nd
    private List<IndividualDish> individualDishList;

    //4 after we made a item click listener initialize it
    //  so you can have have it use our class
    public ItemClickListener clickListener;

    public void setClickListener(ItemClickListener AbuclickListener) {
        this.clickListener = AbuclickListener;
    }

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


    //3rd
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //Binds the data from ur data set to the view within view holder. this called by the recycler

        IndividualDish dish = individualDishList.get(position);
        holder.foodName.setText(dish.getItemName());
        holder.description.setText(dish.getItemDetail());
        holder.foodImage.setImageResource(dish.itemImG);

    }

    @Override
    public int getItemCount() {
        return individualDishList.size();
    }

    //3rd


    //1st do this so we can pass it in the class bracket
    public  class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView foodImage;
        TextView foodName;
        TextView description;

        public MyViewHolder(@NonNull View itemView)// the itemview holds references of our view
        {
            super(itemView);//this is the constructor and initializes the view holder to those variables
            foodImage = itemView.findViewById(R.id.foodImg);
            foodName = itemView.findViewById(R.id.nameFood);
            description = itemView.findViewById(R.id.description);

            //5 then have to set the view setclick to this keyword and change original header of line for MyViewHolder
            // public static class MyViewHolder extends RecyclerView.ViewHolder
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {
            //6 removed static from MyViewHolder header
            if(clickListener != null)
            {
                clickListener.onClick(v,getAdapterPosition());
            }

        }
    }
    //1st
}
