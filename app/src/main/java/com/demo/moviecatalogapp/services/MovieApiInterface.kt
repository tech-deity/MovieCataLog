package com.demo.moviecatalogapp.services

import com.demo.moviecatalogapp.models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/movie/popular?api_key=60f7da0a2d8096f14c4db3e2ce91cb5c")
    fun getMovieList(): Call<MovieResponse>
}