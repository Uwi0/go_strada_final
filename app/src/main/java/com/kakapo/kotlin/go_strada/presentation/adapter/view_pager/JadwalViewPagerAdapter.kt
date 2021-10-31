package com.kakapo.kotlin.go_strada.presentation.adapter.view_pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.jumat.JumatFragment
import com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.kamis.KamisFragment
import com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.rabu.RabuFragment
import com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.sabtu.SabtuFragment
import com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.selasa.SelasaFragment
import com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.senin.SeninFragment

private const val NUM_TABS = 6

class JadwalViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> SeninFragment()
            1 -> SelasaFragment()
            2 -> RabuFragment()
            3 -> KamisFragment()
            4 -> JumatFragment()
            else -> SabtuFragment()
        }
    }
}