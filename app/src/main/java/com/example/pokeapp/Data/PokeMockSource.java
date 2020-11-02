package com.example.pokeapp.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

import com.example.pokeapp.model.PokeModel;
import com.example.pokeapp.R;

public class PokeMockSource implements IPokeSource {
    public List<PokeModel> getAll(int count){
        ArrayList<PokeModel> models = new ArrayList<>();
        models.add(new PokeModel(
                genId(),
                "Pikachu",
                "Pikachu that can generate powerful electricity have cheek sacs that are extra soft and super stretchy.",
                imageName.Pikachu
        ));
        models.add(new PokeModel(
                genId(),
                "Charmander",
                "It has a preference for hot things. When it rains, steam is said to spout from the tip of its tail.",
                imageName.Charmander
        ));
        models.add(new PokeModel(
                genId(),
                "Squirtle",
                "When it retracts its long neck into its shell, it squirts out water with vigorous force.",
                imageName.Squirtle
        ));
        models.add(new PokeModel(
                genId(),
                "Bulbasaur",
                "There is a plant seed on its back right from the day this Pokémon is born. The seed slowly grows larger.",
                imageName.Bulbasaur
        ));
        models.add(new PokeModel(
                genId(),
                "Ninetales",
                "It is said to live 1,000 years, and each of its tails is loaded with supernatural powers.",
                imageName.Ninetales
        ));
        models.add(new PokeModel(
                genId(),
                "Hitmonchan",
                "Its punches slice the air. They are launched at such high speed, even a slight graze could cause a burn.",
                imageName.Hitmonchan
        ));
        models.add(new PokeModel(
                genId(),
                "Arcanine",
                "The sight of it running over 6,200 miles in a single day and night has captivated many people.",
                imageName.Arcanine
        ));
        models.add(new PokeModel(
                genId(),
                "Drowzee",
                "If you sleep by it all the time, it will sometimes show you dreams it had eaten in the past.",
                imageName.Drowzee
        ));
        models.add(new PokeModel(
                genId(),
                "Golem",
                "Once it sheds its skin, its body turns tender and whitish. Its hide hardens when it’s exposed to air.",
                imageName.Golem
        ));
        models.add(new PokeModel(
                genId(),
                "Sandslash",
                "The drier the area Sandslash lives in, the harder and smoother the Pokémon’s spikes will feel when touched.",
                imageName.Sandslash
        ));
        Collections.shuffle(models);
        return models;
    }

    private String genId() {
        return java.util.UUID.randomUUID().toString();
    }
}