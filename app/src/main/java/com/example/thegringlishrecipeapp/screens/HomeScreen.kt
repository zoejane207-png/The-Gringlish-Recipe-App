package com.example.thegringlishrecipeapp.screens
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import com.example.thegringlishrecipeapp.R
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import recipes


@Composable
fun HomeScreen(onRecipeClick: (Int) -> Unit, modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(horizontal = 40.dp),
        contentPadding = PaddingValues(
            vertical = 16.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        item {Image(
            painter = painterResource(R.drawable.app_logo),
            contentDescription = "App logo",
            modifier = Modifier
        )}
        item {
            Text("\"Don\'t burn the butter!!!\"")
        }
        item {
            Text("Recipes")
        }
        itemsIndexed(
            recipes, key = {
                _, recipe -> recipe.name
            }
        ) {
            index, recipe ->
            Card(modifier = Modifier
                .fillMaxWidth()
                .clickable { onRecipeClick(index) }) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(12.dp)
                ) {
                    Image(
                        painter = painterResource(recipe.image),
                        contentDescription = "Recipe Image",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.size(72.dp)
                    )
                    Spacer(Modifier.width(16.dp))

                    Column( modifier = Modifier.padding(24.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally){
                        Text(recipe.name)
                        Image(
                            painter = painterResource(recipe.stelometer),
                            contentDescription = "Stelometer"
                        )
                    }

                }
            }
        }
    }
}