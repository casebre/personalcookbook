package ca.casebre.personalcookbook.recipe

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import ca.casebre.personalcookbook.data.AppDatabase
import ca.casebre.personalcookbook.entities.Recipe

class RecipeViewModel(application : Application) : AndroidViewModel(application) {

    private val repository : RecipeRepository
    private val allRecipes : LiveData<List<Recipe>>

    init {
        val recipeDao = AppDatabase.getDatabase(application).recipeDao()
        repository = RecipeRepository(recipeDao)
        allRecipes = repository.allRecipes
    }

}