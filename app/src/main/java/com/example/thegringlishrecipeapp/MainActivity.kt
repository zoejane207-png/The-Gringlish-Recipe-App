package com.example.thegringlishrecipeapp


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.thegringlishrecipeapp.screens.HomeScreen
import com.example.thegringlishrecipeapp.ui.theme.TheGringlishRecipeAppTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.thegringlishrecipeapp.screens.RecipeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheGringlishRecipeAppTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                    color = colorResource(R.color.off_white)
                ){
                    App()
                }
            }
        }
    }
}

@Composable
fun App() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home") {
        composable(route = "home") {
            HomeScreen(onRecipeClick = { index -> navController.navigate("recipe/$index") })
        }
        composable(route = "recipe/{index}") {
            backStackEntry ->
            val index = backStackEntry.arguments?.getString("index")?.toInt() ?: 0
            RecipeScreen(recipeIndex = index)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppPreview() {
    TheGringlishRecipeAppTheme {
        App()
    }
}