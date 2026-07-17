package com.example.thegringlishrecipeapp.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.thegringlishrecipeapp.R
import com.example.thegringlishrecipeapp.ui.theme.Nunito
import com.example.thegringlishrecipeapp.ui.theme.Poppins
import recipes

@Composable
fun RecipeScreen(recipeIndex: Int, modifier: Modifier = Modifier) {
    val recipe = recipes[recipeIndex]
    val half = (recipe.ingredients.size + 1 ) / 2
    val leftCol = recipe.ingredients.take(half)
    val rightCol = recipe.ingredients.drop(half)
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
//            .padding(vertical = 30.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(R.color.off_orange))
                .padding(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                recipe.name,
                fontFamily = Poppins,
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(8.dp)
            )

            Text(
                recipe.description,
                fontFamily = Nunito,
                textAlign = TextAlign.Center
            )

            Spacer(
                modifier = Modifier.height(16.dp)
            )

            Image(
                painter = painterResource(recipe.image),
                contentDescription = "Image of recipe",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth().height(200.dp)
            )
            Spacer(
                modifier = Modifier.height(16.dp)
            )
            Row(
                modifier = Modifier.fillMaxWidth()
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        "Portions: ${recipe.portions}",
                        fontFamily = Nunito
                    )
                    Spacer(
                        modifier = Modifier.height(12.dp)
                    )
                    Text(
                        "Duration: ${recipe.duration}",
                        fontFamily = Nunito
                    )
                }
                Image(
                    painter = painterResource(recipe.stelometer),
                    contentDescription = "Stelometer",
                    modifier = Modifier.size(64.dp)
                )
            }
            }
        Column(

        ) {
            Spacer(
                modifier = Modifier.height(16.dp)
            )
            Column(
                modifier = Modifier.fillMaxWidth()
            ) {
                Card(modifier = Modifier.weight(1f)) {
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(
                            "Ingredients:"
                        )
                        recipe.ingredients.forEach {
                            Text(
                                "– $it"
                            )
                        }
                    }
                }
            }
            Spacer(
                modifier = Modifier.height(16.dp)
            )
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(12.dp)) {
                    Text(
                        "Instructions:"
                    )
                    recipe.instructions.forEachIndexed { index, step ->
                        Text(
                            "${index + 1}. $step"
                        )
                    }
                }
            }
        }
    }
}