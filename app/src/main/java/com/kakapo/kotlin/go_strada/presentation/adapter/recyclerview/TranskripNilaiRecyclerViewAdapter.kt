package com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kakapo.kotlin.go_strada.databinding.ItemKhsBinding
import com.kakapo.kotlin.go_strada.domain.models.TranskripNilai

class TranskripNilaiRecyclerViewAdapter(
    private var fragment: Fragment,
    private val lists: List<TranskripNilai>
) : RecyclerView.Adapter<TranskripNilaiRecyclerViewAdapter.ViewHolder>(){

    class ViewHolder(binding: ItemKhsBinding): RecyclerView.ViewHolder(binding.root){
        val namaMatkul = binding.txtMatkul
        val namaMatkulInggris = binding.txtMatkulInggris
        val nilaiMatkul = binding.txtNilai
        val sksMatkul = binding.txtSks
        val bobotMatkul = binding.txtBobotMatkul
        val kodeMatkul = binding.txtKodeMatkul
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemKhsBinding.inflate(
            LayoutInflater.from(fragment.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = lists[position]
        holder.namaMatkul.text = list.namaMatkul
        holder.namaMatkulInggris.text = list.namaMatkulInggris
        holder.nilaiMatkul.text = list.nilai
        holder.sksMatkul.text = list.sks
        holder.bobotMatkul.text = list.bobot
        holder.kodeMatkul.text = list.kodeMatkul
    }

    override fun getItemCount(): Int {
        return lists.size
    }
}