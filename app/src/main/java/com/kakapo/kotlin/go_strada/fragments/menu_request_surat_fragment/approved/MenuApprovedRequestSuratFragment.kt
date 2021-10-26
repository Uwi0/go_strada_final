package com.kakapo.kotlin.go_strada.fragments.menu_request_surat_fragment.approved

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class MenuApprovedRequestSuratFragment : Fragment() {

    companion object {
        fun newInstance() = MenuApprovedRequestSuratFragment()
    }

    private lateinit var viewModel: MenuApprovedRequestSuratViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.menu_aproved_request_surat_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MenuApprovedRequestSuratViewModel::class.java)
        // TODO: Use the ViewModel
    }

}