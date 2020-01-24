package com.beatrice.bookfinder.Model


import com.google.gson.annotations.SerializedName

data class Pdf(
    @SerializedName("isAvailable")
    val isAvailable: Boolean
)