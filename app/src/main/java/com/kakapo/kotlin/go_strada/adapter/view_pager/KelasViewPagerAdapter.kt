package com.kakapo.kotlin.go_strada.adapter.view_pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kakapo.kotlin.go_strada.fragments.class_room_today_fragment.ClassRoomTodayFragment
import com.kakapo.kotlin.go_strada.fragments.coming_soon_fragment.ComingSoonFragment

private const val NUM_TABS = 2

class KelasViewPagerAdapter(fragmentManager: FragmentManager, lifeCycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifeCycle) {
    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> ClassRoomTodayFragment()
            1 -> ComingSoonFragment()
            else -> TODO()
        }
    }
}