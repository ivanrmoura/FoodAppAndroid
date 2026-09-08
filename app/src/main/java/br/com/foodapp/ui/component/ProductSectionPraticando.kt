//package br.com.foodapp.ui.component
//
//import androidx.compose.foundation.horizontalScroll
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.rememberScrollState
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import br.com.foodapp.ui.theme.FoodAppTheme
//
//
//@Composable
//fun ProductSectionPraticando() {
//    Column(
//        modifier = Modifier
//            .fillMaxWidth()
//    ){
//        Text(
//            text = "Promoções",
//            fontSize = 20.sp,
//            modifier = Modifier
//                .padding(start = 16.dp)
//        )
//
//        Row(
//            modifier = Modifier
//                .padding(start = 16.dp, top = 8.dp, end = 16.dp)
//                .horizontalScroll(state = rememberScrollState())
//                ,
//            horizontalArrangement = Arrangement.spacedBy(16.dp)
//        ) {
//            ProductItemCard()
//            ProductItemCard()
//            ProductItemCard()
//        }
//    }
//}
//
//
//@Preview(showBackground = true)
//@Composable
//private fun ProductSectionPreview() {
//    FoodAppTheme {
//        ProductSectionPraticando()
//    }
//}