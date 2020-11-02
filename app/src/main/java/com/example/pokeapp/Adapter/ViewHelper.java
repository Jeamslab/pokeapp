package com.example.pokeapp.Adapter;

import com.example.pokeapp.R;
import com.example.pokeapp.Data.IPokeSource;

public class ViewHelper {
    public static int getResIdByCategory(int category) {
        switch(category) {
            case IPokeSource.imageName.Pikachu:
                return R.mipmap.pikachu;
            case IPokeSource.imageName.Charmander:
                return R.mipmap.charm;
            case IPokeSource.imageName.Squirtle:
                return R.mipmap.squirt;
            case IPokeSource.imageName.Bulbasaur:
                return R.mipmap.bulbasaur;
            case IPokeSource.imageName.Ninetales:
                return R.mipmap.ninetales;
            case IPokeSource.imageName.Hitmonchan:
                return R.mipmap.hitmonchan;
            case IPokeSource.imageName.Arcanine:
                return R.mipmap.arcanine;
            case IPokeSource.imageName.Drowzee:
                return R.mipmap.drowzee;
            case IPokeSource.imageName.Golem:
                return R.mipmap.golem;
            case IPokeSource.imageName.Sandslash:
                return R.mipmap.sandslash;
            default:
                return R.mipmap.ic_launcher;
        }
    }
}
