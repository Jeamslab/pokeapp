package com.example.pokeapp.Adapter;

import android.view.LayoutInflater;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;
import java.util.Locale;

import com.example.pokeapp.R;
import com.example.pokeapp.Adapter.viewholder.ViewHolder;
import com.example.pokeapp.eventhelper.ItemTapListener;
import com.example.pokeapp.model.PokeModel;
import com.example.pokeapp.Recycler2;

public class Adapter extends RecyclerView.Adapter<ViewHolder>{

    @NonNull
    private List<PokeModel> mModelList;
    @Nullable
    private final ItemTapListener mTapListener;


    public Adapter(@NonNull List<PokeModel> modelList, @Nullable ItemTapListener tapListener) {
        mModelList = modelList;
        mTapListener = tapListener;
    }

    public void updateList(List<PokeModel> newList) {
        mModelList = newList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override

    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.pokelist, parent, false);
        ViewHolder viewHolder = new ViewHolder(itemView, mTapListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        PokeModel currentModel = mModelList.get(position);
        holder.tv_name.setText(currentModel.getName());
        holder.iv_poke.setImageResource(
                ViewHelper.getResIdByCategory(currentModel.getNameImage())
        );
        holder.btn_fave.setImageResource(R.mipmap.emptyh);
        holder.btn_fave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.btn_fave.setImageResource(R.mipmap.filledhe);
                Snackbar.make(holder.itemView, String.format(Locale.getDefault(),
                        "Agregaste a %s a tu lista de favoritos.", currentModel.getName()
                        ),
                        Snackbar.LENGTH_LONG
                ).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mModelList.size();
    }
}