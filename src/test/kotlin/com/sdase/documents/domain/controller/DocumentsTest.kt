package com.sdase.documents.domain.controller

import com.sdase.documents.domain.repositories.DocumentRepository
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.platform.engine.support.descriptor.ClasspathResourceSource
import org.springframework.core.io.ClassPathResource
import java.nio.file.Files
import java.nio.file.Paths

class DocumentsTest {

    private val documentRepository = mockk<DocumentRepository>()
    private val documents = Documents(documentRepository)

    @Test
    fun `it should return a document`() {
        val path = Paths.get(ClassPathResource("Testdaten_Rechnungseinreichung.pdf").uri)
        every { documentRepository.get(any()) } returns Files.readAllBytes(path)

        val document = documents.document("12345.pdf")

        verify { documentRepository.get(any()) }
        assertThat(document).isNotNull
    }
}