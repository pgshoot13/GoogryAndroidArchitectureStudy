package com.studyfork.architecturestudy

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("v1/search/movie.json")
    fun getMovieList(
        @Query("query") query: String
    ): Single<MovieResponse>

}