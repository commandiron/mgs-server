package com.commandiron.plugins

import com.commandiron.routes.characters.getAllCharacters
import com.commandiron.routes.root
import com.commandiron.routes.characters.searchCharacters
import com.commandiron.routes.games.getAllGames
import com.commandiron.routes.games.searchGames
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        root()

        getAllCharacters()
        searchCharacters()

        getAllGames()
        searchGames()

        static("/images") {
            resources("images")
        }
        static("/clips") {
            resources("clips")
        }
    }
}
