package com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kakapo.kotlin.go_strada.databinding.ItemKhsBinding
import com.kakapo.kotlin.go_strada.domain.models.KhsData

class KhsRecyclerViewAdapter(
    private val fragment: Fragment,
    private val lists: List<KhsData>
) : RecyclerView.Adapter<KhsRecyclerViewAdapter.ViewHolder>() {

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
        holder.nilai.text = list.nilai
        holder.namaMatkul.text = list.namaMatkul
        holder.namaMatkulInggris.text = list.namaMatkulInggris
        holder.sksMatkul.text = list.sks
        holder.kodeMatkul.text = list.kodeMatkul
        holder.bobotMatkul.text = list.bobot
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    class ViewHolder(binding: ItemKhsBinding) : RecyclerView.ViewHolder(binding.root) {
        val nilai = binding.txtNilai
        val namaMatkul = binding.txtMatkul
        val namaMatkulInggris = binding.txtMatkulInggris
        val sksMatkul = binding.txtSks
        val kodeMatkul = binding.txtKodeMatkul
        val bobotMatkul = binding.txtBobotMatkul
    }
}
