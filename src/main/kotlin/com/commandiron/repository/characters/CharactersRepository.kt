package com.commandiron.repository.characters

import com.commandiron.models.character.Character
import com.commandiron.models.character.CharacterApiResponse

interface CharactersRepository {

    val characters: List<Character>

    suspend fun getAllCharacters(page: Int, limit: Int): CharacterApiResponse
    suspend fun searchCharacters(query: String?,page: Int, limit: Int): CharacterApiResponse
}