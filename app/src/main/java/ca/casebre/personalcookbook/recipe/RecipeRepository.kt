package ca.casebre.personalcookbook.recipe

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread
import ca.casebre.personalcookbook.data.RecipeDao
import ca.casebre.personalcookbook.entities.Recipe

class RecipeRepository(private val recipeDao: RecipeDao) {

    val allRecipes : LiveData<List<Recipe>> = recipeDao.getALlRecipes()

    @WorkerThread
    suspend fun insert(recipe: Recipe) {
        recipeDao.insert(recipe)
    }
}