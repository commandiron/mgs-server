package com.commandiron.repository.games

import com.commandiron.models.games.Game
import com.commandiron.models.games.GameApiResponse

interface GamesRepository {

    val games: List<Game>

    suspend fun getAllGames(): GameApiResponse
    suspend fun searchGames(query: String?): GameApiResponse
}