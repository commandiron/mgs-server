package com.commandiron.models.character

@kotlinx.serialization.Serializable
data class Character(
    val id: Int,
    val name: String,
    val realName: String? = null,
    val alsoKnownNames: List<String>? = null,
    val nationality: String? = null,
    val born: String? = null,
    val age: String? = null,
    val info: String? = null,
    val imagePaths: List<String>,
    val shortClipPath: String? = null,
) {
    companion object {
        val characters = listOf(
            Character(
                id = 0,
                name = "Big Boss",
                realName = "Jack",
                alsoKnownNames = listOf(
                    "Jack",
                    "Naked Snake",
                    "Vic Boss",
                    "Ishmael",
                    "The Legendary Soldier",
                    "The Legendary Mercenary",
                    "Saladin",
                    "The Man Who Sold the World",
                ),
                nationality = "American",
                born = "1935",
                age = "79 at death",
                info = """
                    Big Boss, real name John,[3] also known as Jack, and formerly known as Naked Snake, Vic Boss,[4][5][6] Ishmael, Saladin, or simply Snake, was a renowned special forces operative and mercenary commander. He founded U.S. Army Special Forces Unit FOXHOUND, along with the mercenary company Militaires Sans Frontières, and was one of the founding members of the Patriots. Big Boss later established the military states of Outer Heaven and Zanzibar Land as bases for his companies, in order to realize his ambitions of creating a nation for soldiers. Considered by some as "The Greatest Warrior of the 20th Century," he earned such monikers as "the Legendary Soldier"[7] and "the Legendary Mercenary,"[8] feared in combat by both friend and foe as a hero and a madman.[9]

                    During the Cold War, Big Boss was an apprentice to The Boss, the so-called "Mother of Special Forces," and later served as a black ops field agent for the CIA's FOX Unit, under Major Zero. Having his genetic code used as part of the government project Les Enfants Terribles, Big Boss was the genetic father of Solid Snake (his subordinate and later nemesis), Liquid Snake and Solidus Snake. He was also the mental and physical template for his body double and former subordinate, Venom Snake, with whom he shared the title of "Big Boss".
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/big_boss/big_boss_mgsgz.png",
                    "/images/characters/big_boss/big_boss_mgs5.jpg",
                ),
                shortClipPath = "/clips/characters/big_boss/big_boss_mgsgz.mp4",
            ),
            Character(
                id = 1,
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
                nationality = "American",
                born = "1972, United States",
                age = "42 (2014)",
                imagePaths = listOf(
                    "/images/characters/solid_snake/solid_snake_mgs4.jpg",
                    "/images/characters/solid_snake/solid_snake_mgs2.jpg",
                    "/images/characters/solid_snake/solid_snake_mgs.jpg",
                ),
                info = """
                    Solid Snake, real name David, also known as Old Snake, and briefly known as Iroquois Pliskin, or simply Snake, was a former spy, special operations soldier, and mercenary. Possessing an IQ of 180 and fluent in six languages,[3][4], the fame he achieved from his military exploits earned him such monikers as "Legendary Soldier,"[3] "Legendary Hero,"[5] and "the Man Who Makes the Impossible Possible."[3]

                    Snake was one of the children born of the 1972 project Les Enfants Terribles. He was created as a clone of the world-renowned soldier Big Boss, along with his brothers Liquid Snake and Solidus Snake. Initially a Green Beret, Snake was later inducted into the High-Tech Special Forces Unit FOXHOUND in the 1990s while it was commanded by Big Boss. Repeatedly tasked with disarming and destroying the latest incarnation of Metal Gear, a bipedal nuclear weapon-armed tank, Snake would thrice avert potential nuclear catastrophe, becoming a famed war hero.

                    Following the Shadow Moses Incident and subsequent smear campaign by the Patriots, the secret organization behind American politics, Snake was labeled a terrorist. He faked his own death in the Manhattan Tanker Incident, though he re-emerged years later to assist Raiden in the Big Shell Incident. During this time, his health declined as his body entered a state of accelerated aging due to intentional genetic changes made during the cloning process.

                    In 2014, Snake performed his final mission, during which he defeated Liquid Ocelot and destroyed the Patriots. After one last encounter with Big Boss, Snake chose to live his remaining days in peace.
                """.trimIndent()
            ),
            Character(
                id = 2,
                name = "Liquid Snake",
                realName = "Eli",
                alsoKnownNames = listOf(
                    "White Mamba",
                    "McDonell Miller"
                ),
                imagePaths = listOf(
                    "/images/characters/liquid_snake/liquid_snake_mgs5.jpg",
                    "/images/characters/liquid_snake/liquid_snake_mgs.jpg",
                )
            ),
            Character(
                id = 3,
                name = "Kazuhira Miller",
                alsoKnownNames = listOf(
                    "Kaz",
                    "McDonell Benedict Miller",
                    "Hell Master",
                    "Master Miller"
                ),
                imagePaths = listOf(
                    "/images/characters/kazuhira_miller/kazuhira_miller_mgs5.jpg",
                    "/images/characters/kazuhira_miller/kazuhira_miller_mgs.jpg"
                )
            ),
            Character(
                id = 4,
                name = "Meryl Silverburgh",
                imagePaths = listOf(
                    "/images/characters/meryl_silverburgh/meryl_silverburgh_mgs4.jpg",
                    "/images/characters/meryl_silverburgh/meryl_silverburgh_mgs.jpg"
                )
            ),
            Character(
                id = 5,
                name = "Naomi Hunter",
                alsoKnownNames = listOf("Dr. Naomi"),
                imagePaths = listOf(
                    "/images/characters/naomi_hunter/naomi_hunter_mgs4.jpg",
                    "/images/characters/naomi_hunter/naomi_hunter_mgs.jpg",
                )
            ),
            Character(
                id = 6,
                name = "Hal Emmerich",
                realName = "Hal Emmerich",
                alsoKnownNames = listOf("Otacon"),
                imagePaths = listOf(
                    "/images/characters/hal_emmerich/hal_emmerich_mgs.jpg",
                )
            ),
            Character(
                id = 7,
                name = "Roy Campbell",
                alsoKnownNames = listOf("Colonel"),
                imagePaths = listOf(
                    "/images/characters/roy_campbell/roy_campbell_mgs.jpg",
                )
            ),
            Character(
                id = 8,
                name = "Mei Ling",
                imagePaths = listOf(
                    "/images/characters/mei_ling/mei_ling_mgs.jpg",
                )
            ),
            Character(
                id = 9,
                name = "Gray Fox",
                realName = "Frank Jaeger",
                alsoKnownNames = listOf(
                    "Frank Hunter",
                    "Perfect Soldier",
                    "[Solid Snake's] number one fan",
                    "Cyborg Ninja",
                    "Deepthroat"
                ),
                imagePaths = listOf(
                    "/images/characters/gray_fox/gray_fox_mgs.jpg",
                )
            ),
            Character(
                id = 10,
                name = "Nastasha Romanenko",
                imagePaths = listOf(
                    "/images/characters/nastasha_romanenko/nastasha_romanenko_mgs.jpg",
                )
            ),
            Character(
                id = 11,
                name = "Revolver Ocelot",
                realName = "Adamska",
                alsoKnownNames = listOf(
                    "ADAM",
                    "Shalashaska",
                    "Liquid Ocelot"
                ),
                imagePaths = listOf(
                    "/images/characters/revolver_ocelot/revolver_ocelot_mgs.jpg",
                )
            ),
            Character(
                id = 12,
                name = "Vulcan Raven",
                imagePaths = listOf(
                    "/images/characters/vulcan_raven/vulcan_raven_mgs.jpg",
                )
            ),
            Character(
                id = 13,
                name = "Psycho Mantis",
                alsoKnownNames = listOf(
                    "Tretij Rebenok (Third Child)",
                    "Third Boy",
                    "The Floating Boy"
                ),
                imagePaths = listOf(
                    "/images/characters/psycho_mantis/psycho_mantis_mgs.jpg",
                )
            ),
            Character(
                id = 14,
                name = "Sniper Wolf",
                imagePaths = listOf(
                    "/images/characters/sniper_wolf/sniper_wolf_mgs.jpg",
                )
            ),
            Character(
                id = 15,
                name = "Donald Anderson",
                realName = "Donald Anderson",
                alsoKnownNames = listOf(
                    "Mr. Sigint",
                    "The DARPA Chief"
                ),
                imagePaths = listOf(
                    "/images/characters/donald_anderson/donald_anderson_mgs.jpg",
                )
            ),
            Character(
                id = 16,
                name = "Decoy Octopus",
                alsoKnownNames = listOf(
                    "Donald Anderson"
                ),
                imagePaths = listOf(
                    "/images/characters/decoy_octopus/decoy_octopus_mgs.jpg",
                )
            ),
            Character(
                id = 17,
                name = "Kenneth Baker",
                imagePaths = listOf(
                    "/images/characters/kenneth_baker/kenneth_baker_mgs.jpg",
                )
            ),
            Character(
                id = 18,
                name = "Jim Houseman",
                imagePaths = listOf(
                    "/images/characters/jim_houseman/jim_houseman_mgs.jpg",
                )
            ),
            Character(
                id = 19,
                name = "Johnny Sasaki",
                alsoKnownNames = listOf(
                    "Akiba (short for Akihabara)"
                ),
                imagePaths = listOf(
                    "/images/characters/johnny_sasaki/johnny_sasaki_mgs.jpg",
                )
            ),
        )
    }
}