package br.com.foodapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.foodapp.sampledata.products
import br.com.foodapp.ui.component.ProductSection
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
    HomeScreen()
}

@Preview
@Composable
private fun AppPreview() {
    FoodAppTheme {
        App()
    }
}





