package com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kakapo.kotlin.go_strada.databinding.ItemRequestSuratApprovedBinding
import com.kakapo.kotlin.go_strada.domain.models.SuratApproved

class SuratApprovedRecyclerViewAdapter(
    private val fragment: Fragment,
    private val lists: List<SuratApproved>
) : RecyclerView.Adapter<SuratApprovedRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRequestSuratApprovedBinding.inflate(
            LayoutInflater.from(fragment.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = lists[position]
        holder.keteranganSurat.text = list.keteranganSurat
        holder.tanggalSurat.text = list.tanggalSurat
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    class ViewHolder(binding: ItemRequestSuratApprovedBinding): RecyclerView.ViewHolder(binding.root){
        val keteranganSurat = binding.txtKeteranganSurat
        val tanggalSurat = binding.txtTanggalSurat
    }
}