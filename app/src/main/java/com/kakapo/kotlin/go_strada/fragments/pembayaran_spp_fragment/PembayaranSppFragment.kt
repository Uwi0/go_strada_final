package com.kakapo.kotlin.go_strada.fragments.pembayaran_spp_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class PembayaranSppFragment : Fragment() {

    companion object {
        fun newInstance() = PembayaranSppFragment()
    }

    private lateinit var viewModel: PembayaranSppViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.pembayaran_spp_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PembayaranSppViewModel::class.java)
        // TODO: Use the ViewModel
    }

}