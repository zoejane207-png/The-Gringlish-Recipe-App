import com.example.thegringlishrecipeapp.R


data class Recipe (
    val name: String,
    val image: Int,
    val stelometer: Int,
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
        stelometer = R.drawable.green_face,
        description = "Yiayia Zoe's makaronia me kima",
        duration = "40mins",
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
    ),
    Recipe(
        name = "Kokkini Soupa",
        image = R.drawable.kokkinisoupa,
        stelometer = R.drawable.green_face,
        description = "Yiayia's delicious MEAT soup with vegetables, beef, and orzo pasta, perfect for a nutritional pick-me-up",
        duration = "1hr 30mins",
        portions = 6,
        ingredients = listOf(
            "1kg diced beef shin",
            "1 beef bone (rib or marrow)",
            "2 carrots",
            "1 large onion",
            "2 garlic cloves",
            "2 large sticks of celery (with head)",
            "200ml white wine",
            "1L homemade chicken broth",
            "200ml vegetable broth (bounjourn)",
            "6 tbsp GREEK ZAKYNTHIAN olive oil",
            "1 can chopped tomatoes",
            "3 tbsp tomato puree",
            "Just under 1/2 packet orzo",
            "Salt and Pepper"
        ),
        instructions = listOf(
            "Finely chop the carrots and the onion.",
            "Then, heat up a large pan (Needs to be hot!) with a drizzle of olive oil and quickly sear the beef, ensuring all sides are brown. Make sure not to over cook!!!",
            "Place the meat in a deep pot/pan and put to the side for later.",
            "In the same pan that you cooked the meat in, saute the vegetables until the pan gets a bit of colour and becomes hot.",
            "Then, deglaze then pan with the white wine and reduce until alcohol is evaporated.",
            "Add the tomato puree in the middle of the pan and wait for it to cook down.",
            "Add all of this to the pot where you previously put the beef.",
            "Add in the remaining ingredients and season to taste. Simmer on very low heat for at least an hour.",
            "Add in orzo. When orzo is cooked, it's time to serve!",
            "Serve with some nice bread and optionally some lemon juice. Kali oreksi!"
        )
    ),
    Recipe(
        name = "Baked Feta Filo",
        image = R.drawable.feta,
        stelometer = R.drawable.red_face,
        description = "Crispy, sweet, and salty baked feta parcel is a classic Greek meze",
        duration = "25mins",
        portions = 2,
        ingredients = listOf(
            "1 block Greek feta",
            "2 sheets filo pastry",
            "1 tbsp melted unsalted butter",
            "2 tbsp Greek honey",
            "1 tsp sesame seeds",
        ),
        instructions = listOf(
            "First, preheat the oven to 180c and line your baking tray with parchment paper. Gently pat the feta block dry with paper towel and place in the centre of the tray.",
            "Layout 1 sheet of filo and brush with butter. Lay the second sheet on top and brush again with butter.",
            "Now place the feta on top of the sheets in the centre and wrap it like a parcel. Brush entire outside with the rest of the butter.",
            "Place the wrapped feta parcel seam side down onto the baking tray and bake on the middle rack of your oven for 15-20mins or until golden brown.",
            "Transfer hot parcel onto serving plate and drizzle heavily with honey. Sprinkle with sesame seeds.",
            "Serve while hot. Kali oreksi!"
        )
    ),
    Recipe(
        name = "Aloo Gosht Lamb Curry",
        image = R.drawable.aloo_gosht,
        stelometer = R.drawable.green_face,
        description = "A traditional Pakistani-style lamb and potato curry, slow-cooked until tender.",
        duration = "7hrs",
        portions = 4,
        ingredients = listOf(
            "1/4 cup neutral oil (e.g. avocado)",
            "1 tbsp ghee (or butter)",
            "1-1.2 lb bone-in lamb or goat, ~2\" pieces",
            "1 3/4 tsp kosher salt (divided)",
            "6-7 garlic cloves, crushed",
            "1 inch ginger, crushed",
            "1 medium yellow onion, finely chopped",
            "2 small tomatoes, puréed or finely chopped",
            "1-2 green chillies, chopped",
            "2 green cardamom pods",
            "3 whole cloves",
            "1/2 tsp cumin seeds",
            "1.5-2 tsp coriander powder",
            "1/2-1 tsp cumin powder",
            "1/2 tsp red chilli powder",
            "1/2 tsp turmeric",
            "1/4 tsp black pepper",
            "1 tbsp plain whole-milk yogurt, whisked",
            "2 small russet potatoes, cubed",
            "To garnish: 1/2 tsp garam masala",
            "To garnish: 2 tbsp chopped cilantro"
        ),
        instructions = listOf(
            "Heat the oil and ghee in a slow cooker on High. Add lamb and 3/4 tsp salt, stir until a bit the lamb gains a bit of colour.",
            "Add garlic and ginger and stir in.",
            "Add onion, tomatoes, green chilli, whole spices, ground spices (not garam masala) and remaining 1 tsp salt. Pour in 1 cup of water.",
            "Cook on low/medium for ~6 hours, until the lamb is tender.",
            "Stir in the yogurt, potatoes and 2 cups water, cook for about 1 hour until the potatoes are soft to your liking",
            "Taste and adjust salt. Garnish with garam masala , rice and cilantro. Kali oreksi!"
        )

    ),
    Recipe(
        name = "Greek Baked Cod with Tomato Sauce (Bakaliaros Plaki)",
        image = R.drawable.baked_cod,
        stelometer = R.drawable.green_face,
        description = "Greek-style baked cod in a slow-cooked fresh tomato sauce.",
        duration = "1hr 30min",
        portions = 4,
        ingredients = listOf(
            "For the sauce:",
            "1/2 cup olive oil",
            "2 cloves garlic, chopped",
            "3 tbsp fresh parsley, chopped",
            "2 lbs fresh tomatoes, peeled and sliced",
            "1 tbsp fresh basil, chopped",
            "1 tsp dried oregano",
            "1 1/2 tsp salt",
            "1/4 tsp pepper",
            "For the cod:",
            "2 lbs cod fillets (fresh or frozen)",
            "1/3 cup olive oil",
            "2 medium onions, chopped",
            "3 tbsp fresh parsley, chopped",
            "Flour, for coating",
            "Salt and pepper, to taste"
        ),
        instructions = listOf(
            "Make the sauce: heat 1/2 cup olive oil in a saucepan, add garlic and 3 tbsp parsley, cook slowly for 3 min.",
            "Add the tomatoes, basil, oregano, salt and pepper. Cover and cook on very low heat ~45 min until thick.",
            "Preheat oven to 350F (175C). Brush a large baking dish with olive oil.",
            "Dice and de-skin the cod, coat in salt, pepper and flour.",
            "Fry the cod in olive oil to get a coating and colour, then lay in the baking dish in a single layer.",
            "Spread the onions over the fish, then the tomato sauce, then sprinkle with parsley.",
            "Bake in the centre of the oven 20-30 min, until cooked through.",
            "Serve with either rice or Greek style potatoes. Kali oreksi!"
        )
    )
)