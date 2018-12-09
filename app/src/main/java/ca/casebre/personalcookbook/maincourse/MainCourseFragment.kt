package ca.casebre.personalcookbook.maincourse

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ca.casebre.personalcookbook.R
import ca.casebre.personalcookbook.recipe.RecipeActivity
import kotlinx.android.synthetic.main.fragment_main_course.*

class MainCourseFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {}
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_course, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        newRecipeIv.setOnClickListener(View.OnClickListener {
            val intent = Intent(context, RecipeActivity::class.java)
            startActivity(intent)
        })
    }


    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                MainCourseFragment().apply { arguments = Bundle().apply {} }
    }
}
