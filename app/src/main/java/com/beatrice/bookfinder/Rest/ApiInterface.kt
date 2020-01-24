package com.beatrice.bookfinder.Rest

import com.beatrice.bookfinder.Model.BookResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET(".")
    fun searchBooks(): Call<BookResponse>
}