package ochoa.ivan.composepokedex.dummies

import ochoa.ivan.composepokedex.R
import ochoa.ivan.composepokedex.domain.Pokemon


val pokemonList = listOf(
    Pokemon(
        "Pikachu",
        25,
        "Electric",
        "Pikachu, el Pokémon Ratón (tipo eléctrico#025), es conocido por almacenar electricidad en sus mejillas rojas, lanzando descargas cuando se enfada o se siente amenazado. Es amarillo con rayas marrones en la espalda, orejas largas con puntas negras y una cola en forma de rayo.",
        0.4f,
        6f,
        true,
        "Electricidad Estática",
        R.drawable.pikachu
    ), Pokemon(
        "Mew",
         151,
        "Psychic",
        "Mew, el Pokémon Nueva Especie (#151). Se dice que posee el mapa genético de todos los Pokémon. Es capaz de hacerse invisible.",
        0.4f,
        4.0f,
        true,
        "Sincronía",
        R.drawable.mew
    ),
    Pokemon(
        "Charizard",
        6,
        "Fire/Flying",
        "Charizard, el Pokémon Llama (#006). Escupe fuego tan caliente que es capaz de fundir rocas. Causa incendios forestales sin querer.",
        1.7f,
        90.5f,
        true,
        "Mar Llamas",
        R.drawable.charizard
    ),
    Pokemon(
        "Blastoise",
        9,
        "Water",
        "Blastoise, el Pokémon Marisco (#009). Para dar en el blanco, dispara chorros de agua por los cañones que tiene en el caparazón.",
        1.6f,
        85.5f,
        true,
        "Torrente",
        R.drawable.blastoise
    ),
    Pokemon(
        "Venusaur",
        3,
        "Grass/Poison",
        "Venusaur, el Pokémon Semilla (#003). La flor de su lomo desprende un aroma delicado que calma las emociones de los demás.",
        2.0f,
        100.0f,
        true,
        "Espesura",
        R.drawable.venusaur
    ),
    Pokemon(
        "Lugia",
        249,
        "Psychic/Flying",
        "Lugia, el Pokémon Buceo (#249). Dicen que es el guardián de los mares. Se dice que su batir de alas provoca tormentas de 40 días.",
        5.2f,
        216.0f,
        true,
        "Presión",
        R.drawable.lugia
    ),
    Pokemon(
        name = "Greninja",
        number = 658,
        type = "Water/Dark",
        description = "Greninja, el Pokémon Ninja (#658). Se mueve con la delicadeza de un ninja. Confunde al enemigo gracias a su velocidad y lanza shurikens de agua.",
        height = 1.5f,
        weight = 40.0f,
        fav = true,
        ability = "Torrente",
        image = R.drawable.greninja
    ),
    Pokemon(
        name = "Togepi",
        number = 175,
        type = "Fairy",
        description = "Togepi, el Pokémon Bola Clavos (#175). La cáscara de su huevo está llena de felicidad. Se dice que trae buena suerte a quien lo trate bien.",
        height = 0.3f,
        weight = 1.5f,
        fav = true,
        ability = "Dicha",
        image = R.drawable.togepi
    ),
    Pokemon(
        name = "Rayquaza",
        number = 384,
        type = "Dragon/Flying",
        description = "Rayquaza, el Pokémon Cielo (#384). Se dice que ha vivido durante cientos de millones de años en la capa de ozono sin bajar nunca a tierra.",
        height = 7.0f,
        weight = 206.5f,
        fav = true,
        ability = "Bucle Aire",
        image = R.drawable.rayquaza
    ),
    Pokemon(
        name = "Psyduck",
        number = 54,
        type = "Water",
        description = "Psyduck, el Pokémon Pato (#054). Abrumado por poderes psicocinéticos, siempre tiene dolor de cabeza. Es uno de los más queridos.",
        height = 0.8f,
        weight = 19.6f,
        fav = true,
        ability = "Humedad",
        image = R.drawable.psyduck
    ),
    Pokemon(
        name = "Lucario",
        number = 448,
        type = "Fighting/Steel",
        description = "Lucario, el Pokémon Aura (#448). Puede ver el aura de todas las cosas. Es capaz de entender el lenguaje humano a través de ella.",
        height = 1.2f,
        weight = 54.0f,
        fav = true,
        ability = "Foco Interno",
        image = R.drawable.lucario
    )
)

fun showAllPokemons(): List<Pokemon> {
    return pokemonList
}

fun getOnePokemon(): Pokemon{
    return pokemonList.get((0..9).random())
}

fun getPokemon(id:Int):Pokemon{
    return pokemonList.filter { pokemon -> pokemon.number == id}.get(0)
}
