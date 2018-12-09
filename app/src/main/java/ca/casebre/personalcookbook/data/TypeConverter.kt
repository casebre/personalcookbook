package ca.casebre.personalcookbook.data

import ca.casebre.personalcookbook.entities.Ingredient
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.util.*

class TypeConverter {

    companion object {

        @JvmStatic
        fun convertIngredientsToList(ingredients: String): List<Ingredient> {

            if (ingredients == null) {
                return Collections.emptyList()
            }

            val gson: Gson = Gson()
            val listType = object : TypeToken<List<Ingredient>>() {}.type

            return gson.fromJson(ingredients, listType);
        }
    }
}