package com.kakapo.kotlin.go_strada.presentation.fragments.menu_request_surat_fragments.request

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview.MenuRequestRecyclerViewAdapter
import com.kakapo.kotlin.go_strada.databinding.MenuRequestRequestSuratFragmentBinding
import com.kakapo.kotlin.go_strada.domain.models.RequestSurat

class MenuRequestRequestSuratFragment : Fragment() {

    companion object {
        fun newInstance() = MenuRequestRequestSuratFragment()
    }

    private lateinit var viewModel: MenuRequestRequestSuratViewModel
    private var _binding: MenuRequestRequestSuratFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MenuRequestRequestSuratFragmentBinding.inflate(
            inflater,
            container,
            false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MenuRequestRequestSuratViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createRecyclerViewRequestSurat()
    }

    private fun createRecyclerViewRequestSurat(){
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listRequestSurat = fakeRequestSuratList()
        val adapter = MenuRequestRecyclerViewAdapter(this, listRequestSurat)
        binding.rcMenuRequestSurat.layoutManager = linearLayoutManager
        binding.rcMenuRequestSurat.adapter = adapter
    }

    private fun fakeRequestSuratList(): List<RequestSurat>{
        val list = mutableListOf<RequestSurat>()
        val requestSurat1 = RequestSurat(
            keterangan = "Surat Keterangan Kuliah",
            tanggal = "30 Maret 2021",
            status = "Need Approval"
        )
        list.add(requestSurat1)
        val requestSurat2 = RequestSurat(
            keterangan = "Surat Keterangan Praktek",
            tanggal = "30 Maret 2021",
            status = "Need Approval"
        )
        list.add(requestSurat2)
        val requestSurat3 = RequestSurat(
            keterangan = "Surat Praktikum Lapangan",
            tanggal = "30 Maret 2021",
            status = "Need Approval"
        )
        list.add(requestSurat3)

        return list
    }

}