package com.kakapo.kotlin.go_strada.fragments.jadwal_fragments.senin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class SeninFragment : Fragment() {

    companion object {
        fun newInstance() = SeninFragment()
    }

    private lateinit var viewModel: SeninViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.senin_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SeninViewModel::class.java)
        // TODO: Use the ViewModel
    }

}