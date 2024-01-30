package com.sdase.documents.domain.repositories

interface DocumentRepository {
    fun get(id: String): ByteArray
}