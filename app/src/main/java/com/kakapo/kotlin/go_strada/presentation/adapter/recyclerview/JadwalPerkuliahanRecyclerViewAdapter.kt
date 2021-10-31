package com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment

import androidx.recyclerview.widget.RecyclerView
import com.kakapo.kotlin.go_strada.databinding.ItemJadwalKuliahBinding
import com.kakapo.kotlin.go_strada.domain.models.JadwalKuliah

class JadwalPerkuliahanRecyclerViewAdapter(
    private val fragment: Fragment,
    private val lists: List<JadwalKuliah>
) : RecyclerView.Adapter<JadwalPerkuliahanRecyclerViewAdapter.ViewHolder>(){

    class ViewHolder(binding: ItemJadwalKuliahBinding): RecyclerView.ViewHolder(binding.root){
        val matkul = binding.txtMatkul
        val jamMasuk = binding.txtJamMasuk
        val jamPulang = binding.txtJamPulang
        val gedungPerkuliahan = binding.txtGedungPerkuliahan
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemJadwalKuliahBinding.inflate(
            LayoutInflater.from(fragment.context),
            parent,
            false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = lists[position]
        holder.matkul.text = list.matkul
        holder.jamMasuk.text = list.jamMasuk
        holder.jamPulang.text = list.jamPulang
        holder.gedungPerkuliahan.text = list.gedungPerkuliahan
    }

    override fun getItemCount(): Int {
        return lists.size
    }
}