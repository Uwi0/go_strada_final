package com.kakapo.kotlin.go_strada.presentation.fragments.kalender_akademik_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kakapo.kotlin.go_strada.R

class KalenderAkademikFragment : Fragment() {

    companion object {
        fun newInstance() = KalenderAkademikFragment()
    }

    private lateinit var viewModel: KalenderAkademikViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.kalender_akademik_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(KalenderAkademikViewModel::class.java)
        // TODO: Use the ViewModel
    }

}