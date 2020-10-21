package com.example.moviedb.data.model

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.android.parcel.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class Poster(
    val aspect_ratio: Double? = null,
    val file_path: String? = null,
    val height: Int? = null,
    val iso_639_1: String? = null,
    val vote_average: Int? = null,
    val vote_count: Int? = null,
    val width: Int? = null
) : Parcelable