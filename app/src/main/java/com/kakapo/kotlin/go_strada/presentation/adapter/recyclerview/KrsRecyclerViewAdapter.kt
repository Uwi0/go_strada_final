package com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.kakapo.kotlin.go_strada.databinding.ItemKrsBinding
import com.kakapo.kotlin.go_strada.domain.models.KrsData

class KrsRecyclerViewAdapter(
    private val fragment: Fragment,
    private val lists: List<KrsData>
) : RecyclerView.Adapter<KrsRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemKrsBinding.inflate(
            LayoutInflater.from(fragment.context),
            parent,
            false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = lists[position]
        holder.no.text = (position + 1).toString()
        holder.kodeMk.text = list.kodeMk
        holder.mataKuliah.text = list.mataKuliah
        holder.sks.text = list.sks
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    class ViewHolder(binding: ItemKrsBinding): RecyclerView.ViewHolder(binding.root){
        val no = binding.txtNo
        val kodeMk = binding.txtKodeMk
        val mataKuliah = binding.txtMataKuliah
        val sks = binding.txtSks
    }
}