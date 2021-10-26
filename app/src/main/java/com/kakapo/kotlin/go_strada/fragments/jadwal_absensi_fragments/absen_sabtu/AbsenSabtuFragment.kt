package com.kakapo.kotlin.go_strada.fragments.jadwal_absensi_fragments.absen_sabtu

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class AbsenSabtuFragment : Fragment() {

    companion object {
        fun newInstance() = AbsenSabtuFragment()
    }

    private lateinit var viewModel: AbsenSabtuViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.absen_sabtu_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AbsenSabtuViewModel::class.java)
        // TODO: Use the ViewModel
    }

}