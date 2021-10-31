package com.kakapo.kotlin.go_strada.presentation.fragments.class_room_today_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.go_strada.R
import com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview.ClassRoomTodayRecyclerViewAdapter
import com.kakapo.kotlin.go_strada.databinding.FragmentClassRoomTodayBinding
import com.kakapo.kotlin.go_strada.domain.models.MateriKelas

class ClassRoomTodayFragment : Fragment() {

    private var _binding: FragmentClassRoomTodayBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentClassRoomTodayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createRecyclerViewClass()
    }

    private fun createRecyclerViewClass(){
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listKelas = fakeListMateri()
        val adapter = ClassRoomTodayRecyclerViewAdapter(this, listKelas)
        binding.rcKelasHariIni.layoutManager = linearLayoutManager
        binding.rcKelasHariIni.adapter = adapter
    }

    private fun fakeListMateri(): List<MateriKelas>{
        val kelas = mutableListOf<MateriKelas>()
        val kelas1 = MateriKelas(
            namaDosen = "test1",
            materi = "tes",
            imgDosen = R.drawable.user_icon,
        )
        kelas.add(kelas1)
        kelas.add(kelas1)
        kelas.add(kelas1)
        kelas.add(kelas1)
        return kelas
    }

}