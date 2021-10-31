package com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_absensi_fragments.absen_senin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview.AbsenRecyclerViewAdapter
import com.kakapo.kotlin.go_strada.databinding.AbsenSeninFragmentBinding
import com.kakapo.kotlin.go_strada.domain.models.AbsenHarian

class AbsenSeninFragment : Fragment() {

    companion object {
        fun newInstance() = AbsenSeninFragment()
    }

    private lateinit var viewModel: AbsenSeninViewModel
    private var _binding: AbsenSeninFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = AbsenSeninFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AbsenSeninViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createRecyclerViewAbsen()
    }

    private fun createRecyclerViewAbsen(){
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listAbsensi = fakeAbsensiData()
        val adapter = AbsenRecyclerViewAdapter(this, listAbsensi)
        binding.rcAbsenHarian.layoutManager = linearLayoutManager
        binding.rcAbsenHarian.adapter = adapter
    }

    private fun fakeAbsensiData(): List<AbsenHarian>{
        val listAbsen = mutableListOf<AbsenHarian>()
        val absenJam1 = AbsenHarian(
            matkul = "bahasa Indo",
            jam = "08.00"
        )
        listAbsen.add(absenJam1)
        listAbsen.add(absenJam1)
        listAbsen.add(absenJam1)
        listAbsen.add(absenJam1)
        listAbsen.add(absenJam1)

        return listAbsen
    }

}