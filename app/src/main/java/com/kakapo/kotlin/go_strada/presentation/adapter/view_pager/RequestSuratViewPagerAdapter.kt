package com.kakapo.kotlin.go_strada.presentation.adapter.view_pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kakapo.kotlin.go_strada.presentation.fragments.menu_request_surat_fragments.approved.MenuApprovedRequestSuratFragment
import com.kakapo.kotlin.go_strada.presentation.fragments.menu_request_surat_fragments.guide.MenuGuideRequestSuratFragment
import com.kakapo.kotlin.go_strada.presentation.fragments.menu_request_surat_fragments.request.MenuRequestRequestSuratFragment


private const val NUM_TABS = 3

class RequestSuratViewPagerAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0 -> MenuRequestRequestSuratFragment()
            1 -> MenuApprovedRequestSuratFragment()
            else -> MenuGuideRequestSuratFragment()
        }
    }
}