package org.d3ifcool.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_segitiga.*
import org.d3ifcool.praassesment.databinding.FragmentAwalBinding
import org.d3ifcool.praassesment.databinding.FragmentSegitigaBinding

/**
 * A simple [Fragment] subclass.
 */
class Segitiga : Fragment() {
    private var luas2 = 0
    private var keliling = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSegitigaBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_segitiga, container, false)



        binding.button9.setOnClickListener {
            var alas = binding.editText7.toString()
            var tinggi = binding.editText8.toString()
            luas2 = ((alas.toInt()*tinggi.toInt())/2)
            luas2.toString()
            luas.setText(luas2)
        }

        setHasOptionsMenu(true)
        return binding.root

    }

  
}
