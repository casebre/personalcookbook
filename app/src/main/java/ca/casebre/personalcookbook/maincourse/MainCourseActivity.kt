package ca.casebre.personalcookbook.maincourse

import android.os.Bundle
import ca.casebre.personalcookbook.base.BaseActivity

class MainCourseActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startFragment(MainCourseFragment.newInstance("", ""))
    }
}
