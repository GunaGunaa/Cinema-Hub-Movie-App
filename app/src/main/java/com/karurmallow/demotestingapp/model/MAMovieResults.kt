package com.karurmallow.demotestingapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.karurmallow.demotestingapp.common.MAConstant.MOVIES_TABLE
import com.google.gson.annotations.SerializedName
import java.io.Serializable


@Entity(tableName = MOVIES_TABLE)
data class

MAMovieResults(
    @PrimaryKey(autoGenerate = true)
    val movieSerialNumber: Long,
    val userLanguage: String,
    val pageNumber: Int,
    @SerializedName("backdrop_path")
    val posterEndPoint: String?,
    @SerializedName("id")
    val movieId: Int?,
    @SerializedName("original_language")
    val movieLanguage: String?,
    @SerializedName("original_title")
    val movieTitle: String?,
    @SerializedName("overview")
    val movieDescription: String?,
    @SerializedName("poster_path")
    val moviePosterEndPont: String,
    @SerializedName("release_date")
    val movieReleaseDate: String?,
    @SerializedName("vote_average")
    val movieAverageVote: Float?,
    @SerializedName("vote_count")
    val movieVoteCount: Long?,
) : Serializable