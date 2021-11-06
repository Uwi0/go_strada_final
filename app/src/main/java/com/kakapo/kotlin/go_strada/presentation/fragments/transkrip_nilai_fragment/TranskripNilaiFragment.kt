package com.kakapo.kotlin.go_strada.presentation.fragments.transkrip_nilai_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.go_strada.databinding.TranskripNilaiFragmentBinding
import com.kakapo.kotlin.go_strada.domain.models.TranskripNilai
import com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview.TranskripNilaiRecyclerViewAdapter

class TranskripNilaiFragment : Fragment() {

    companion object {
        fun newInstance() = TranskripNilaiFragment()
    }

    private lateinit var viewModel: TranskripNilaiViewModel
    private var _binding: TranskripNilaiFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = TranskripNilaiFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(TranskripNilaiViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createTranskripNilaiRecyclerView()
    }

    private fun createTranskripNilaiRecyclerView(){
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listData = fakeDataTranskripNilai()
        val adapter = TranskripNilaiRecyclerViewAdapter(this, listData)
        binding.rcTrannskripNilai.layoutManager = linearLayoutManager
        binding.rcTrannskripNilai.adapter = adapter
    }

    private fun fakeDataTranskripNilai(): List<TranskripNilai>{
        val listTranskripNilai = mutableListOf<TranskripNilai>()
        val transkripNilai1 = TranskripNilai(
            nilai = "A",
            namaMatkul = "Ketrampilan Dasar Klinik Kebidanan",
            namaMatkulInggris = "The basic skills of midwifery clinics",
            sks = "3 SKS",
            kodeMatkul = "Kode : BD3. 19001",
            bobot = "Bobot : 12"
        )
        listTranskripNilai.add(transkripNilai1)
        val transkripNilai2 = TranskripNilai(
            nilai = "B",
            namaMatkul = "Anfis dan Biologi Perkembangan",
            namaMatkulInggris = "Anfis and Biology Development",
            sks = "2 SKS",
            kodeMatkul = "Kode : BD3. 19002",
            bobot = "Bobot : 8"
        )
        listTranskripNilai.add(transkripNilai2)
        val transkripNilai3 = TranskripNilai(
            nilai = "C",
            namaMatkul = "Konsep Kebidanan",
            namaMatkulInggris = "Concept of midwifery",
            sks = "4 SKS",
            kodeMatkul = "Kode : BD3. 19003",
            bobot = "Bobot : 16"
        )
        listTranskripNilai.add(transkripNilai3)
        val transkripNilai4 = TranskripNilai(
            nilai = "A",
            namaMatkul = "Asuhan kebidanan kehamilan 1",
            namaMatkulInggris = "Pregnancy midwifery care 1",
            sks = "2 SKS",
            kodeMatkul = "Kode : BD3. 19004",
            bobot = "Bobot : 8"
        )
        listTranskripNilai.add(transkripNilai4)
        return listTranskripNilai
    }

}