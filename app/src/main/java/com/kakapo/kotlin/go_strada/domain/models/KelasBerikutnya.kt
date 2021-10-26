package com.kakapo.kotlin.go_strada.domain.models

data class KelasBerikutnya(
    val imgDosen: Int,
    val namaDosen: String,
    val materi: String,
    val keteranganKelas: String? = null
)