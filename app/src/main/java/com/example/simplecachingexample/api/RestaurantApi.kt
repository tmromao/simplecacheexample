package com.example.simplecachingexample.api

import com.example.simplecachingexample.data.Restaurant
import retrofit2.http.GET

interface RestaurantApi {

    companion object {
        const val BASE_URL = "https://random-data-api.com/api/"
    }

    @GET("restaurant/random_restaurant?size=20")
    suspend fun getRestaurants():List<Restaurant>

}