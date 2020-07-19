package com.master.movieadvisor.model

import com.google.gson.annotations.SerializedName


data class Comment (
    val id: Int,
    val userId: String,
    val comment: String,
    val movieId: Int,
    @SerializedName("note") val rating: Double,
    @SerializedName("isLiked") val like: Boolean
    //val dateTime: LocalDateTime?
)