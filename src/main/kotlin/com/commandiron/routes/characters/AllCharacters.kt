package com.commandiron.routes.characters

import com.commandiron.models.character.CharacterApiResponse
import com.commandiron.repository.characters.CharactersRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllCharacters() {

    val charactersRepository: CharactersRepository by inject()

        get("/mgs/characters") {
        try {
            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            val limit = call.request.queryParameters["limit"]?.toInt() ?: 5

            val apiResponse = charactersRepository.getAllCharacters(page, limit)

            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )

        } catch (e: NumberFormatException) {
            call.respond(
                message = CharacterApiResponse(success = false, message = "Only Numbers Allowed"),
                status = HttpStatusCode.BadRequest
            )
        } catch (e: IllegalArgumentException) {
            call.respond(
                message = CharacterApiResponse(success = false, message = "Characters Not Found."),
                status = HttpStatusCode.NotFound
            )
        }

    }
}