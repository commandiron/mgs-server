package com.commandiron.routes.characters

import com.commandiron.repository.characters.CharactersRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchCharacters() {
    val charactersRepository: CharactersRepository by inject()

    get("/mgs/characters/search") {
        val name = call.request.queryParameters["name"]

        val page = call.request.queryParameters["page"]?.toInt() ?: 1
        val limit = call.request.queryParameters["limit"]?.toInt() ?: 5

        val apiResponse = charactersRepository.searchCharacters(name, page, limit)

        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}