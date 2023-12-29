package com.example.datainternet.repository

import com.example.datainternet.model.Kontak
import com.example.datainternet.service_api.KontakService

interface KontakRepository {
    /** Fetches list of Kontak from kontakApi */
    suspend fun getKontak(): List<Kontak>
    suspend fun deleteKontak(id: Int): Boolean
    suspend fun insertKontak(kontak: Kontak): Boolean
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    /** Fetches list of Kontak from kontakApi*/
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
    override suspend fun deleteKontak(id: Int): Boolean {
        val response = kontakApiService.deleteKontak(id)
        return response.isSuccessful
    }
    override suspend fun insertKontak(kontak: Kontak): Boolean {
        val response = kontakApiService.insertKontak(kontak)
        return response.isSuccessful
    }
}