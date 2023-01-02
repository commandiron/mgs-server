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
                releaseDate = "1987",
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
                posterPath = "/images/games/mg2/mg2_poster.jpg",
                platforms = listOf(
                    "PlayStation",
                    "PlayStation 3",
                    "PlayStation Vita",
                    "XBOX 360",
                    "Mobile Phone",
                    "Virtual Console",
                    "MSX 2"
                ),
                releaseDate = "1990",
                summary = """
                    Metal Gear 2: Solid Snake (メタルギア２ ソリッドスネーク Metaru Gia Tsū Soriddo Sunēku?, commonly abbreviated MG2) is a stealth action game that was written and directed by Hideo Kojima and developed by Konami. It is the second game released in the Metal Gear series and the seventh one chronologically. It was initially released only in Japan for the MSX2 computer on July 20, 1990. The game was re-released as a downloadable game for mobile phones in Japan in 2004. A North American and European version of Metal Gear 2 was released in 2006 as part of Metal Gear Solid 3: Subsistence along with the original Metal Gear.

                    In the game, Solid Snake must infiltrate Zanzibar Land, a heavily defended territory located in Central Asia, to rescue a kidnapped scientist and destroy the revised Metal Gear D. The game significantly evolved the stealth-based gameplay of its predecessor "in almost every way," introduced a complex story line dealing with themes such as the nature of warfare and nuclear proliferation, and is considered "one of the best 8 bit games ever made." However, the game was not released in the Western world, due to the conflicting release of Snake's Revenge, until 16 years later.[1]
                """.trimIndent()
            ),
            Game(
                id = 2,
                name = "Metal Gear Solid",
                logoPath = "/images/games/mgs/mgs_logo.png",
                posterPath = "/images/games/mgs/mgs_poster.jpg",
                platforms = listOf(
                    "PlayStation",
                    "PlayStation Classic",
                    "PlayStation Portable",
                    "PlayStation 3",
                ),
                releaseDate = "1998",
                summary = """
                    Metal Gear Solid (メタルギアソリッド Metaru Gia Soriddo?, commonly abbreviated as MGS or MGS1) is a stealth action video-game directed by Hideo Kojima. The game was developed by Konami Computer Entertainment Japan and first published in 1998 for the PlayStation.[1] It was well-received critically and commercially, shipping more than six million copies (being the eighth best-selling game on the PlayStation),[2] and scoring an average metascore of 94 out of 100 on Metacritic.[3] It is widely considered to be one of the greatest and most important games of all time,[4][5] and is heralded as the game that made the stealth genre popular.[6] It is the third canonical title released in the Metal Gear series, being a sequel of Metal Gear 2: Solid Snake.

                    The commercial success of Metal Gear Solid prompted Konami to enhance and re-release the game for the PlayStation and Windows PC under the title Metal Gear Solid: Integral;[6] a remake, Metal Gear Solid: The Twin Snakes was later released for the Nintendo GameCube.[7]
                """.trimIndent()
            ),
            Game(
                id = 3,
                name = "Metal Gear Solid II Sons of Liberty",
                logoPath = "/images/games/mgs2/mgs2_logo.png",
                posterPath = "/images/games/mgs2/mgs2_poster.jpg",
                platforms = listOf(
                    "PlayStation 2"
                ),
                releaseDate = "2001",
                summary = """
                    Metal Gear Solid 2: Sons of Liberty (メタルギアソリッド2 サンズ・オブ・リバティ Metaru Gia Soriddo 2 Sanzu Obu Ribati?, commonly abbreviated as MGS2) is a stealth action game directed by Hideo Kojima, developed by Konami Computer Entertainment Japan and published by Konami for the PlayStation 2 in 2001. It is the fourth game in the Metal Gear series produced and directed by Kojima and is the direct sequel of Metal Gear Solid. Its release was followed by an expanded edition, Metal Gear Solid 2: Substance for the PlayStation 2, Xbox, and Microsoft Windows. Metal Gear Solid 3: Snake Eater, a prequel to the entire Metal Gear series, followed in 2004. In 2008, a direct sequel, Metal Gear Solid 4: Guns of the Patriots, was released.

                    The game was well-received, shipping over 7 million copies worldwide. It received a metascore of 96 on Metacritic and average of 95.09% on GameRankings.[1][2] While the gameplay and graphics were universally acclaimed, critics and fans were divided on the philosophical nature and execution of the game's storyline, which explores the themes of memes, social engineering, political conspiracies, and artificial intelligence. Critics and fans were also divided on Raiden, a new character who serves as the main protagonist for the majority of the game, and the length of the game's cutscenes. Over the years, the game has seen greater acclaim.
                """.trimIndent()
            ),
            Game(
                id = 4,
                name = "Metal Gear Solid III Snake Eater",
                logoPath = "/images/games/mgs3/mgs3_logo.png",
                posterPath = "/images/games/mgs3/mgs3_poster.jpg",
                platforms = listOf(
                    "PlayStation 2"
                ),
                releaseDate = "2004",
                summary = """
                    Metal Gear Solid 3: Snake Eater (メタルギアソリッド3 スネーク・イーター Metaru Gia Soriddo 3 Sunēku Ītā?, commonly abbreviated as MGS3[2]) is a stealth action game directed by Hideo Kojima. It was developed by Konami Computer Entertainment Japan and published by Konami.[3] It is both the last canonical game and last Metal Gear game overall to be developed by KCEJ prior to the formation of Kojima Productions a year later. It was released for the PlayStation 2 on November 17, 2004 in North America; December 16, 2004 in Japan; March 4, 2005 in Europe; and March 17, 2005 in Australia. The game, which serves as a prequel to the Metal Gear series,[4] was followed by a direct sequel titled Metal Gear Solid: Portable Ops, which was released for the PlayStation Portable in North America and Japan in 2006 and Europe and Australasia in 2007.

                    Set in the Cold War-era Soviet Union, the story centers on FOX operative Naked Snake as he attempts to rescue a weapons designer and sabotage an experimental super-weapon known as the Shagohod.[5] While previous games were set in a primarily urban environment, Metal Gear Solid 3 adopts a 1960s Soviet jungle setting.[6] While the setting has changed, the game's focus remains on stealth and infiltration, while still retaining the series' self-referential, fourth wall-breaking sense of humor.[5] New gameplay elements are also introduced, such as CQC and camouflage.[5][7]

                    Metal Gear Solid 3 was well received critically and commercially, selling more than 3.96 million copies worldwide and scoring a metascore of 91 on Metacritic and an average of 91.77% on GameRankings.[8][9]
                """.trimIndent()
            ),
            Game(
                id = 5,
                name = "Metal Gear Solid IV Guns of the Patriots",
                logoPath = "/images/games/mgs4/mgs4_logo.png",
                posterPath = "/images/games/mgs4/mgs4_poster.jpg",
                platforms = listOf(
                    "PlayStation 3"
                ),
                releaseDate = "2008",
                summary = """
                    Metal Gear Solid 4: Guns of the Patriots (メタルギア・ソリッド4・ガンズ・オブ・ザ・パトリオット Metaru Gia Soriddo 4 Ganzu Obu Za Patoriotto?, commonly abbreviated MGS4) was directed by Hideo Kojima and Shuyo Murata. It was developed by Kojima Productions exclusively for the PlayStation 3[2] and was designed around the motto, "No Place to Hide!" Ryan Payton stated that Metal Gear Solid 4 is the final canonical Metal Gear game to feature Solid Snake as the main character.[3] The game was released worldwide on June 12, 2008, exactly 10 years after Metal Gear Solid and 20 years after the North American release of Metal Gear.

                    Metal Gear Solid 4 has received widespread critical acclaim, earning Game of the Year awards from several major gaming publications, including GameSpot, which hailed the game as technically flawless. Since its release, more than 4.33 million copies of the game have been shipped.[4] On June 16, 2009, a little more than a year after the game's initial release, Metal Gear Solid 4 was re-released under the Greatest Hits banner.[5]
                """.trimIndent()
            ),
            Game(
                id = 6,
                name = "Metal Gear Solid Peace Walker",
                logoPath = "/images/games/mgspw/mgspw_logo.png",
                posterPath = "/images/games/mgspw/mgspw_poster.jpg",
                platforms = listOf(
                    "PlayStation Portable",
                    "PlayStation 3",
                    "XBOX 360",
                    "PlayStation Vita"
                ),
                releaseDate = "2010",
                summary = """
                    Metal Gear Solid: Peace Walker (メタルギアソリッド ピースウォーカー Metaru Gia Soriddo Pīsu Wōkā?, commonly abbreviated as MGS PW) is a game in the Metal Gear series. It was released for the PlayStation Portable in 2010.

                    Peace Walker was officially announced at Sony's E3 press conference on June 2, 2009. Hideo Kojima designed, wrote, produced and directed the game. To reflect the different gameplay style, the series tagline "Tactical Espionage Action" was replaced by "Tactical Espionage Operations." The game is set in 1974, ten years after the events of Metal Gear Solid 3: Snake Eater, and takes place in Costa Rica. It explains the story of Big Boss and leads up to the events of the founding and the creation of Outer Heaven. The theme song for the game is titled "Heavens Divide."

                    The game was released in Japan on April 29, 2010; North America on June 8, 2010; Europe on June 17, 2010; and the UK on June 18, 2010. On a related note, this was the first time a Metal Gear Solid game was released in Japan first instead of overseas first/internationally since the first Metal Gear Solid. The game's development was dedicated to Satoshi Itō, a.k.a. Project Itoh, the author of the Metal Gear Solid 4: Guns of the Patriots novelization, who died from a battle with terminal cancer a year before the game was released.

                    On November 8, 2011, Peace Walker was re-released as a component of the international versions of the Metal Gear Solid: HD Collection for both the PlayStation 3 and Xbox 360.
                """.trimIndent()
            ),
            Game(
                id = 7,
                name = "Metal Gear Solid V Ground Zeroes",
                logoPath = "/images/games/mgs5gz/mgs5gz_logo.png",
                posterPath = "/images/games/mgs5gz/mgs5gz_poster.jpg",
                platforms = listOf(
                    "PlayStation 3",
                    "PlayStation 4",
                    "XBOX 360",
                    "XBOX One",
                    "Microsoft Windows"
                ),
                releaseDate = "2014",
                summary = """
                    Metal Gear Solid V: Ground Zeroes (メタルギアソリッドV グラウンド・ゼロズ Metaru Gia Soriddo Faibu: Guraundo Zerozu?) is a canonical installment in the Metal Gear series. Developed by Kojima Productions and published by Konami, Ground Zeroes is the first game to run on the Fox Engine. Hideo Kojima wrote, directed, produced and designed the game.[4] Ground Zeroes was officially announced on August 30, 2012. The game was privately revealed at the Metal Gear 25th Anniversary Event and made its public debut at PAX Prime 2012. Ground Zeroes was released for the PlayStation 3, PlayStation 4, Xbox 360, and Xbox One in North America on March 18, 2014, March 20, 2014 in Japan and Europe, March 21, 2014 in the UK, and March 27, 2014 in Australia. The Japanese Xbox One version was released on September 4, 2014 via download only. A PC version of Ground Zeroes was released on December 18, 2014.[3]

                    Taking place soon after the events of Metal Gear Solid: Peace Walker, Ground Zeroes serves as a prologue to Metal Gear Solid V: The Phantom Pain, with Big Boss returning as the game's protagonist. Several characters and gameplay mechanics from Peace Walker have returned. While previous games were linear in nature, Ground Zeroes is the first to feature a more open gameplay structure, although such a structure was planned since Metal Gear Solid 3: Snake Eater.
                """.trimIndent()
            ),
            Game(
                id = 8,
                name = "Metal Gear Solid V Phantom Pain",
                logoPath = "/images/games/mgs5pp/mgs5pp_logo.png",
                posterPath = "/images/games/mgs5pp/mgs5pp_poster.jpg",
                platforms = listOf(
                    "PlayStation 3",
                    "PlayStation 4",
                    "XBOX 360",
                    "XBOX One",
                    "Microsoft Windows"
                ),
                releaseDate = "2015",
                summary = """
                    Metal Gear Solid V: The Phantom Pain (メタルギアソリッドV ファントムペイン Metaru Gia Soriddo Faibu: Fantomu Pein?) is a canonical installment in the Metal Gear series. It was developed by Kojima Productions using their self-programmed Fox Engine and published by Konami. As with previous Metal Gear Solid titles, Hideo Kojima designed, wrote, directed, and produced the game. This was the final Metal Gear game Kojima worked on prior to his departure from Konami in October 2015.[5][6]

                    The game was released worldwide for the PlayStation 3, Xbox 360, Xbox One, PlayStation 4 and Microsoft Windows on September 1, 2015. It was released in Japan the following day.[2][4]

                    Set in 1984, nine years after the events of Metal Gear Solid V: Ground Zeroes, The Phantom Pain serves as a prequel to Metal Gear, which is set in 1995. The game's subtitle refers to a medical condition commonly associated with amputees, when an individual experiences sensations, specifically pain, in limbs or organs that are no longer physically part of their body.

                    The Phantom Pain is the first Metal Gear game to fully use an open world gameplay structure.
                """.trimIndent()
            )
        )
    }
}