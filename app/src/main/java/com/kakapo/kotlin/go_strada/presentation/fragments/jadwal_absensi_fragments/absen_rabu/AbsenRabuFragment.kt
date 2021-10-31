package com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_absensi_fragments.absen_rabu

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class AbsenRabuFragment : Fragment() {

    companion object {
        fun newInstance() = AbsenRabuFragment()
    }

    private lateinit var viewModel: AbsenRabuViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.absen_rabu_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AbsenRabuViewModel::class.java)
        // TODO: Use the ViewModel
    }

}