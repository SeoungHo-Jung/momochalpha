package com.example.momochalpha

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.recipe_window.*


//This Kotlin class shows
class RecipeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_window)

        //This calls the value of getFood from the MainActivity
        val getFood = intent.getStringExtra("FoodName")

        if (getFood == "Instant Pot Mac and Cheese") {
            recipe_image.setImageResource(R.drawable.macncheese)
            recipeText.setText("Instant Pot Mac and Cheese\n" +
                    "\n" +
                    "1. Combine the macaroni, 4 cups water and 1 tablespoon salt in an Instant Pot® (see Cook's Note). Follow the manufacturer's guide for locking the lid and preparing to cook. Set to pressure cook on high for 4 minutes.\n" +
                    "\n" +
                    "2. After the pressure cook cycle is complete follow the manufacturer's guide for quick release and wait until the quick release cycle is complete. Careful of any remaining steam, unlock and remove the lid and switch to low saute setting. \n" +
                    "\n" +
                    "3. Stir in the evaporated milk, butter and 1/4 cup water. Then add the Cheddar, a little at time, while constantly stirring, until the cheese is completely melted. Serve hot.\n" +
                    "\n" +
                    "Cook’s Note\n" +
                    "Settings may vary on your Instant Pot® depending on the model. Please refer to the manufacturer's guide.\n")
        }

        if (getFood == "Lighter Chicken Parmesan") {
            recipe_image.setImageResource(R.drawable.chickenparmesan)
            recipeText.setText("Lighter Chicken Parmesan\n" +
                    "\n" +
                    "1. Preheat the broiler to medium. Bring a large pot of water to a boil.\n" +
                    "\n" +
                    "2. Combine the marinara sauce and balsamic vinegar in a small saucepan and bring to a boil over high heat. Reduce the heat and simmer for 5 minutes.\n" +
                    "\n" +
                    "3. Meanwhile, in a shallow dish, combine the breadcrumbs, half the Parmesan, half the parsley and some salt and pepper. Put the beaten egg whites in a separate shallow dish. Coat the chicken tenders in the egg whites first, then dredge in the breadcrumb mixture.\n" +
                    "\n" +
                    "4. Add the pasta to the boiling water and cook according to the package instructions.\n" +
                    "\n" +
                    "5. Heat the oil in a large ovenproof nonstick skillet over medium-high heat. Add the chicken and cook, turning once, until golden, about 3 minutes per side. Pour the tomato sauce over the chicken, scatter the mozzarella and remaining Parmesan evenly over top and broil until the cheese is melted and bubbly, about 2 minutes.\n" +
                    "\n" +
                    "6. Drain the pasta. Serve with the chicken and garnish with the remaining parsley.\n")
        }

        if (getFood == "Bacon and Egg Spaghetti") {
            recipe_image.setImageResource(R.drawable.baconandeggspaghetti)
            recipeText.setText("Bacon and Egg Spaghetti\n" +
                    "\n" +
                    "1. Bring a large pot of salted water to a boil. Add the pasta and cook as the label directs. Drain, reserving 1 cup of the cooking water.\n" +
                    "\n" +
                    "2. Meanwhile, heat the olive oil in a separate large pot over medium-high heat. Add the bacon and cook until crisp, 7 to 9 minutes.\n" +
                    " \n" +
                    "3. Add the pasta, 1/2 cup reserved cooking water and the parmesan to the pot with the bacon. Cook, stirring and adding more cooking water as needed, until coated; season with salt and pepper.\n" +
                    " \n" +
                    "4. Meanwhile, heat the remaining 2 teaspoons olive oil in a large nonstick skillet over medium heat. Add the eggs and cook until the whites are set but the yolks are still runny, about 4 minutes; season with salt and pepper. Top the pasta with the eggs and chives.\n")
        }

        if (getFood == "Chicken Stir-Fry") {
            recipe_image.setImageResource(R.drawable.chickenstirfry)
            recipeText.setText("Chicken Stir-Fry\n" +
                    "\n" +
                    "1. Heat 1 tablespoon oil in a saute pan over medium heat. Add garlic and stir. Place the chicken in the pan and brown 4 minutes on each side. Remove from pan, slice into strips, set aside.\n" +
                    "\n" +
                    "2. Heat remaining tablespoon of oil in a wok over high heat. Add the vegetables and teriyaki sauce. Stir-fry quickly until the vegetables begin to soften. Add the chicken strips, combine well and continue to cook for 2 to 3 minutes. Serve immediately.\n" +
                    "\n")
        }

        if (getFood == "Soba Noodles with Salmon") {
            recipe_image.setImageResource(R.drawable.soba)
            recipeText.setText("Soba Noodles with Salmon\n" +
                    "\n" +
                    "1. Bring a large pot of water to a boil. Add the noodles and cook as the label directs. Drain and rinse well under cold water; set aside.\n" +
                    "\n" +
                    "2. Meanwhile, combine the mushroom broth, mirin, soy sauce and fish sauce in a medium skillet. Bring to a boil, then reduce the heat to a bare simmer. Season the salmon with salt and pepper and add to the skillet along with the bell pepper and celery. Cover and cook, carefully flipping once, until the salmon is cooked through and flakes at the touch, 21/2 to 3 minutes per side. Remove the salmon using a slotted spoon or fish spatula; discard the skin.\n" +
                    "\n" +
                    "3. Return the broth mixture to a boil, then remove from the heat. Season with salt. Divide the noodles and basil among bowls. Ladle vegetables and broth into each bowl, top with the salmon and sprinkle with the sesame seeds.\n" +
                    "\n")
        }

        if (getFood == "Egg-and-Bean Dinner Salad") {
            recipe_image.setImageResource(R.drawable.eggandbeansalad)
            recipeText.setText("Egg-and-Bean Dinner Salad\n" +
                    "\n" +
                    "1. Put the eggs and turnips in a saucepan, cover with water and bring to a boil. Remove from the heat and let stand, covered, 10 minutes. Remove the eggs but keep the turnips in the hot water, covered, until tender, 2 to 3 more minutes. Peel the eggs and cut into quarters.\n" +
                    "\n" +
                    "2. Drain the turnips, then return to the warm pan and toss with the butter (turn on the heat to melt the butter if needed). Add the tarragon, chives, olive oil and lemon juice and toss.\n" +
                    "\n" +
                    "3. Toss the endive, lettuce, escarole, celery and beans in a large bowl and season with salt and pepper. Add the eggs and turnip mixture and gently toss again.\n")
        }
    }
}

