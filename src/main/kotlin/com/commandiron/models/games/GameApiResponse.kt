package com.commandiron.models.games

import kotlinx.serialization.Serializable

@Serializable
data class GameApiResponse(
    val success: Boolean,
    val message: String? = null,
    val games: List<Game> = emptyList(),
    val lastUpdated: Long? = null
) {
}