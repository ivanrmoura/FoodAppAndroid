package br.com.foodapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.foodapp.R
import br.com.foodapp.ui.theme.FoodAppTheme
import br.com.foodapp.ui.theme.Purple40
import br.com.foodapp.ui.theme.Red200


@Composable
fun ProductItemCardAula() {
    Card(
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = Color.White
        ),
        modifier = Modifier
            .padding(16.dp)

    ) {


        Column(
            modifier = Modifier
                .width(200.dp)
                .heightIn(
                    min = 200.dp,
                    max = 350.dp
                )

        ) {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(100.dp)
//                    .background(
//                        brush = Brush.horizontalGradient(
//                            listOf(
//                                PurpleColorCard, TealColorCard
//                            )
//                        )
//                    )
            ) {
                Image(
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
                        ),
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = null
                )
            }

            Spacer(
                modifier = Modifier
                    .height(50.dp)
            )

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(all = 16.dp)
            ) {
                Text(
                    text = "Lorem ipsum is placeholder text " +
                            "sssssssssssssssssssssssssss  sss",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Text(
                    text = "R$ 14,99",
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
        ProductItemCardAula()
    }
}

@Composable
fun LayoutCustumizado() {
    Column(
        modifier = Modifier
            //.fillMaxHeight()
            //.fillMaxWidth()
            .fillMaxSize()
            .padding(all=8.dp)
            .background(
                color = Red200
            )
            .padding(all = 8.dp)
    ) {
        Text(
            text = "Texto 01"
        )
        Text(
            text = "Texto 02"
        )
        Row(
            modifier = Modifier
                .padding(
                    start = 8.dp,
                    top = 8.dp
                )
                .background(
                    color = Purple40
                )
                .fillMaxWidth(0.5f)
        ){
            Text(
                text = "Texto 03",
                fontSize = 20.sp,
                fontWeight = FontWeight(600),
                modifier = Modifier
                    .background(
                        color = Color.Yellow
                    )
            )
            Text(
                text = "Texto 04"
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun LayoutCustomizadoPreview() {
    FoodAppTheme {
        LayoutCustumizado()
    }
}
