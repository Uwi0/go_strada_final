package com.kakapo.kotlin.go_strada.presentation.adapter.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.kakapo.kotlin.go_strada.databinding.ItemClassRoomTodayBinding
import com.kakapo.kotlin.go_strada.domain.models.MateriKelas

class ClassRoomTodayRecyclerViewAdapter(
    private val fragment: Fragment,
    private val listClass: List<MateriKelas>
) : RecyclerView.Adapter<ClassRoomTodayRecyclerViewAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemClassRoomTodayBinding.inflate(
                LayoutInflater.from(fragment.context),
                parent,
                false
            )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val list = listClass[position]
        holder.namaDosen.text = list.namaDosen
        holder.materi.text = list.materi
        Glide.with(fragment).load(list.imgDosen).into(holder.avatarDosen)
    }

    override fun getItemCount(): Int {
        return listClass.size
    }

    class ViewHolder(binding: ItemClassRoomTodayBinding) : RecyclerView.ViewHolder(binding.root) {
        val namaDosen = binding.txtNamaDosenPangajar
        val avatarDosen = binding.imgDosenPengajar
        val materi = binding.txtMateri
    }
}