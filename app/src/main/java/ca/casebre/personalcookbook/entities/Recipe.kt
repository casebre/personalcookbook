package ca.casebre.personalcookbook.entities

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
data class Recipe(
        @PrimaryKey(autoGenerate = true)
        var id: Int = 0,
        var title: String = "",
        var description : String = "",
        var author : String = "",
        var public : Boolean = false)
