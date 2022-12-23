package com.commandiron.models.character

@kotlinx.serialization.Serializable
data class Character(
    val id: Int,
    val name: String,
    val realName: String? = null,
    val alsoKnownNames: List<String>? = null,
    val imagePath: String,
    val shortClipPath: String? = null
) {
    companion object {
        val characters = listOf(
            Character(
                id = 0,
                name = "Solid Snake",
                realName = "David",
                alsoKnownNames = listOf(
                    "Snake",
                    "Dave",
                    "Iroquois Pliskin",
                    "Old Snake",
                    "Legendary Mercenary",
                    "Legendary Hero",
                    "The Man Who Makes the Impossible Possible"
                ),
                imagePath = "/images/characters/solid_snake.jpg",
            ),
            Character(
                id = 1,
                name = "Liquid Snake",
                realName = "Eli",
                alsoKnownNames = listOf(
                    "White Mamba",
                    "McDonell Miller"
                ),
                imagePath = "/images/characters/liquid_snake.jpg",
            ),
            Character(
                id = 2,
                name = "Kazuhira Miller",
                alsoKnownNames = listOf(
                    "Kaz",
                    "McDonell Benedict Miller",
                    "Hell Master",
                    "Master Miller"
                ),
                imagePath = "/images/characters/kazuhira_miller.jpg"
            ),
            Character(
                id = 3,
                name = "Meryl Silverburgh",
                imagePath = "/images/characters/meryl_silverburgh.jpg"
            ),
            Character(
                id = 4,
                name = "Naomi Hunter",
                alsoKnownNames = listOf("Dr. Naomi"),
                imagePath = "/images/characters/naomi_hunter.jpg",
            ),
            Character(
                id = 5,
                name = "Hal Emmerich",
                realName = "Hal Emmerich",
                alsoKnownNames = listOf("Otacon"),
                imagePath = "/images/characters/hal_emmerich.jpg",
            ),
            Character(
                id = 6,
                name = "Roy Campbell",
                alsoKnownNames = listOf("Colonel"),
                imagePath = "/images/characters/roy_campbell.jpg",
            ),
            Character(
                id = 7,
                name = "Mei Ling",
                imagePath = "/images/characters/mei_ling.jpg",
            ),
            Character(
                id = 8,
                name = "Gray Fox",
                realName = "Frank Jaeger",
                alsoKnownNames = listOf(
                    "Frank Hunter",
                    "Perfect Soldier",
                    "[Solid Snake's] number one fan",
                    "Cyborg Ninja",
                    "Deepthroat"
                ),
                imagePath = "/images/gray_fox.jpg",
            ),
            Character(
                id = 9,
                name = "Nastasha Romanenko",
                imagePath = "/images/characters/nastasha_romanenko.jpg",
            ),
            Character(
                id = 10,
                name = "Revolver Ocelot",
                realName = "Adamska",
                alsoKnownNames = listOf(
                    "ADAM",
                    "Shalashaska",
                    "Liquid Ocelot"
                ),
                imagePath = "/images/characters/revolver_ocelot.jpg",
            ),
            Character(
                id = 11,
                name = "Vulcan Raven",
                imagePath = "/images/characters/vulcan_raven.jpg",
            ),
            Character(
                id = 12,
                name = "Psycho Mantis",
                alsoKnownNames = listOf(
                    "Tretij Rebenok (Third Child)",
                    "Third Boy",
                    "The Floating Boy"
                ),
                imagePath = "/images/characters/psycho_mantis.jpg",
            ),
            Character(
                id = 13,
                name = "Sniper Wolf",
                imagePath = "/images/characters/sniper_wolf.jpg",
            ),
            Character(
                id = 14,
                name = "Donald Anderson",
                realName = "Donald Anderson",
                alsoKnownNames = listOf(
                    "Mr. Sigint",
                    "The DARPA Chief"
                ),
                imagePath = "/images/characters/donald_anderson.jpg",
            ),
            Character(
                id = 15,
                name = "Decoy Octopus",
                alsoKnownNames = listOf(
                    "Donald Anderson"
                ),
                imagePath = "/images/characters/decoy_octopus.jpg",
            ),
            Character(
                id = 16,
                name = "Kenneth Baker",
                imagePath = "/images/characters/kenneth_baker.jpg",
            ),
            Character(
                id = 17,
                name = "Jim Houseman",
                imagePath = "/images/characters/jim_houseman.jpg",
            ),
            Character(
                id = 18,
                name = "Johnny Sasaki",
                alsoKnownNames = listOf(
                    "Akiba (short for Akihabara)"
                ),
                imagePath = "/images/characters/johnny_sasaki.jpg",
            ),
        )
    }
}