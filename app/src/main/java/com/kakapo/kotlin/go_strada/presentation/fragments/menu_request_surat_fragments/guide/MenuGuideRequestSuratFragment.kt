package com.kakapo.kotlin.go_strada.presentation.fragments.menu_request_surat_fragments.guide

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class MenuGuideRequestSuratFragment : Fragment() {

    companion object {
        fun newInstance() = MenuGuideRequestSuratFragment()
    }

    private lateinit var viewModel: MenuGuideRequestSuratViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.menu_guide_request_surat_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MenuGuideRequestSuratViewModel::class.java)
        // TODO: Use the ViewModel
    }

}