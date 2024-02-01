package com.sdase.documents.domain.repositories

import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.stereotype.Repository


@Repository
class DocumentRepositoryImpl: DocumentRepository {
    override fun get(id: String): Resource {
        return ClassPathResource("Testdaten_Rechnungseinreichung.pdf")
    }
}