package br.com.foodapp.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.foodapp.sampledata.products
import br.com.foodapp.ui.component.ProductSection
import br.com.foodapp.ui.theme.FoodAppTheme


@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .verticalScroll(
                state = rememberScrollState()
            )
            .padding(
                top = 20.dp,
                bottom = 20.dp
            ),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ProductSection(
            title = "Promoções",
            prods = products
        )
        ProductSection(
            title = "Doces",
            prods = products
        )
        ProductSection(
            title = "Bebidas",
            prods = products
        )

    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    FoodAppTheme {
        HomeScreen()
    }
}