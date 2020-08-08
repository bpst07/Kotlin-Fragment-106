package com.arrow.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.arrow.fragment.Contants.ARGS_KEY
import kotlinx.android.synthetic.main.fragment_blank.view.*

/**
 * A simple [Fragment] subclass.
 */
class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_blank, container, false)

        // get arguments from bundle
        val myBundle: Bundle? = arguments

        // text view on blank fragment
        view.text_view_blank_fragment.text = myBundle?.getString(ARGS_KEY)

        return view
    }

}