package com.salikh.newsapp.core.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.salikh.newsapp.R;
import com.salikh.newsapp.core.helpers.SendDataToVIew;
import com.salikh.newsapp.core.models.response.Article;
import com.salikh.newsapp.databinding.HomeItemsBinding;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {

    private final List<Article> list;
    private final SendDataToVIew sendDataToVIew;

    public HomeAdapter(List<Article> list, SendDataToVIew sendDataToVIew) {
        this.list = list;
        this.sendDataToVIew = sendDataToVIew;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_items, parent, false));
    }

    public void clearData() {
        list.clear();
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        Article model = list.get(position);


        Glide.with(holder.binding.imageView.getContext())
                .load(model.getUrlToImage())
                .centerCrop()
                .placeholder(R.drawable.holder)
                .error(R.drawable.holder)
                .into(holder.binding.imageView);


        holder.binding.titleText.setText(model.getTitle());
        holder.binding.authText.setText(model.getAuthor());
        holder.binding.dateText.setText(model.getPublishedAt());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sendDataToVIew.sendData(model);

            }
        });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final HomeItemsBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = HomeItemsBinding.bind(itemView);
        }
    }
}
