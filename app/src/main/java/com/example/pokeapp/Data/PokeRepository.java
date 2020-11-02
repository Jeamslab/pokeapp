package com.example.pokeapp.Data;

import java.util.List;

import com.example.pokeapp.model.PokeModel;

public class PokeRepository {

    private final IPokeSource mSource;

    public PokeRepository() {
        mSource = new PokeMockSource();
    }

    public PokeRepository(IPokeSource source) {
        mSource = source;
    }

    public List<PokeModel> getAll() {
        return mSource.getAll(50);
    }
}
