package com.example.lesson_3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class FirstFragment extends Fragment {

    EditText pas_first;
    Button bt_first;
    String admin = "Lilia";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        pas_first = view.findViewById(R.id.pas_first);
        bt_first = view.findViewById(R.id.bt_first);
        click();
    }

    private void click() {
        bt_first.setOnClickListener(view -> {
            String password = pas_first.getText().toString().trim();
            if (!password.equals(admin)) {
                pas_first.setError("Не правильный пароль!");
            } else {
                getParentFragmentManager().beginTransaction()
                        .replace(R.id.fragment_container_view, new SecondFragment())
                        .commit();
            }
        });
    }
}