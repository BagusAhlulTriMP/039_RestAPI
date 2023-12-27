package com.example.datainternet.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class Kontak(
    val id: Int,
    @SerialName(value = "nama")
    val nama: String,
    @SerialName(value = "alamat")
    val alamat: String,
    @SerialName(value = "no_hp")
    val nohp: String,
    @SerialName(value = "email")
    val email: String,
)
