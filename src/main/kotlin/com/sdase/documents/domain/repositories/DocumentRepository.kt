package com.sdase.documents.domain.repositories

import org.springframework.core.io.Resource

interface DocumentRepository {
    fun get(id: String): Resource
}