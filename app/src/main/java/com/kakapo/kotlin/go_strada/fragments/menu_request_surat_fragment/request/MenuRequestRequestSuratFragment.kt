package com.kakapo.kotlin.go_strada.fragments.menu_request_surat_fragment.request

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class MenuRequestRequestSuratFragment : Fragment() {

    companion object {
        fun newInstance() = MenuRequestRequestSuratFragment()
    }

    private lateinit var viewModel: MenuRequestRequestSuratViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.menu_request_request_surat_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MenuRequestRequestSuratViewModel::class.java)
        // TODO: Use the ViewModel
    }

}