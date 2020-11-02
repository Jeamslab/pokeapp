package com.example.pokeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import com.example.pokeapp.Adapter.Adapter;
import com.example.pokeapp.Data.IPokeSource;
import com.example.pokeapp.Data.PokeRepository;
import com.example.pokeapp.eventhelper.ItemTapListener;
import com.example.pokeapp.model.PokeModel;

public class Recycler2 extends AppCompatActivity implements ItemTapListener {

    private static final String TAG = Recycler2.class.getName();
    private PokeRepository mPointsRepository;
    private List<PokeModel> mModelList;
    private Adapter mPointsAdapter;
    private ViewGroup rootView;
    private ImageButton btn_iv;
    private int i = 0;
    private int name1 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setup();
    }

    @Override
    protected void onResume() {
        super.onResume();
        loadData();
    }

    private void setup() {
        mPointsRepository = new PokeRepository();
        mModelList = new ArrayList<>();
        rootView = findViewById(R.id.hype);
        setupPointListView();
    }

    private void setupPointListView() {
        RecyclerView rvView = findViewById(R.id.rv_view);
        mPointsAdapter = new Adapter(mModelList, this);
        rvView.setAdapter(mPointsAdapter);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getBaseContext());
        rvView.setLayoutManager(layoutManager);
        rvView.setHasFixedSize(true);
        button(rvView);
    }

    private void button(RecyclerView rvP) {
        btn_iv = findViewById(R.id.btn_view);
        btn_iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    btn_iv.setImageResource(R.mipmap.gridview);
                    RecyclerView.LayoutManager layout = new GridLayoutManager(getBaseContext(), 2);
                    rvP.setLayoutManager(layout);
                    rvP.setHasFixedSize(true);
                    i = 1;
                    return;
                }
                if (i == 1) {
                    btn_iv.setImageResource(R.mipmap.listeview);
                    RecyclerView.LayoutManager layout = new LinearLayoutManager(getBaseContext());
                    rvP.setLayoutManager(layout);
                    rvP.setHasFixedSize(true);
                    i = 0;
                    return;
                }
            }
        });
    }

    private void loadData() {
        if (!mModelList.isEmpty()) {
            Log.d(TAG, "Ya existen valores en la lista");
            return;
        }
        if (mPointsRepository == null) {
            Log.e(TAG, "mPointsRepository no debería ser null");
            return;
        }
        mModelList = mPointsRepository.getAll();
        mPointsAdapter.updateList(mModelList);
    }


    public void onItemTap(View view, int position) {
        showMessageWithSelectedItem(position);
    }

    private void showMessageWithSelectedItem(int position) {
        if (mModelList == null) {
            Log.e(TAG, "invalid mModelList");
            return;
        }
        if (position > mModelList.size()) {
            Log.e(TAG, "invalid position");
            return;
        }

        PokeModel selectedItemModel = mModelList.get(position);
        Snackbar.make(rootView,
                String.format(Locale.getDefault(),
                        "%s", selectedItemModel.getName()
                ),
                Snackbar.LENGTH_LONG
        ).show();

        nextActivity(selectedItemModel);
    }

    private void nextActivity(PokeModel select) {
        name1 = select.getNameImage();
        String cont = "";
        cont = select.getName();
        Intent intent = new Intent(this, FaveShow.class);
        Bundle GG = new Bundle();
        GG.putString("name", cont);
        GG.putString("description", select.getDescription());
        GG.putInt("nameImage", name1);
        intent.putExtras(GG);
        startActivity(intent);
    }

}

