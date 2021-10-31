package com.kakapo.kotlin.go_strada.presentation.fragments.menu_request_surat_fragments.approved

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.go_strada.R
import com.kakapo.kotlin.go_strada.databinding.MenuAprovedRequestSuratFragmentBinding
import com.kakapo.kotlin.go_strada.domain.models.SuratApproved
import com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview.SuratApprovedRecyclerViewAdapter

class MenuApprovedRequestSuratFragment : Fragment() {

    companion object {
        fun newInstance() = MenuApprovedRequestSuratFragment()
    }

    private lateinit var viewModel: MenuApprovedRequestSuratViewModel
    private var _binding: MenuAprovedRequestSuratFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MenuAprovedRequestSuratFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MenuApprovedRequestSuratViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        createRecyclerViewSuratApproved()
    }

    private fun createRecyclerViewSuratApproved(){
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listSuratApproved = fakeDataSuratApproved()
        val adapter = SuratApprovedRecyclerViewAdapter(this, listSuratApproved)
        binding.rcSuratApproved.layoutManager = linearLayoutManager
        binding.rcSuratApproved.adapter = adapter
    }

    private fun fakeDataSuratApproved(): List<SuratApproved>{
        val listSuratApproved = mutableListOf<SuratApproved>()
        val surat1 = SuratApproved(
            keteranganSurat = "Surat Keterangan Kuliah",
            tanggalSurat = ""
        )
        listSuratApproved.add(surat1)
        val surat2 = SuratApproved(
            keteranganSurat = "Surat Keterangan Survey",
            tanggalSurat = "22 Jan 2020"
        )
        listSuratApproved.add(surat2)
        val surat3 = SuratApproved(
            keteranganSurat = "Surat Keterangan Survey",
            tanggalSurat = "25 Jan 2020"
        )
        listSuratApproved.add(surat3)
        val surat4 = SuratApproved(
            keteranganSurat = "Surat Keterangan",
            tanggalSurat = "25 Jan 2020"
        )
        listSuratApproved.add(surat4)

        return listSuratApproved
    }

}