package com.example.pokeapp.Adapter.viewholder;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.snackbar.Snackbar;

import java.util.Locale;

import com.example.pokeapp.R;
import com.example.pokeapp.eventhelper.ItemTapListener;

public class
ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public TextView tv_name;
    public ImageView iv_poke;
    public ImageButton btn_fave;

    @Nullable
    private final ItemTapListener mTapListener;

    public ViewHolder(@NonNull View itemView, @Nullable ItemTapListener tapListener) {
        super(itemView);

        mTapListener = tapListener;
        itemView.setOnClickListener(this);

        tv_name = itemView.findViewById(R.id.tv_name);
        iv_poke = itemView.findViewById(R.id.iv_poke);
        btn_fave = itemView.findViewById(R.id.btn_fave);

    }

    @Override
    public void onClick(View view) {
        if(mTapListener == null) return;
        mTapListener.onItemTap(view, getAdapterPosition());
    }
}
