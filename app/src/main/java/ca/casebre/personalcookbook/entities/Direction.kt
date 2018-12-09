package ca.casebre.personalcookbook.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey

@Entity(foreignKeys = arrayOf(ForeignKey(
        entity = Recipe::class, parentColumns = arrayOf("id"),
        childColumns = arrayOf("recipeId"),
        onDelete = ForeignKey.CASCADE)))
data class Direction(
        @PrimaryKey(autoGenerate = true)
        var id: Int = 0,
        var direction : String = "",
        var order : Int = 0,
        var recipeId : Int = 0)