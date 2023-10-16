package com.karurmallow.demotestingapp.repository.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.karurmallow.demotestingapp.model.MAMovieResults
import com.karurmallow.demotestingapp.services.MAMovieDao


@Database(entities = [MAMovieResults::class], version = 1, exportSchema = false)
abstract class MADataBaseManager : RoomDatabase() {
    abstract fun userDao(): MAMovieDao
    companion object {
        @Volatile
        private var MAMovieDataBaseInstance: MADataBaseManager? = null
        fun getDatabase(context: Context): MADataBaseManager {
            val movieDataBaseInstances = MAMovieDataBaseInstance
            if (movieDataBaseInstances != null) {
                return movieDataBaseInstances
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    MADataBaseManager::class.java,
                    "movie_database"
                ).build()
                MAMovieDataBaseInstance = instance
                return instance
            }
        }
    }
}