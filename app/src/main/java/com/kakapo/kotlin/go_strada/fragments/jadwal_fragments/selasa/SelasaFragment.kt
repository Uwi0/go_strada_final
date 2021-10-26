package com.kakapo.kotlin.go_strada.fragments.jadwal_fragments.selasa

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class SelasaFragment : Fragment() {

    companion object {
        fun newInstance() = SelasaFragment()
    }

    private lateinit var viewModel: SelasaViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.selasa_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SelasaViewModel::class.java)
        // TODO: Use the ViewModel
    }

}