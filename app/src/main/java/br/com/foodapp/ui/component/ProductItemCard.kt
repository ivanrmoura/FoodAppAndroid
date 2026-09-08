package br.com.foodapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.foodapp.R
import br.com.foodapp.model.Product
import br.com.foodapp.ui.theme.FoodAppTheme
import br.com.foodapp.ui.theme.PurpleCard
import br.com.foodapp.ui.theme.TealCard
import java.math.BigDecimal
import kotlin.math.min


@Composable
fun ProductItemCard(
    product: Product
) {
    Card(
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        )
//        modifier = Modifier
//            .padding(16.dp)
    ){
        Column(
            modifier = Modifier
                .width(200.dp)
                .heightIn(
                    min = 250.dp,
                    max = 300.dp
                )
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
                    .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(
                                PurpleCard, TealCard
                            )
                        )
                    )
            ){
                Image(
                    painter = painterResource(
                        product.image
                    ),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                        .offset(
                            y = 50.dp
                        )
                        .clip(
                            shape = CircleShape
                        )
                        .align(
                            alignment = Alignment.Center
                        )

                )
            }

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )


            Column(
                modifier = Modifier
                    .padding(all= 16.dp)
            ) {

                Text(
                    text = product.name,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis,
                    modifier = Modifier
                        .padding(bottom = 8.dp)
                )
                Text(
                    text = product.price.toPlainString(),
                    fontSize = 14.sp
                )

            }


        }
    }
}

@Preview(showBackground = true)
@Composable
private fun ProductItemCardPreview() {
    FoodAppTheme {
        ProductItemCard(
            Product(
                name = "Hamburguer de frango com queijo triplo",
                image = R.drawable.ic_launcher_background,
                price = BigDecimal("28.99")
            )
        )
    }
}
