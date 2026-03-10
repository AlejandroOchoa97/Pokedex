package ochoa.ivan.composepokedex.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ochoa.ivan.composepokedex.dummies.getPokemon
import ochoa.ivan.composepokedex.dummies.showAllPokemons
import ochoa.ivan.composepokedex.screens.LoginScreen
import ochoa.ivan.composepokedex.screens.RegisterScreen
import ochoa.ivan.composepokedex.screens.PokedexMenuScreen
import ochoa.ivan.composepokedex.screens.PokemonDetailScreen

@Composable
fun MyApp() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "login"
    ) {

        composable("login") {

            LoginScreen(
                onLogin = {
                    navController.navigate("pokemon_list")
                },
                onRegister = {
                    navController.navigate("register")
                }
            )
        }

        composable("register") {

            RegisterScreen(
                onBack = {
                    navController.popBackStack()
                }
            )
        }

        composable("pokemon_list") {

            PokedexMenuScreen(
                showAllPokemons(),
                onNavigationDetail = { id ->
                    navController.navigate("pokemon_detail/$id")
                }
            )
        }

        composable("pokemon_detail/{id}") { backStackEntry ->

            val id = backStackEntry.arguments?.getString("id")?.toInt() ?: 0

            // Lista completa de pokémon
            val pokemons = showAllPokemons()

            // Pokémon actual
            val pokemon = getPokemon(id)

            // Encontrar posición del pokémon en la lista
            val index = pokemons.indexOfFirst { it.number == id }

            // Pokémon anterior
            val previous =
                if (index > 0) pokemons[index - 1] else null

            // Pokémon siguiente
            val next =
                if (index < pokemons.size - 1) pokemons[index + 1] else null

            PokemonDetailScreen(
                pokemon = pokemon,
                neighbors = Pair(previous, next),
                onNavigate = {
                    navController.navigate("pokemon_detail/${it.number}")
                }
            )
        }
    }
}