package org.d3ifcool.praassesment


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_awal.*
import org.d3ifcool.praassesment.databinding.FragmentAwalBinding

/**
 * A simple [Fragment] subclass.
 */
class AwalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentAwalBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_awal, container, false)
        binding.button.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_awalFragment_to_persegi)
        }
        binding.button2.setOnClickListener { v: View ->
            v.findNavController().navigate(R.id.action_awalFragment_to_segitiga)
        }
        setHasOptionsMenu(true)
        return binding.root
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item,
            view!!.findNavController())
                || super.onOptionsItemSelected(item)
    }




    }
