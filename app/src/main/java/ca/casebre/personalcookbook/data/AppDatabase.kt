package ca.casebre.personalcookbook.data

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context
import ca.casebre.personalcookbook.entities.Recipe

@Database(entities = [Recipe::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun recipeDao() : RecipeDao

    companion object {

        @Volatile
        private var INSTANCE : AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                INSTANCE ?: buildDatabase(context).also { INSTANCE = it}
            }
        }

        fun buildDatabase(context: Context) : AppDatabase {
            return Room.databaseBuilder(context.applicationContext,
                    AppDatabase::class.java,
                    "app-database").build()
        }
    }

}