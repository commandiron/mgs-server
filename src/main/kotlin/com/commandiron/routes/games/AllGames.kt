package com.commandiron.routes.games

import com.commandiron.models.character.CharacterApiResponse
import com.commandiron.repository.games.GamesRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllGames() {

    val gamesRepository: GamesRepository by inject()

    get("/mgs/games") {
        try {

            val apiResponse = gamesRepository.getAllGames()

            call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )

        } catch (e: IllegalArgumentException) {
            call.respond(
                message = CharacterApiResponse(success = false, message = "Characters Not Found."),
                status = HttpStatusCode.NotFound
            )
        }
    }
}