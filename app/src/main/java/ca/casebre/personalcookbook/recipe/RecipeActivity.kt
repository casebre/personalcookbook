package ca.casebre.personalcookbook.recipe

import android.os.Bundle
import ca.casebre.personalcookbook.base.BaseActivity

class RecipeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startFragment(RecipeFragment.newInstance("", ""))
    }
}
