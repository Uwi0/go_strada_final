package com.kakapo.kotlin.go_strada.presentation.fragments.absensi_fragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.kakapo.kotlin.go_strada.presentation.adapter.view_pager.AbsensiViewPagerAdapter
import com.kakapo.kotlin.go_strada.databinding.AbsensiFragmentBinding

class AbsensiFragment : Fragment() {

    private val jadwalAbsen = arrayOf(
        "Senin",
        "Selasa",
        "Rabu",
        "Kamis",
        "Jum'at",
        "Sabtu"
    )

    companion object {
        fun newInstance() = AbsensiFragment()
    }

    private lateinit var viewModel: AbsensiViewModel
    private var _binding: AbsensiFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var myContext: FragmentActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = AbsensiFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AbsensiViewModel::class.java)
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

        val adapter = AbsensiViewPagerAdapter(
            lifecycle = lifecycle,
            fragmentManager = myContext.supportFragmentManager
        )

        viewPager.adapter = adapter
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE

        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = jadwalAbsen[position]
        }.attach()
    }

}