package com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.rabu

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class RabuFragment : Fragment() {

    companion object {
        fun newInstance() = RabuFragment()
    }

    private lateinit var viewModel: RabuViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.rabu_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RabuViewModel::class.java)
        // TODO: Use the ViewModel
    }

}