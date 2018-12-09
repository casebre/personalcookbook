package ca.casebre.personalcookbook.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(
        entity = Recipe::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("recipeItemId"),
        onDelete = ForeignKey.CASCADE)))
class Ingredient(
        @PrimaryKey(autoGenerate = true)
        var id: Int = 0,
        var description : String = "",
        var author : String = "",
        var public : Boolean = false)