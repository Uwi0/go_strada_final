package com.kakapo.kotlin.go_strada.presentation.fragments.khs_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class KhsFragment : Fragment() {

    companion object {
        fun newInstance() = KhsFragment()
    }

    private lateinit var viewModel: KhsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.khs_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(KhsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}