package com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.kamis

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class KamisFragment : Fragment() {

    companion object {
        fun newInstance() = KamisFragment()
    }

    private lateinit var viewModel: KamisViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.kamis_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(KamisViewModel::class.java)
        // TODO: Use the ViewModel
    }

}