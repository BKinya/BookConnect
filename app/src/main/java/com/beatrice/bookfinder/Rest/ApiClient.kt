package com.beatrice.bookfinder.Rest

import com.beatrice.bookfinder.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//singleton class
object ApiClient {

    private const val BASE_URL = "https://www.googleapis.com/books/v1/volumes/"
    //okhttp client
    /**
     * we use function apply which will help us initialize the interceptor
     * in the style of a builder, without the need of a class to implement
     * any type of builder
     */
   private val client = OkHttpClient().newBuilder()
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = if (BuildConfig.DEBUG) HttpLoggingInterceptor.Level.BODY else HttpLoggingInterceptor.Level.NONE
            })
            .build()

    val instance : ApiInterface by lazy {
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        retrofit.create(ApiInterface::class.java)
    }



}