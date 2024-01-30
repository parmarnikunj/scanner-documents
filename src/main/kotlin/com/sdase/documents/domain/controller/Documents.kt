package com.sdase.documents.domain.controller

import com.sdase.documents.domain.repositories.DocumentRepository
import org.springframework.core.io.ByteArrayResource
import org.springframework.core.io.ClassPathResource
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono
import java.nio.file.Files
import java.nio.file.Paths

@RestController
@RequestMapping("/documents")
class Documents(private val documentRepository: DocumentRepository) {

    @GetMapping(
        "/{docId}",
        produces = [MediaType.APPLICATION_PDF_VALUE]
        )
    fun document(@PathVariable docId:String): Mono<ResponseEntity<ByteArray>> {
        val responce =  ResponseEntity
            .ok()
            .body(documentRepository.get(docId))
        return Mono.just(responce)
    }
}