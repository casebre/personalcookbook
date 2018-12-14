package ca.casebre.personalcookbook.data

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import ca.casebre.personalcookbook.entities.Recipe

@Dao
interface RecipeDao {
    @Insert(onConflict = REPLACE)
    fun insert(recipe: Recipe)

    @Query("SELECT * FROM Recipe WHERE id = :recipeId")
    fun fetchRecipe(recipeId : Int) : LiveData<Recipe>

    @Query("SELECT * FROM Recipe")
    fun getALlRecipes() : LiveData<List<Recipe>>

}