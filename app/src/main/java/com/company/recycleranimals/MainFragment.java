package com.company.recycleranimals;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<String> animals;
    private AnimalAdapter animalAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        recyclerView = view.findViewById(R.id.recycler);
        animalAdapter = new AnimalAdapter(animals);
        recyclerView.setAdapter(animalAdapter);
    }

    private void loadData() {
        animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Fox");
        animals.add("Tiger");
        animals.add("Leopard");
        animals.add("Elephant");
        animals.add("Wolf");
        animals.add("Goat");
        animals.add("Bear");
        animals.add("Camel");
        animals.add("Catfish");
        animals.add("Fish");
        animals.add("Shark");
        animals.add("Bee");
        animals.add("Bison");
        animals.add("Iguana");
        animals.add("Crocodile");
        animals.add("Butterfly");
        animals.add("Mouse");
        animals.add("Goose");
        animals.add("Chinchilla");
        animals.add("Cow");
        animals.add("Horse");
        animals.add("Crab");
        animals.add("Snake");
        animals.add("Gazelle");
        animals.add("Panda");
        animals.add("Kangaroo");
    }
}