package br.com.foodapp.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.foodapp.sampledata.sampleProducts
import br.com.foodapp.sampledata.sampleSections
import br.com.foodapp.ui.component.ProductItemCard
import br.com.foodapp.ui.component.ProductSection
import br.com.foodapp.ui.component.SearchTextField
import br.com.foodapp.ui.theme.FoodAppTheme
import br.com.foodapp.ui.theme.Red200


@Composable
fun HomeScreen(
    modifier: Modifier
) {
    var productSeachText by remember { mutableStateOf("")}

    Column(
        modifier = modifier
    ) {

        SearchTextField(
            text = productSeachText,
            onTextChange = { newText ->
                productSeachText = newText
            }
        )

        val productsFilted = remember(productSeachText) {
            sampleProducts.filter {
                it.name.contains(productSeachText, true) ||
                        it.description?.contains(productSeachText, true) ?: false
            }
        }
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            contentPadding = PaddingValues(vertical = 16.dp)
        ) {

            if (productSeachText.isBlank()){
                for (section in sampleSections) {
                    val title = section.key
                    val products = section.value
                    item {
                        ProductSection(
                            title = title,
                            prods = products
                        )
                    }
                }
            }else{
                items(productsFilted){ p ->
                  ProductItemCard(
                      product = p,
                      modifier = Modifier
                          .padding(horizontal = 16.dp)
                  )
                }
            }



        }
    }
}

@Preview
@Composable
private fun HomeScreenPreview() {
    FoodAppTheme {
        Scaffold { paddingValues ->
            HomeScreen(
                Modifier.padding(
                    paddingValues
                )
            )
        }

    }
}