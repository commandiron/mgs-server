package com.commandiron.models.games

@kotlinx.serialization.Serializable
data class Game(
    val id: Int,
    val name: String,
    val logoPath: String,
    val themeClipPath: String? = null
) {
    companion object {
        val games = listOf(
            Game(
                id = 0,
                name = "Metal Gear",
                logoPath = "/images/games/mg_logo.png"
            ),
            Game(
                id = 1,
                name = "Metal Gear 2 Solid Snake",
                logoPath = "/images/games/mg_ii_logo.png"
            ),
            Game(
                id = 2,
                name = "Metal Gear Solid",
                logoPath = "/images/games/mgs_logo.png"
            ),
            Game(
                id = 3,
                name = "Metal Gear Solid II Sons of Liberty",
                logoPath = "/images/games/mgs_ii_logo.png"
            ),
            Game(
                id = 4,
                name = "Metal Gear Solid III Snake Eater",
                logoPath = "/images/games/mgs_iii_logo.png"
            ),
            Game(
                id = 5,
                name = "Metal Gear Solid IV Guns of the Patriots",
                logoPath = "/images/games/mgs_iv_logo.png"
            ),
            Game(
                id = 6,
                name = "Metal Gear Solid Peace Walker",
                logoPath = "/images/games/mgs_pw_logo.png"
            ),
            Game(
                id = 7,
                name = "Metal Gear Solid V Phantom Pain",
                logoPath = "/images/games/mgs_v_logo.png"
            )
        )
    }
}