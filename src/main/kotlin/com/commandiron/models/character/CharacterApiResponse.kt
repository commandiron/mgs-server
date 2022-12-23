package com.commandiron.models.character

import kotlinx.serialization.Serializable

@Serializable
data class CharacterApiResponse(
    val success: Boolean,
    val message: String? = null,
    val prevPage: Int? = null,
    val nextPage: Int? = null,
    val characters: List<Character> = emptyList(),
    val lastUpdated: Long? = null
) {
}