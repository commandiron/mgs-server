package com.commandiron.models.games

@kotlinx.serialization.Serializable
data class Game(
    val id: Int,
    val name: String,
    val logoPath: String,
    val posterPath: String,
    val platforms: List<String>? = null,
    val releaseDate: String? = null,
    val summary: String? = null,
) {
    companion object {
        val games = listOf(
            Game(
                id = 0,
                name = "Metal Gear",
                logoPath = "/images/games/mg/mg_logo.png",
                posterPath = "/images/games/mg/mg_poster.jpg",
                platforms = listOf(
                    "PlayStation",
                    "PlayStation 3",
                    "PlayStation Vita",
                    "XBOX 360",
                    "Mobile Phone",
                    "Virtual Console",
                    "MSX 2"
                ),
                releaseDate = "1998",
                summary = """
                    Metal Gear (メタルギア Metaru Gia?) is a stealth action game designed by Hideo Kojima. Metal Gear was developed and first published by Konami in 1987 for the MSX2 home computer and was well-received critically and commercially.

                    The game's premise revolves around a special forces operative codenamed Solid Snake who carries out a one-man sneaking mission into the hostile nation of Outer Heaven to destroy Metal Gear, a bipedal walking tank capable of launching nuclear missiles from anywhere in the world. Most of the subsequent games in the series follow this same premise, often changing the characters, locations, and weapons.

                    Originally released for the MSX2 in Japan and Europe, the game was later ported to the Nintendo Entertainment System during the same year, although with many significant changes made to the game. This was followed with ports to various home computers, such as the PC MS-DOS and Commodore 64. It was also ported to mobile phones and Nintendo GameCube (as part of the Metal Gear Solid: The Twin Snakes Premium Package) in 2004 and for the PlayStation 2 in 2005 as a component of Metal Gear Solid 3: Subsistence, with several enhancements and changes, such as typo corrections and some grammatical changes. Its success led to the creation of two separately-produced sequels; the first one, Snake's Revenge, was produced specifically for the Western market for the NES and the other, Metal Gear 2: Solid Snake, was the canonical sequel developed by Kojima and released in Japan for the MSX2 in response to the former's creation. The latter was followed by a successful series of sequels and spin-offs.

                    The cover art of Metal Gear is based on a photo of Michael Biehn in character as Kyle Reese from The Terminator.
                """.trimIndent()
            ),
            Game(
                id = 1,
                name = "Metal Gear 2 Solid Snake",
                logoPath = "/images/games/mg2/mg2_logo.png",
                posterPath = "/images/games/mg2/mg2_poster.jpg"
            ),
            Game(
                id = 2,
                name = "Metal Gear Solid",
                logoPath = "/images/games/mgs/mgs_logo.png",
                posterPath = "/images/games/mgs/mgs_poster.jpg"
            ),
            Game(
                id = 3,
                name = "Metal Gear Solid II Sons of Liberty",
                logoPath = "/images/games/mgs2/mgs2_logo.png",
                posterPath = "/images/games/mgs2/mgs2_poster.jpg"
            ),
            Game(
                id = 4,
                name = "Metal Gear Solid III Snake Eater",
                logoPath = "/images/games/mgs3/mgs3_logo.png",
                posterPath = "/images/games/mgs3/mgs3_poster.jpg"
            ),
            Game(
                id = 5,
                name = "Metal Gear Solid IV Guns of the Patriots",
                logoPath = "/images/games/mgs4/mgs4_logo.png",
                posterPath = "/images/games/mgs4/mgs4_poster.jpg"
            ),
            Game(
                id = 6,
                name = "Metal Gear Solid Peace Walker",
                logoPath = "/images/games/mgspw/mgspw_logo.png",
                posterPath = "/images/games/mgspw/mgspw_poster.jpg"
            ),
            Game(
                id = 7,
                name = "Metal Gear Solid V Phantom Pain",
                logoPath = "/images/games/mgs5/mgs5_logo.png",
                posterPath = "/images/games/mgs5/mgs5_poster.jpg"
            )
        )
    }
}