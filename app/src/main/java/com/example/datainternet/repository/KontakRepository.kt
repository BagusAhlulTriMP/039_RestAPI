package com.example.datainternet.repository

import com.example.datainternet.model.Kontak
import com.example.datainternet.service_api.KontakService

interface KontakRepository {
    /** Fetches list of Kontak from kontakApi */
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    /** Fetches list of Kontak from kontakApi*/
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}