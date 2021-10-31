package com.kakapo.kotlin.go_strada.presentation.fragments.krs_fragment

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.kakapo.kotlin.go_strada.R
import com.kakapo.kotlin.go_strada.databinding.KrsFragmentBinding
import com.kakapo.kotlin.go_strada.domain.models.KrsData
import com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview.KrsRecyclerViewAdapter

class KrsFragment : Fragment() {

    companion object {
        fun newInstance() = KrsFragment()
    }

    private lateinit var viewModel: KrsViewModel
    private var _binding: KrsFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = KrsFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(KrsViewModel::class.java)
        // TODO: Use the ViewModel
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dropDownMenuPilihSemesterAdapter()
        createRecyclerViewKrs()
    }

    private fun dropDownMenuPilihSemesterAdapter(){
        val adapter = ArrayAdapter(
            requireActivity(),
            R.layout.simple_menu_item,
            fakeDropDownMenu()
        )

        binding.txtAutoComplete.setAdapter(adapter)
    }

    private fun fakeDropDownMenu(): ArrayList<String>{
        val menu = ArrayList<String>()
        menu.add("semester 1")
        menu.add("semester 2")
        menu.add("semester 3")
        menu.add("semester 4")
        menu.add("semester 5")
        menu.add("semester 6")

        return menu
    }

    private fun createRecyclerViewKrs(){
        val linearLayoutManager = LinearLayoutManager(requireActivity())
        val listKrs = fakeDataKrs()
        val adapter = KrsRecyclerViewAdapter(this, listKrs)
        binding.rcKrs.layoutManager = linearLayoutManager
        binding.rcKrs.adapter = adapter
    }

    private fun fakeDataKrs(): List<KrsData>{
        val listKrsData = mutableListOf<KrsData>()
        val krsData1 = KrsData(
            kodeMk = "BD3. 19001",
            mataKuliah = "Ketrampilan Dasar klinik Kebidanan The basic skills of midwifery clinics",
            sks = "3"
        )
        listKrsData.add(krsData1)
        val krsData2 = KrsData(
            kodeMk = "BD3. 19002",
            mataKuliah = "Anfis dan Biologi Perkembangan ANFIS and Biology Developments",
            sks = "2"
        )
        listKrsData.add(krsData2)
        val krsData3 = KrsData(
            kodeMk = "BD3. 19003",
            mataKuliah = "Konsep Kebidanan Concept of midwifery",
            sks = "4"
        )
        listKrsData.add(krsData3)
        val krsData4 = KrsData(
            kodeMk = "BD3. 19004",
            mataKuliah = "Asuhan kebidanan Kehamilan 1 Pregnancy midwifery care 1",
            sks = "2"
        )
        listKrsData.add(krsData4)
        return listKrsData
    }

}