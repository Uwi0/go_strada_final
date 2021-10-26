package com.kakapo.kotlin.go_strada.adapter.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kakapo.kotlin.go_strada.databinding.ItemComingSoonBinding
import com.kakapo.kotlin.go_strada.domain.models.KelasBerikutnya

class ClassComingSoonRecyclerViewAdapter(
    private val fragment: Fragment,
    private val lists: List<KelasBerikutnya>
) : RecyclerView.Adapter<ClassComingSoonRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemComingSoonBinding.inflate(
            LayoutInflater.from(fragment.context),
            parent,
            false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = lists[position]
        holder.namaDosen.text = list.namaDosen
        holder.materi.text = list.materi
        Glide.with(fragment).load(list.imgDosen).into(holder.avatarDosen)
    }

    override fun getItemCount(): Int {
        return lists.size
    }

    class ViewHolder(binding: ItemComingSoonBinding): RecyclerView.ViewHolder(binding.root){
        val namaDosen = binding.txtNamaDosenPangajar
        val avatarDosen = binding.imgDosenPengajar
        val materi = binding.txtMateri
    }
}