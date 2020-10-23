package com.arif.foodlicious;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>{

    private ArrayList<Food> listFood;
    private OnItemClickCallback onItemClickCallback;

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    public ListFoodAdapter(ArrayList<Food> list) {
        this.listFood= list;
    }
    @NonNull
    @Override
    public ListFoodAdapter.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_food, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListFoodAdapter.ListViewHolder holder, int position) {

        FoodData hdata = new FoodData();
        int[][] posisiImage = hdata.getFoodimages();
        Food food= listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(posisiImage[food.getImage()][0])
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgimage);
        holder.ttName.setText(food.getNama());
        holder.ttType.setText(food.getNamaDaerah());
        holder.ttDetail.setText(food.getDetailMakanan());
        holder.itemView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                onItemClickCallback.onItemClicked(listFood.get(holder.getAdapterPosition()));
            }

        });
        holder.btnFavorite.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                Toast.makeText(holder.itemView.getContext(), "Favorite " +
                        listFood.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public int getItemCount() {
        return listFood.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgimage;
        TextView ttName, ttType, ttDetail, ttmanfaat;
        Button btnFavorite,btnShare;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgimage = itemView.findViewById(R.id.item_image);
            ttName = itemView.findViewById(R.id.item_name);
           // ttmanfaat = itemView.findViewById(R.id.manfaat);
            ttType = itemView.findViewById(R.id.item_Tipe);
            ttDetail = itemView.findViewById(R.id.item_Detail);
            btnFavorite = itemView.findViewById(R.id.btn_set_favorite);

        }
    }

    public interface OnItemClickCallback{
        void onItemClicked(Food data);
    }
}
