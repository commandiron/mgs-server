package com.commandiron.routes.games

import com.commandiron.repository.games.GamesRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.searchGames() {
    val gamesRepository: GamesRepository by inject()

    get("/mgs/games/search") {
        val name = call.request.queryParameters["name"]

        val apiResponse = gamesRepository.searchGames(name)

        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )
    }
}