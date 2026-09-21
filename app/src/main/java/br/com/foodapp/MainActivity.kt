package br.com.foodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.foodapp.ui.screens.HomeScreen
import br.com.foodapp.ui.theme.FoodAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodAppTheme {
                App()
            }
        }
    }
}

@Composable
fun App() {
    Scaffold { paddingValues ->
        HomeScreen(
            Modifier.padding(paddingValues)
        )
    }

}

@Preview
@Composable
private fun AppPreview() {
    FoodAppTheme {
        App()
    }
}





