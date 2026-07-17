package com.example.thegringlishrecipeapp.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import com.example.thegringlishrecipeapp.R
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import recipes


@Composable
fun HomeScreen(onRecipeClick: (Int) -> Unit, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(30.dp),
        contentPadding = PaddingValues(
            vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {
        item {Image(
            painter = painterResource(R.drawable.app_logo),
            contentDescription = "App logo",
            modifier = Modifier
        )}
        item {
            Text("\"Don\'t burn the butter!!!\"",
                textAlign = TextAlign.Center,
                color = colorResource(R.color.bright_orange),
                modifier = Modifier.fillMaxWidth())
        }
        item {
            Text("Recipes",
                textAlign = TextAlign.Center,
                color = colorResource(R.color.dusty_blue),
                modifier = Modifier.fillMaxWidth())
        }
        itemsIndexed(
            recipes, key = {
                _, recipe -> recipe.name
            }
        ) {
            index, recipe ->
            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable { onRecipeClick(index) },
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.salmon_orange)
                )) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                ) {
                    Box {
                        Image(
                            painter = painterResource(recipe.image),
                            contentDescription = "Recipe Image",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(150.dp)
                        )
                        Image(
                            painter = painterResource(recipe.stelometer),
                            contentDescription = "Stelometer",
                            modifier = Modifier.align(Alignment.TopEnd).size(100.dp)
                        )
                    }
                    Spacer(Modifier.height(12.dp))

                    Text(recipe.name,
                        textAlign = TextAlign.Center,
                        color = colorResource(R.color.brown_black))

                    Text(recipe.description,
                        textAlign = TextAlign.Center,
                        fontSize = 12.sp,
                        color = colorResource(R.color.brown_black),
                        modifier = Modifier.padding(15.dp))

                }
            }
        }
    }
}