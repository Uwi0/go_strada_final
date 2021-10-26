package com.kakapo.kotlin.go_strada.fragments.jadwal_kuliah_fragment

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.kakapo.kotlin.go_strada.adapter.view_pager.JadwalViewPagerAdapter
import com.kakapo.kotlin.go_strada.databinding.JadwalKuliahFragmentBinding

class JadwalKuliahFragment : Fragment() {

    companion object {
        fun newInstance() = JadwalKuliahFragment()
    }

    private val hariJadwalKuliah = arrayOf(
        "Senin",
        "Selasa",
        "Rabu",
        "Kamis",
        "Jum'at",
        "Sabtu"
    )

    private lateinit var viewModel: JadwalKuliahViewModel
    private var _binding: JadwalKuliahFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var myContext: FragmentActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = JadwalKuliahFragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(JadwalKuliahViewModel::class.java)
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

        val adapter = JadwalViewPagerAdapter(
            lifecycle = lifecycle,
            fragmentManager = myContext.supportFragmentManager
        )

        viewPager.adapter = adapter
        tabLayout.tabMode = TabLayout.MODE_SCROLLABLE

        TabLayoutMediator(tabLayout, viewPager){tab, position ->
            tab.text = hariJadwalKuliah[position]
        }.attach()
    }

}