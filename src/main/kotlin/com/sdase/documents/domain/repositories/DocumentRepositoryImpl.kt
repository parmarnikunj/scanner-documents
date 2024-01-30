package com.sdase.documents.domain.repositories

import org.springframework.core.io.ClassPathResource
import org.springframework.stereotype.Repository
import java.nio.file.Files
import java.nio.file.Paths


@Repository
class DocumentRepositoryImpl: DocumentRepository {
    override fun get(id: String): ByteArray {
        val path = Paths.get(ClassPathResource("Testdaten_Rechnungseinreichung.pdf").uri)
        return Files.readAllBytes(path)
    }
}