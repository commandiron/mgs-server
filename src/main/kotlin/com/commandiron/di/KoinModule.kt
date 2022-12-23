package com.commandiron.di

import com.commandiron.repository.characters.CharactersRepository
import com.commandiron.repository.characters.CharactersRepositoryImpl
import com.commandiron.repository.games.GamesRepository
import com.commandiron.repository.games.GamesRepositoryImpl
import org.koin.dsl.module

val koinModule = module {
    single<CharactersRepository> {
        CharactersRepositoryImpl()
    }
    single<GamesRepository> {
        GamesRepositoryImpl()
    }
}