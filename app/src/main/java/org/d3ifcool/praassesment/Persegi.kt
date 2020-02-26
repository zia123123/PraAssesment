package org.d3ifcool.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3ifcool.praassesment.databinding.FragmentAwalBinding
import org.d3ifcool.praassesment.databinding.FragmentPersegiBinding

/**
 * A simple [Fragment] subclass.
 */
class Persegi : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPersegiBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_persegi, container, false)



        setHasOptionsMenu(true)
        return binding.root
    }


}
