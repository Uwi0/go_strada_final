package com.kakapo.kotlin.go_strada.presentation.fragments.transkrip_nilai_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class TranskripNilaiFragment : Fragment() {

    companion object {
        fun newInstance() = TranskripNilaiFragment()
    }

    private lateinit var viewModel: TranskripNilaiViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.transkrip_nilai_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TranskripNilaiViewModel::class.java)
        // TODO: Use the ViewModel
    }

}