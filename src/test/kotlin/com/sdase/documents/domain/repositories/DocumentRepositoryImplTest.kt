package com.sdase.documents.domain.repositories

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DocumentRepositoryImplTest {
    private val documentRepository: DocumentRepository = DocumentRepositoryImpl()
    @Test
    fun `should return a document`() {

        val document = documentRepository.get("1234.pdf")

        assertThat(document).isNotEmpty()

    }
}