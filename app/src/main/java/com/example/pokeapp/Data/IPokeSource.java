package com.example.pokeapp.Data;

import java.util.List;

import com.example.pokeapp.model.PokeModel;
import com.example.pokeapp.R;

public interface IPokeSource {
    public interface imageName {
        public static final int Pikachu = R.mipmap.pikachu;
        public static final int Charmander = R.mipmap.charm;
        public static final int Squirtle = R.mipmap.squirt;
        public static final int Bulbasaur = R.mipmap.bulbasaur;
        public static final int Ninetales = R.mipmap.ninetales;
        public static final int Hitmonchan = R.mipmap.hitmonchan;
        public static final int  Arcanine = R.mipmap.arcanine;
        public static final int Drowzee = R.mipmap.drowzee;
        public static final int Golem = R.mipmap.golem;
        public static final int Sandslash = R.mipmap.sandslash;
    }
    List<PokeModel> getAll(int count);
}
