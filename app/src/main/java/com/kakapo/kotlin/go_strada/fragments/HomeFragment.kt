package com.kakapo.kotlin.go_strada.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.kakapo.kotlin.go_strada.MainActivity
import com.kakapo.kotlin.go_strada.R
import com.kakapo.kotlin.go_strada.databinding.FragmentHomeBinding


/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment(), View.OnClickListener {

    private lateinit var navController: NavController
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        navController = findNavController() //Initialising navController

    }

    override fun onClick(v: View?) { //When click occurs this function is triggered
        when(v?.id) { //Check for the id of the view i which click event happened

        }
    }

    private fun goToNextFragment() {
//        val action = HomeFragmentDirections.actionHomeFragmentToProfileFragment() //if needed pass values to frag here NB: add that arguments to nav_graph also
//        navController.navigate(action) //navigation
    }

    private fun closeApp() {
        (activity as MainActivity).exitApp()
    }

}