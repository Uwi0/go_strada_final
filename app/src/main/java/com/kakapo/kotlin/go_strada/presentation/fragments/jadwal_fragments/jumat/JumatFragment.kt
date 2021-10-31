package com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.jumat

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class JumatFragment : Fragment() {

    companion object {
        fun newInstance() = JumatFragment()
    }

    private lateinit var viewModel: JumatViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.jumat_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(JumatViewModel::class.java)
        // TODO: Use the ViewModel
    }

}