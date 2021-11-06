package com.kakapo.kotlin.go_strada.presentation.fragments.khs_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.go_strada.R
import com.kakapo.kotlin.go_strada.databinding.KhsFragmentBinding
import com.kakapo.kotlin.go_strada.domain.models.KhsData
import com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview.KhsRecyclerViewAdapter

class KhsFragment : Fragment() {

    companion object {
        fun newInstance() = KhsFragment()
    }

    private lateinit var viewModel: KhsViewModel
    private var _binding: KhsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = KhsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(KhsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createKhsRecyclerView()
    }

    private fun createKhsRecyclerView(){
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listKhs = fakeListDataKhs()
        val adapter = KhsRecyclerViewAdapter(this, listKhs)
        binding.rcKrs.layoutManager = linearLayoutManager
        binding.rcKrs.adapter = adapter
    }

    private fun fakeListDataKhs(): List<KhsData>{
        val listKhs = mutableListOf<KhsData>()
        val khs1 = KhsData(
            nilai = "A",
            namaMatkul = "Ketrampilan Dasar Klinik Kebidanan",
            namaMatkulInggris = "The basic skills of midwifery clinics",
            sks = "3 SKS",
            kodeMatkul = "Kode : BD3. 19001",
            bobot = "Bobot : 12"
        )
        listKhs.add(khs1)
        val khs2 = KhsData(
            nilai = "B",
            namaMatkul = "Anfis dan Biologi Perkembangan",
            namaMatkulInggris = "Anfis and Biology Development",
            sks = "2 SKS",
            kodeMatkul = "Kode : BD3. 19002",
            bobot = "Bobot : 8"
        )
        listKhs.add(khs2)
        val khs3 = KhsData(
            nilai = "C",
            namaMatkul = "Konsep Kebidanan",
            namaMatkulInggris = "Concept of midwifery",
            sks = "4 SKS",
            kodeMatkul = "Kode : BD3. 19003",
            bobot = "Bobot : 16"
        )
        listKhs.add(khs3)
        val khs4 = KhsData(
            nilai = "A",
            namaMatkul = "Asuhan kebidanan kehamilan 1",
            namaMatkulInggris = "Pregnancy midwifery care 1",
            sks = "2 SKS",
            kodeMatkul = "Kode : BD3. 19004",
            bobot = "Bobot : 8"
        )
        listKhs.add(khs4)
        return listKhs
    }

}