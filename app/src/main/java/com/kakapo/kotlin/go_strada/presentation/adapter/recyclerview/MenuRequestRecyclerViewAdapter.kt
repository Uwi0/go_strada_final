package com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kakapo.kotlin.go_strada.databinding.ItemRequestSuratBinding
import com.kakapo.kotlin.go_strada.domain.models.RequestSurat

class MenuRequestRecyclerViewAdapter(
    private val fragment: Fragment,
    private val lists: List<RequestSurat>
) : RecyclerView.Adapter<MenuRequestRecyclerViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemRequestSuratBinding.inflate(
            LayoutInflater.from(fragment.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val list = lists[position]
        holder.keteranganSurat.text = list.keterangan
        holder.tanggalSurat.text = list.tanggal
        holder.statusSurat.text = list.status
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    class ViewHolder(binding: ItemRequestSuratBinding): RecyclerView.ViewHolder(binding.root){
        val keteranganSurat = binding.tvKeterangan
        val tanggalSurat = binding.tvTanggal
        val statusSurat = binding.tvStatus
    }
}