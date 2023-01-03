package com.commandiron.repository.characters

import com.commandiron.models.character.Character
import com.commandiron.models.character.CharacterApiResponse

private const val NEXT_PAGE_KEY = "nextPage"
private const val PREVIOUS_PAGE_KEY= "prevPage"

class CharactersRepositoryImpl: CharactersRepository {

    override val characters = Character.characters

    override suspend fun getAllCharacters(page: Int, limit: Int): CharacterApiResponse {
        return CharacterApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                characters = characters,
                page = page,
                limit = limit
            )[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(
                characters = characters,
                page = page,
                limit = limit
            )[NEXT_PAGE_KEY],
            characters = provideCharacters(
                characters = characters,
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun calculatePage(
        characters: List<Character>,
        page: Int,
        limit: Int
    ): Map<String, Int?> {
        val allCharacters = characters.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page <= allCharacters.size)
        val prevPage = if(page == 1) null else page - 1
        val nextPage = if(page == allCharacters.size) null else page + 1
        return mapOf(
            PREVIOUS_PAGE_KEY to prevPage,
            NEXT_PAGE_KEY to nextPage
        )
    }

    private fun provideCharacters(
        characters: List<Character>,
        page: Int,
        limit: Int
    ): List<Character> {
        val allCharacters = characters.windowed(
            size = limit,
            step = limit,
            partialWindows = true
        )
        require(page > 0 && page <= allCharacters.size)
        return allCharacters[page - 1]
    }

    override suspend fun searchCharacters(query: String?,page: Int, limit: Int): CharacterApiResponse {
        return CharacterApiResponse(
            success = true,
            message = "ok",
            prevPage = calculatePage(
                characters = findCharacters(query),
                page = page,
                limit = limit
            )[PREVIOUS_PAGE_KEY],
            nextPage = calculatePage(
                characters = findCharacters(query),
                page = page,
                limit = limit
            )[NEXT_PAGE_KEY],
            characters = provideCharacters(
                characters = findCharacters(query),
                page = page,
                limit = limit
            ),
            lastUpdated = System.currentTimeMillis()
        )
    }

    private fun findCharacters(query: String?): List<Character> {
        val founded = mutableListOf<Character>()
        return if(!query.isNullOrEmpty()) {
            characters.forEach { character ->
                if(character.name.lowercase().contains(query.lowercase())) {
                    founded.add(character)
                    return@forEach
                }
                character.realName?.let { realName ->
                    if(realName.lowercase().contains(query.lowercase())){
                        founded.add(character)
                        return@forEach
                    }
                }
                character.alsoKnownNames?.let { alsoKnownNames ->
                    if(alsoKnownNames.any { it.lowercase().contains(query.lowercase()) }) {
                        founded.add(character)
                        return@forEach
                    }
                }
                if(character.gameTags.any { it.lowercase().contains(query.lowercase()) }) {
                    founded.add(character)
                    return@forEach
                }
            }
            founded
        } else {
            emptyList()
        }
    }
}