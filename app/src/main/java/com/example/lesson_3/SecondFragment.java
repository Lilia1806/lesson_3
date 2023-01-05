package com.example.lesson_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class SecondFragment extends Fragment {

    private MoviesAdapter moviesAdapter = new MoviesAdapter();
    private List<String> list = new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.rv_movies);

        list.add("Мстители");
        list.add("Илюзия обмана");
        list.add("Стражи галактики");
        list.add("Дэдпул");
        list.add("Алиса в стране чудес");
        list.add("Дьявол носит Prada");
        list.add("Бегущий в лабиринте");
        list.add("Круэлла");
        list.add("Первому игроку приготовиться");
        list.add("Легенда");
        list.add("Новый Человек-паук");
        list.add("Голодные игры");
        list.add("Аватар");

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(moviesAdapter);
    }
}