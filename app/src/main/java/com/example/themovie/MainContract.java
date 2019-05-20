package com.example.themovie;

import com.example.themovie.model.Movie;

import java.util.List;
public interface MainContract {

    interface View {

        void setDataToRecyclerView(List<Movie> movies);

        void onError();
    }
}

