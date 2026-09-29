package br.com.foodapp.ui.component

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.foodapp.model.Product
import br.com.foodapp.sampledata.sampleCandies
import br.com.foodapp.sampledata.sampleDrinks
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
        LazyRow(
            modifier = Modifier
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(horizontal = 16.dp)

        ) {
//            prods.forEach { p ->
//                item{ProductItemCard(p)}
//            }

            items(prods){ p ->
                ProductItem(product = p)
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductSectionPreview() {
    FoodAppTheme {
        ProductSection(
            title = "Doces",
            prods = sampleCandies
        )
    }
}