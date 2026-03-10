package ochoa.ivan.composepokedex.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import ochoa.ivan.composepokedex.dummies.getOnePokemon
import ochoa.ivan.composepokedex.dummies.getPokemon
import ochoa.ivan.composepokedex.dummies.showAllPokemons
import ochoa.ivan.composepokedex.screens.PokedexMenuScreen
import ochoa.ivan.composepokedex.screens.PokemonDetailScreen


@Composable
fun MyApp(){
    val navController = rememberNavController()
    NavHost(navController, startDestination = PokemonList){
        composable<PokemonList>{
            PokedexMenuScreen(showAllPokemons(), onNavigationDetail = {id -> navController.navigate(route = PokemonDetail(id = id))}) }
        composable<PokemonDetail>{ backStackEntry ->
            val pokemon: PokemonDetail = backStackEntry.toRoute()
            PokemonDetailScreen(getPokemon(pokemon.id))
        }

    }
}