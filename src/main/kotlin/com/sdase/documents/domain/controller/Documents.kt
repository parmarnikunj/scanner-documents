package com.sdase.documents.domain.controller

import com.sdase.documents.domain.repositories.DocumentRepository
import org.springframework.core.io.InputStreamResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/documents")
class Documents(private val documentRepository: DocumentRepository) {

    @GetMapping("/{docId}", produces = [MediaType.APPLICATION_PDF_VALUE])
    fun document(@PathVariable docId:String): ResponseEntity<InputStreamResource> {
        val response =  ResponseEntity
            .ok()
            .body(InputStreamResource(documentRepository.get(docId).inputStream))
        return response
    }
}