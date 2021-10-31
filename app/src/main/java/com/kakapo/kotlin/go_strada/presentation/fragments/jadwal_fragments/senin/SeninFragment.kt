package com.kakapo.kotlin.go_strada.presentation.fragments.jadwal_fragments.senin

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.go_strada.R
import com.kakapo.kotlin.go_strada.databinding.SeninFragmentBinding
import com.kakapo.kotlin.go_strada.domain.models.JadwalKuliah
import com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview.JadwalPerkuliahanRecyclerViewAdapter

class SeninFragment : Fragment() {

    companion object {
        fun newInstance() = SeninFragment()
    }

    private lateinit var viewModel: SeninViewModel
    private var _binding: SeninFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SeninFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SeninViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createRecyclerViewJadwalHariSenin()
    }

    private fun createRecyclerViewJadwalHariSenin(){
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listJadwal = fakeListJadwalHariSenin()
        val adapter = JadwalPerkuliahanRecyclerViewAdapter(fragment = this, lists = listJadwal)
        binding.rcJadwalMatkul.layoutManager = linearLayoutManager
        binding.rcJadwalMatkul.adapter = adapter
    }

    private fun fakeListJadwalHariSenin(): List<JadwalKuliah>{
        val listJadwal = mutableListOf<JadwalKuliah>()
        val jadwalKuliah1 = JadwalKuliah(
            matkul = "Kuliah Metodologi Penelitian",
            jamMasuk = "12.00 WIB",
            jamPulang = "13.45 WIB",
            gedungPerkuliahan = "Gedung Adipama Lantai 5"
        )
        listJadwal.add(jadwalKuliah1)
        val jadwalKuliah2 = JadwalKuliah(
            matkul = "Kuliah Metodologi Penelitian",
            jamMasuk = "12.00 WIB",
            jamPulang = "13.45 WIB",
            gedungPerkuliahan = "Gedung Adipama Lantai 5"
        )
        listJadwal.add(jadwalKuliah2)
        return listJadwal
    }

}