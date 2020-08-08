package com.arrow.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.arrow.fragment.Contants.ARGS_KEY
import com.arrow.fragment.Contants.ARGS_VALUE

class MainActivity : AppCompatActivity() {

    private var blankFragment: BlankFragment = BlankFragment()
    private val blankFragmentTag: String = "Blank Fragment"

    private var argsBundle: Bundle = Bundle()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // prepare arguments bundle to be passed to fragment
        argsBundle.putString(ARGS_KEY, ARGS_VALUE)

        if (savedInstanceState == null) {
            // before fragment commit assign argument bundle
            blankFragment.arguments = argsBundle

            // add "BlankFragment" to container (Main Activity)
            // provide tag name to handle configuration changes
            supportFragmentManager
                    .beginTransaction()
                    .add(R.id.container, blankFragment, blankFragmentTag)
                    .commit()
        }
    }
}