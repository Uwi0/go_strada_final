package com.kakapo.kotlin.go_strada.fragments.request_surat_fragment

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.kakapo.kotlin.go_strada.adapter.view_pager.RequestSuratViewPagerAdapter
import com.kakapo.kotlin.go_strada.databinding.RequestSuratFragmentBinding

class RequestSuratFragment : Fragment() {

    private val menuArrays = arrayOf(
        "Request",
        "Approved",
        "Guide"
    )

    companion object {
        fun newInstance() = RequestSuratFragment()
    }

    private lateinit var viewModel: RequestSuratViewModel
    private var _binding: RequestSuratFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var myContext: FragmentActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RequestSuratFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RequestSuratViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onAttach(context: Context) {
        myContext = (activity as FragmentActivity)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = binding.viewPager
        val tabLayout = binding.tabLayout

        val adapter = RequestSuratViewPagerAdapter(
            lifecycle = lifecycle,
            fragmentManager = myContext.supportFragmentManager
        )

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = menuArrays[position]
        }.attach()
    }

}