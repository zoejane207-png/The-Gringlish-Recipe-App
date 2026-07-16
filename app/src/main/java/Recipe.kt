import com.example.thegringlishrecipeapp.R

data class Recipe (
    val name: String,
    val image: Int,
    val description: String,
    val duration: String,
    val portions: Int,
    val ingredients: List<String>,
    val instructions: List<String>
)

val recipes = listOf(
    Recipe(
        name = "Makaronia me kima",
        image = R.drawable.makaronia,
        description = "Yiayia Zoe's makaronia me kima",
        duration = "Depends...",
        portions = 4,
        ingredients = listOf(
            "1tbsp olive oil",
            "1 medium carrot",
            "1 stick of celery",
            "1 medium onion",
            "750g minced beef",
            "2tbsp tomato paste",
            "250ml red wine",
            "200ml tomato passata",
            "200ml beef stock",
            "Salt",
            "Pepper",
            "Dried oregano",
            "Dried thyme",
            "2 bay leaves",
            "2 sticks cinnamon",
            "150ml double cream",
            "Linguine pasta"
        ),
        instructions = listOf(
            "Finely dice the carrot, celery and onion.",
            "Heat up pan, once heated, add olive oil. Then saute diced vegetables until soft.",
            "Make a small hole in the middle of the pan and add in the mince meat, breaking it up with a utensil.",
            "While meat is cooking, Spoon out any liquid forming in the pan in order to stop the meat from boiling.",
            "Once meat is cooked, stir in tomato paste.",
            "Get the pan hot and deglaze the pan with the wine. Ensure wine is reduced, to evaporate alcohol.",
            "Add in passata, beef stock, bay leaves, cinnamon sticks and seasoning to taste.",
            "Leave to simmer whilst cooking pasta.",
            "Finally, remove bay leaves and cinnamon sticks and add in the double cream.",
            "Serve on top of your pasta, kali oreksi!"
        )
    )
)