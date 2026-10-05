package br.com.foodapp.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.foodapp.model.Product
import br.com.foodapp.sampledata.sampleProducts
import br.com.foodapp.ui.theme.FoodAppTheme
import br.com.foodapp.ui.theme.PurpleCard2
import coil3.compose.AsyncImage
import kotlin.math.exp

@Composable
fun ProductItemCard(
    modifier: Modifier = Modifier,
    product: Product
) {

    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = modifier
            .fillMaxWidth()
            .clickable{
               expanded = !expanded
            }
    ) {
        Column() {
            AsyncImage(
                model = product.image,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp),
                contentScale = ContentScale.Crop
            )
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = PurpleCard2)
                    .padding(all = 16.dp)
            ) {
                Text(
                    text = product.name
                )
                Text(
                    text = product.price.toPlainString()
                )
            }

            product.description?.let {
                Text(
                    modifier = Modifier
                        .padding(16.dp),
                    text = product.description,
                    maxLines = if (expanded) Int.MAX_VALUE else 2
                )
            }

        }
    }
}

@Preview
@Composable
private fun ProductItemCardPreview() {
    FoodAppTheme() {
        ProductItemCard(
            product = sampleProducts.first()
        )
    }
}