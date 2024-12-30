package com.example.pertemuan12.repository

interface MahasiswaRepository {

    suspend fun  insertMahasiswa(mahasiswa: Mahasiswa)

    suspend fun getMahasiswa(): List<Mahasiswa>

    suspend fun getMahasiswaByNim(nim: String):Mahasiswa

    suspend fun updateMahasiswa(nim: String, mahasiswa: Mahasiswa)

    suspend fun deleteMahasiswa(nim: String)
}

class MahasiswaRepository{
    private val kontakApiService
}