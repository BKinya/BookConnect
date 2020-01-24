package com.beatrice.bookfinder.Model


import com.google.gson.annotations.SerializedName

data class BookResponse(
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("kind")
    val kind: String,
    @SerializedName("totalItems")
    val totalItems: Int
)