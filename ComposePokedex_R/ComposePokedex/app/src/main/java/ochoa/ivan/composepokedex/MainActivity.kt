package ochoa.ivan.composepokedex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import ochoa.ivan.composepokedex.navigation.MyApp
import ochoa.ivan.composepokedex.ui.theme.ComposePokedexTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            ComposePokedexTheme {
                MyApp()
            }
        }
    }
}