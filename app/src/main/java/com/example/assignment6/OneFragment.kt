package com.example.assignment6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_one.view.*

class OneFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_one, container, false)
        view.btn_1.setOnClickListener(){
            var fragment: Fragment? = null
            fragment = TwoFragment()
            replaceFragment(fragment)
        }
        return view
    }

    fun replaceFragment(someFragment: Fragment){
        fragmentManager!!.beginTransaction()
            .replace(R.id.frameLayout, someFragment)
            .addToBackStack(null)
            .commit()
    }

}