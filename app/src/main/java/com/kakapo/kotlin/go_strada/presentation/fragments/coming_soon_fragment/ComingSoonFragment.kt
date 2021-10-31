package com.kakapo.kotlin.go_strada.presentation.fragments.coming_soon_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.go_strada.R
import com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview.ClassComingSoonRecyclerViewAdapter
import com.kakapo.kotlin.go_strada.databinding.FragmentComingSoonBinding
import com.kakapo.kotlin.go_strada.domain.models.KelasBerikutnya

class ComingSoonFragment : Fragment() {

    private var _binding: FragmentComingSoonBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentComingSoonBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createRecyclerViewClassSoon()
    }

    private fun createRecyclerViewClassSoon(){
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listClassSoon =  fakeClassSoonList()
        val adapter = ClassComingSoonRecyclerViewAdapter(this, listClassSoon)
        binding.rcClassComingSoon.layoutManager = linearLayoutManager
        binding.rcClassComingSoon.adapter = adapter
    }

    private fun fakeClassSoonList(): List<KelasBerikutnya>{
        val list = mutableListOf<KelasBerikutnya>()
        val classSoon1 = KelasBerikutnya(
            namaDosen = "uwi",
            materi = "tes",
            imgDosen = R.drawable.user_icon
        )
        list.add(classSoon1)
        list.add(classSoon1)
        list.add(classSoon1)
        list.add(classSoon1)
        list.add(classSoon1)
        list.add(classSoon1)
        list.add(classSoon1)
        list.add(classSoon1)
        list.add(classSoon1)
        return list
    }
}