package com.commandiron.models.character

@kotlinx.serialization.Serializable
data class Character(
    val name: String,
    val realName: String? = null,
    val alsoKnownNames: List<String>? = null,
    val nationality: String? = null,
    val born: String? = null,
    val age: String? = null,
    val info: String? = null,
    val imagePaths: List<String>,
    val shortClipPath: String? = null,
    val gameTags: List<String>
) {
    companion object {
        val characters = listOf(
            Character(
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
                info = """
                    Solid Snake, real name David, also known as Old Snake, and briefly known as Iroquois Pliskin, or simply Snake, was a former spy, special operations soldier, and mercenary. Possessing an IQ of 180 and fluent in six languages,[3][4], the fame he achieved from his military exploits earned him such monikers as "Legendary Soldier,"[3] "Legendary Hero,"[5] and "the Man Who Makes the Impossible Possible."[3]

                    Snake was one of the children born of the 1972 project Les Enfants Terribles. He was created as a clone of the world-renowned soldier Big Boss, along with his brothers Liquid Snake and Solidus Snake. Initially a Green Beret, Snake was later inducted into the High-Tech Special Forces Unit FOXHOUND in the 1990s while it was commanded by Big Boss. Repeatedly tasked with disarming and destroying the latest incarnation of Metal Gear, a bipedal nuclear weapon-armed tank, Snake would thrice avert potential nuclear catastrophe, becoming a famed war hero.

                    Following the Shadow Moses Incident and subsequent smear campaign by the Patriots, the secret organization behind American politics, Snake was labeled a terrorist. He faked his own death in the Manhattan Tanker Incident, though he re-emerged years later to assist Raiden in the Big Shell Incident. During this time, his health declined as his body entered a state of accelerated aging due to intentional genetic changes made during the cloning process.

                    In 2014, Snake performed his final mission, during which he defeated Liquid Ocelot and destroyed the Patriots. After one last encounter with Big Boss, Snake chose to live his remaining days in peace.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/solid_snake/solid_snake_mgs4.jpg",
                    "/images/characters/solid_snake/solid_snake_mgs2.jpg",
                    "/images/characters/solid_snake/solid_snake_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS 4",
                    "MGS 2",
                    "MGS TTS",
                    "MGS",
                    "MG 2",
                    "MG"
                )
            ),
            Character(
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
                gameTags = listOf(
                    "MGS 5 TPP",
                    "MGS 5 GZ",
                    "MGS PW",
                    "MGS 4",
                    "MG0",
                    "MGS 3",
                    "MG 2",
                    "MG"
                )
            ),
            Character(
                name = "Venom Snake",
                alsoKnownNames = listOf(
                    "Big Boss",
                    "Ahab",
                    "V",
                    "Big Boss's phantom",
                    "Medic",
                ),
                nationality = "American",
                born = "1932, California, United States",
                age = "62-63 at death",
                info = """
                    Punished "Venom" Snake, also known as Big Boss, Ahab, V, or Big Boss' phantom, was a combat medic for Militaires Sans Frontières (MSF), who would later become the mercenary commander of Diamond Dogs and Outer Heaven as one of Big Boss' most trusted lieutenants.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/venom_snake/venom_snake_mgs5.jpg",
                ),
                gameTags = listOf(
                    "MGS 5 TPP",
                    "MG",
                )
            ),
            Character(
                name = "Liquid Snake",
                realName = "Eli",
                alsoKnownNames = listOf(
                    "White Mamba",
                    "McDonell Miller"
                ),
                nationality = "British, American",
                born = "1972, United States",
                age = "33 at death",
                info = """
                    Liquid Snake, real name Eli, also known as White Mamba (Kikongo: "Nyoka ya Mpembe"), McDonell/Master Miller, or simply Liquid, was the leader of FOXHOUND during the Shadow Moses Incident. He was cloned from Big Boss's DNA as part of the Les Enfants Terribles project, along with his brothers Solid Snake and Solidus Snake. Liquid was led to believe that he had been created in order to express Big Boss's recessive genetic traits, and as such, was "inferior" to Solid Snake who supposedly had received Big Boss's dominant genes. Liquid therefore held a strong resentment towards Solid and wished to defeat him in combat, reclaiming what he felt was his birthright, and thus proving his superiority.

                    Possessing an IQ of 180, Liquid spoke seven languages fluently, including English, Spanish, French, Malay, Arabic and Kikongo.[3][8] His main language, English, was also spoken with an English accent of the Received Pronunciation dialect during adulthood, and a Central London dialect during his childhood. He was almost an exact double of Solid Snake in terms of appearance, with the only distinguishable feature being his darker skin tone and fair hair color. He also had a tattoo on his left arm, which resembled the Rod of Asclepius, but with a sword in its place and with the words "Temptation Revelation".
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/liquid_snake/liquid_snake_mgs5.jpg",
                    "/images/characters/liquid_snake/liquid_snake_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS 5 TPP",
                    "MGS"
                )
            ),
            Character(
                name = "Revolver Ocelot",
                realName = "Adamska",
                alsoKnownNames = listOf(
                    "ADAM",
                    "Shalashaska",
                    "Liquid Ocelot"
                ),
                nationality = "Russian, American",
                born = "June 6, 1944, Normandy, France",
                age = "70 years (at death)",
                info = """
                    Revolver Ocelot, real name Adamska or simply Adam and also known as ADAM, Shalashaska or most commonly Ocelot, was a Russian-American[2] operative of FOXHOUND and an agent of the Patriots. A master of interrogation and a formidable gunfighter, he was often referred to as a "ricochet genius" in regards to his gun fighting skills. A fanatic, he was known for his affinity towards Spaghetti Westerns, as evidenced by his choice of weapon and his clothing, duster and spurs, the traditional garb of cowboys. His weapon of choice was the Colt Single Action Army Revolver, which he regarded as "the greatest handgun ever made."

                    Throughout his career, Ocelot became personally acquainted with all five men codenamed Snake: a friendly rival to Big Boss (aka Naked Snake), the right hand man for Liquid Snake and Solidus Snake, one of Venom Snake's top advisers, and a nemesis to Solid Snake. He was the son of The Sorrow, and the legendary soldier The Boss, given birth to on the battlefield. Specializing in infiltration of a different nature than Solid Snake and Big Boss, Ocelot often acted as a triple agent, to serve multiple interests in the same situation.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/revolver_ocelot/revolver_ocelot_mgs5.jpg",
                    "/images/characters/revolver_ocelot/revolver_ocelot_mgs4.jpg",
                    "/images/characters/revolver_ocelot/revolver_ocelot_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS 5 TPP",
                    "MGS 4",
                    "MG0",
                    "MGS 3",
                    "MGS 2",
                    "MGS",
                )
            ),
            Character(
                name = "Solidus Snake",
                realName = "George Sears",
                alsoKnownNames = listOf(
                    "Solid Snake",
                    "King"
                ),
                nationality = "British, American",
                born = "1972, United States",
                age = "37 at brain death",
                info = """
                    Solidus Snake, real name George Sears, and also known as King, or simply Solidus, was the 43rd President of the United States, and a product of the Les Enfants Terribles project, making him the third "Son of Big Boss". After secretly instigating the events on Shadow Moses Island, he became directly involved in the Big Shell Incident.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/solidus_snake/solidus_snake_mgs2.jpg",
                ),
                gameTags = listOf(
                    "MGS 2"
                )
            ),
            Character(
                name = "Kazuhira Miller",
                alsoKnownNames = listOf(
                    "Kaz",
                    "McDonell Benedict Miller",
                    "Hell Master",
                    "Master Miller"
                ),
                nationality = "American, Japanese",
                born = "1946, Yokosuka, Japan",
                age = "Late 50s at death",
                info = """
                    Kazuhira Miller (カズヒラ・ミラー Kazuhira Mirā?), also known as Kaz, McDonell Benedict Miller and Master Miller, was the subcommander of both the Militaires Sans Frontières and Diamond Dogs, and the survival trainer of FOXHOUND. He was well-read and possessed a vast array of scientific knowledge.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/kazuhira_miller/kazuhira_miller_mgs5.jpg",
                    "/images/characters/kazuhira_miller/kazuhira_miller_mgs.jpg"
                ),
                gameTags = listOf(
                    "MGS 5 TPP",
                    "MGS 5 GZ",
                    "MGS PW",
                    "MGS",
                    "MG 2",
                )
            ),
            Character(
                name = "Meryl Silverburgh",
                nationality = "American",
                born = "1987",
                age = "27 (2014)",
                info = """
                    Meryl Silverburgh was the commanding officer of Rat Patrol Team 01 of the CID. Prior to her inauguration as commander, Meryl was a well-known career soldier due to her involvement in the Shadow Moses Incident, where she worked alongside legendary mercenary Solid Snake. It was initially thought that she was the niece of former FOXHOUND commander Roy Campbell. However, it was later discovered that Meryl was actually his biological daughter.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/meryl_silverburgh/meryl_silverburgh_mgs4.jpg",
                    "/images/characters/meryl_silverburgh/meryl_silverburgh_mgs.jpg"
                ),
                gameTags = listOf(
                    "MGS 4",
                    "MGS",
                )
            ),
            Character(
                name = "Naomi Hunter",
                alsoKnownNames = listOf("Dr. Naomi"),
                nationality = "American, Rhodesian",
                born = "Late 1970s",
                age = "Late 30s - early 40s at death",
                info = """
                    Dr. Naomi Hunter was a geneticist who specialized in nanotechnology-based gene therapy. As medical chief of FOXHOUND, she was part of the support crew assembled to assist Solid Snake during the Shadow Moses Incident.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/naomi_hunter/naomi_hunter_mgs4.jpg",
                    "/images/characters/naomi_hunter/naomi_hunter_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS 4",
                    "MGS",
                )
            ),
            Character(
                name = "Hal Emmerich",
                realName = "Hal Emmerich",
                alsoKnownNames = listOf("Otacon"),
                nationality = "American",
                born = "1980",
                age = "38 (2018)",
                info = """
                    Dr. Hal "Otacon" Emmerich was the chief engineer of Metal Gear REX. He became a close friend of Solid Snake after Snake rescued him during the Shadow Moses Incident in 2005. Later that year, he and Snake founded the anti-Metal Gear NGO Philanthropy. Following the Guns of the Patriots Incident, he became the adoptive father of Sunny. A devoted fan of anime, Hal's chosen nickname was derived from the Japanese animation convention Otakon.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/hal_emmerich/hal_emmerich_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS 4",
                    "MGS 2",
                    "MGS",
                )
            ),
            Character(
                name = "Roy Campbell",
                alsoKnownNames = listOf("Colonel"),
                nationality = "American",
                born = "c. 1936 - c. 1945",
                info = """
                    Roy Campbell was a former U.S. Army colonel in command of special forces group FOXHOUND, who later worked for an advisory body under the UN Security Council to monitor PMC activities. Campbell was a close friend of Solid Snake, and the biological father of Meryl Silverburgh.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/roy_campbell/roy_campbell_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS 4",
                    "MPO",
                    "MGS",
                    "MG 2"
                )
            ),
            Character(
                name = "Mei Ling",
                nationality = "American, Chinese (Guangdong)",
                born = "Late 1980s United States",
                info = """
                    Mei Ling (美玲, Pinyin: Měi Líng) was a Chinese-American data analyst who served on Solid Snake's radio support team during the Shadow Moses Incident. Afterwards, she joined Philanthropy, an anti-Metal Gear organization, and assisted Snake in secret by providing stolen military equipment. Years later, Mei Ling became Captain of the museum-turned-training vessel USS Missouri, commanding it in battle at the time of the Guns of the Patriots Incident.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/mei_ling/mei_ling_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS 4",
                    "MGS",
                )
            ),
            Character(
                name = "Gray Fox",
                realName = "Frank Jaeger",
                alsoKnownNames = listOf(
                    "Frank Hunter",
                    "Perfect Soldier",
                    "[Solid Snake's] number one fan",
                    "Cyborg Ninja",
                    "Deepthroat"
                ),
                nationality = "American",
                born = "1950s",
                age = "50s at death",
                info = """
                    Gray Fox, real name Frank Jaeger, was a mercenary and former agent of U.S. Special Forces Unit FOXHOUND. Originally a child soldier, Jaeger was the only operative in FOXHOUND to achieve the codename "Fox," the unit's highest commendation, and was decorated five times.[5]

                    Fox was Solid Snake's comrade-in-arms and friend during the Outer Heaven Uprising, but his loyalty to renegade commander Big Boss forced him into combat with Snake during the Zanzibar Land Disturbance. He survived his injuries following an intense battle, after which he was forcibly outfitted with a powered exoskeleton and subjected to intensive gene therapy. Fox later confronted Snake as a neutral force during the Shadow Moses Incident, in the guise of the Cyborg Ninja, before dying at the hands of Liquid Snake and Metal Gear REX.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/gray_fox/gray_fox_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS",
                    "MG 2",
                    "MG",
                    "MPO",
                )
            ),
            Character(
                name = "Nastasha Romanenko",
                nationality = "Russian, Ukrainian",
                born = "1975, Prypiat, Ukraine",
                age = "39 (2014)",
                info = """
                    Nastasha Romanenko (Russian: Ната́ша Романенко) was a Ukrainian-Russian[1][2] weapons analyst. As a member of the Nuclear Emergency Search Team, she assisted Solid Snake via Codec during the Shadow Moses Incident, providing him with information on firearms and nuclear weapons.[2]
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/nastasha_romanenko/nastasha_romanenko_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS"
                )
            ),
            Character(
                name = "Vulcan Raven",
                imagePaths = listOf(
                    "/images/characters/vulcan_raven/vulcan_raven_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS"
                )
            ),
            Character(
                name = "Psycho Mantis",
                alsoKnownNames = listOf(
                    "Tretij Rebenok (Third Child)",
                    "Third Boy",
                    "The Floating Boy"
                ),
                nationality = "American, Inuit",
                born = "c. 1966 - c. 1975",
                age = "30s at death",
                info = """
                    Vulcan Raven was a member of FOXHOUND who participated in the unit's revolt on Shadow Moses Island in 2005. He was a shaman and was raised in the cold state of Alaska.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/psycho_mantis/psycho_mantis_mgs5.jpg",
                    "/images/characters/psycho_mantis/psycho_mantis_mgs4.jpg",
                    "/images/characters/psycho_mantis/psycho_mantis_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS",
                    "MGS 4",
                    "MGS 5 TPP"
                )
            ),
            Character(
                name = "Sniper Wolf",
                nationality = "Iraqi",
                born = "c. 1976 - c. 1985",
                age = "20s at death",
                info = """
                    Sniper Wolf was one of the renegade members of FOXHOUND who participated in the 2005 revolt on Shadow Moses Island, along with the Next-Generation Special Forces.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/sniper_wolf/sniper_wolf_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS",
                )
            ),
            Character(
                name = "Donald Anderson",
                realName = "Donald Anderson",
                alsoKnownNames = listOf(
                    "Mr. Sigint",
                    "The DARPA Chief"
                ),
                nationality = "American",
                born = "November 11, 1939, Nashville, Tennessee",
                age = "65 at death",
                info = """
                    Donald Anderson, also known as Mr. Sigint or simply Sigint, was a former member of FOX and an expert on weapons, equipment and cutting-edge technology.
                    He assisted Naked Snake during Operation Snake Eater and the San Hieronymo Incident, participated in the development of ARPANET, and was one of the founding members of Cipher. Anderson later became the chief of DARPA, supporting the development of Metal Gear REX in the early 2000s.

                    During the Shadow Moses Incident, he was tortured to death by Revolver Ocelot of FOXHOUND, and later impersonated by Decoy Octopus.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/donald_anderson/donald_anderson_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS 3",
                    "MGO",
                    "MGS",
                )
            ),
            Character(
                name = "Decoy Octopus",
                alsoKnownNames = listOf(
                    "Donald Anderson"
                ),
                nationality = "Mexican",
                info = """
                    Decoy Octopus was a member of FOXHOUND that specialized in impersonation. His disguises were so thorough that he would even inject the blood of those he impersonated into his own body. Along with the rest of his unit, he went rogue during the Shadow Moses Incident in 2005.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/decoy_octopus/decoy_octopus_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS",
                )
            ),
            Character(
                name = "Kenneth Baker",
                nationality = "American",
                born = "c. 1936 - c. 1945",
                age = "60s at death",
                info = """
                    Kenneth Baker was the former president of ArmsTech, one of the leading manufacturers in the arms industry, during the time of the Shadow Moses Incident.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/kenneth_baker/kenneth_baker_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS",
                )
            ),
            Character(
                name = "Jim Houseman",
                nationality = "American",
                born = "c. 1926 - c. 1935",
                info = """
                    Jim Houseman was the United States Secretary of Defense during the Shadow Moses Incident, serving as the mission controller via AWACS.
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/jim_houseman/jim_houseman_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS",
                )
            ),
            Character(
                name = "Johnny Sasaki",
                alsoKnownNames = listOf(
                    "Akiba (short for Akihabara)"
                ),
                nationality = "American",
                info = """
                    Johnny Sasaki, nicknamed Akiba by his comrades in Rat Patrol Team 01, was a U.S. Army soldier, and sometimes mercenary, who participated in the Shadow Moses Incident, the Big Shell Incident and, more prominently, the events of the Guns of the Patriots Incident. His grandfather, also named Johnny, was encountered by Naked Snake during Operation Snake Eater.
                    During the Guns of the Patriots Incident, his entire body was often covered with wearable computers. Using a wrist-mounted keyboard and a goggle monitor, he specialized in scouting, patrolling, record keeping, data analysis, explosives, and traps. He became proficient in these areas in an attempt to match the skills of his nanomachine-enhanced teammates, though he would later admit that he never came close to doing so. Johnny suffered from irritable bowel syndrome and, due to his lack of nanomachines, also consumed local water without normal nanomachine filtration. This caused his diarrhea and cramps to become particularly bad during missions, although he seemed to blame the bouts of diarrhea on trying to hold up good-looking women during a mission.

                    Despite his poor hand-to-hand skills and generally hapless behavior, Johnny exhibited excellent firearms proficiency when he finally engaged in a gunfight with Liquid Ocelot's FROG troops (an earlier incident with the safety left on notwithstanding).
                """.trimIndent(),
                imagePaths = listOf(
                    "/images/characters/johnny_sasaki/johnny_sasaki_mgs.jpg",
                ),
                gameTags = listOf(
                    "MGS 4",
                    "MGS",
                )
            ),
        )
    }
}