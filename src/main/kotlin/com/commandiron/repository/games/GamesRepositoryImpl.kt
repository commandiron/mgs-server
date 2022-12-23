package com.commandiron.repository.games

import com.commandiron.models.games.Game
import com.commandiron.models.games.GameApiResponse

class GamesRepositoryImpl: GamesRepository {

    override val games = Game.games

    override suspend fun getAllGames(): GameApiResponse {
        return  GameApiResponse(
            success = true,
            message = "ok",
            games = games,
            lastUpdated = System.currentTimeMillis()
        )
    }

    override suspend fun searchGames(query: String?): GameApiResponse {
        return  GameApiResponse(
            success = true,
            message = "ok",
            games =  findGames(query),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun findGames(query: String?): List<Game> {
        val founded = mutableListOf<Game>()
        return if(!query.isNullOrEmpty()) {
            games.forEach { game ->
                if(game.name.lowercase().contains(query.lowercase())) {
                    founded.add(game)
                    return@forEach
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}