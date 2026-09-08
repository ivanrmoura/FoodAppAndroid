package br.com.foodapp.sampledata

import br.com.foodapp.R
import br.com.foodapp.model.Product
import java.math.BigDecimal


val products = listOf(
    Product(
        name = "Hamburguer de frango com queijo triplo",
        image = R.drawable.ic_launcher_background,
        price = BigDecimal("28.99")
    ),
    Product(
        name = "Pizza de carne de sol",
        image = R.drawable.ic_launcher_background,
        price = BigDecimal("58.45")
    ),
    Product(
        name = "Batata frita com filé na chapa",
        image = R.drawable.ic_launcher_background,
        price = BigDecimal("38.30")
    )
)