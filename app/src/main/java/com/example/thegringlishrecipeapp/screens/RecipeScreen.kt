package com.example.thegringlishrecipeapp.screens

import androidx.compose.foundation.Image
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import recipes

@Composable
fun RecipeScreen(recipeIndex: Int, modifier: Modifier = Modifier) {
    val recipe = recipes[recipeIndex]
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(30.dp)
    ) {
        Text(
            recipe.name
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

        Text(
            recipe.description
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Row(
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
            Spacer(
                modifier = Modifier.width(16.dp)
            )
            Column(modifier = Modifier.weight(1f)) {
                Image(
                    painter = painterResource(recipe.stelometer),
                    contentDescription = "Stelometer",
                    modifier = Modifier.size(64.dp)
                )
                Spacer(
                    modifier = Modifier.height(12.dp)
                )
                Card{
                    Column(modifier = Modifier.padding(12.dp)) {
                        Text(
                            "Portions: ${recipe.portions}"
                        )
                        Spacer(
                            modifier = Modifier.height(12.dp)
                        )
                        Text(
                            "Duration: ${recipe.duration}"
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