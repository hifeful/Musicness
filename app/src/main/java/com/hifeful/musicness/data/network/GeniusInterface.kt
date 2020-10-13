package com.hifeful.musicness.data.network

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface GeniusInterface {
    @GET("artists/{id}")
    fun getArtistById(@Path("id") id: Long,
                      @Query("text_format") textFormat: String = "dom"): Call<JsonObject>
}