package com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kakapo.kotlin.go_strada.databinding.ItemAbsenBinding
import com.kakapo.kotlin.go_strada.domain.models.AbsenHarian

class AbsenRecyclerViewAdapter(
    private val fragment: Fragment,
    private val lists: List<AbsenHarian>
) : RecyclerView.Adapter<AbsenRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding = ItemAbsenBinding.inflate(
            LayoutInflater.from(fragment.context),
            parent,
            false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = lists[position]
        holder.nomor.text = (position + 1).toString()
        holder.absenMatkul.text = list.matkul
        holder.jamMatkul.text = list.jam
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    class ViewHolder(binding: ItemAbsenBinding) : RecyclerView.ViewHolder(binding.root) {
        val nomor = binding.txtNumberColumn
        val absenMatkul = binding.txtAbsenMatkul
        val jamMatkul = binding.txtJamMatkul
    }
}