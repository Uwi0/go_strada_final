package com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_absensi_fragments.absen_jumat

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class AbsenJumatFragment : Fragment() {

    companion object {
        fun newInstance() = AbsenJumatFragment()
    }

    private lateinit var viewModel: AbsenJumatViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.absen_jumat_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AbsenJumatViewModel::class.java)
        // TODO: Use the ViewModel
    }

}