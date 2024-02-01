package com.sdase.documents.domain.repositories

import org.springframework.core.io.ClassPathResource
import org.springframework.core.io.Resource
import org.springframework.stereotype.Repository
import java.nio.file.Files
import java.nio.file.Paths


@Repository
class DocumentRepositoryImpl: DocumentRepository {
    override fun get(id: String): Resource {
        return ClassPathResource("Testdaten_Rechnungseinreichung.pdf")
    }
}