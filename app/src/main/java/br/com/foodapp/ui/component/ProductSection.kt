package br.com.foodapp.ui.component

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.foodapp.model.Product
import br.com.foodapp.sampledata.products
import br.com.foodapp.ui.theme.FoodAppTheme

@Composable
fun ProductSection(
    title: String,
    prods: List<Product>
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(start = 16.dp),
            fontSize = 20.sp
        )
        Row(
            modifier = Modifier
                .horizontalScroll(
                    state = rememberScrollState()
                )
                .padding(
                    start = 16.dp,
                    top = 8.dp,
                    end = 8.dp
                ),
            horizontalArrangement = Arrangement.spacedBy(16.dp)

        ) {
            prods.forEach { p -> ProductItemCard(p) }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    FoodAppTheme {
        ProductSection(
            title = "Doces",
            prods = products
        )
    }
}