package com.kakapo.kotlin.go_strada.adapter.view_pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kakapo.kotlin.go_strada.fragments.jadwal_absensi_fragments.absen_jumat.AbsenJumatFragment
import com.kakapo.kotlin.go_strada.fragments.jadwal_absensi_fragments.absen_kamis.AbsenKamisFragment
import com.kakapo.kotlin.go_strada.fragments.jadwal_absensi_fragments.absen_rabu.AbsenRabuFragment
import com.kakapo.kotlin.go_strada.fragments.jadwal_absensi_fragments.absen_sabtu.AbsenSabtuFragment
import com.kakapo.kotlin.go_strada.fragments.jadwal_absensi_fragments.absen_selasa.AbsenSelasaFragment
import com.kakapo.kotlin.go_strada.fragments.jadwal_absensi_fragments.absen_senin.AbsenSeninFragment

private const val NUM_TABS = 6

class AbsensiViewPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> AbsenSeninFragment()
            1 -> AbsenSelasaFragment()
            2 -> AbsenRabuFragment()
            3 -> AbsenKamisFragment()
            4 -> AbsenJumatFragment()
            else -> AbsenSabtuFragment()
        }
    }
}