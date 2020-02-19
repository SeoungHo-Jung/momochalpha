package com.example.momochalpha

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recipe_window.*

class MainActivity : AppCompatActivity() {

    //This is the list of food recipes. Further on we could also add more.
    //Try to add vegetarian/vegan option (Maybe by indexing it with odd/even numbers.
    private val food = mutableListOf("Instant Pot Mac and Cheese", "Lighter Chicken Parmesan", "Bacon and Egg Spaghetti", "Chicken Stir-Fry", "Soba Noodles with Salmon", "Egg-and-Bean Dinner Salad")
    var cntr = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gacha.setOnClickListener {
            //This will give the range of the list
            //It is valid even if we add more elements
            cntr += 1

            //if the user rerolls more than 10 times, show this message
            if(cntr > 10){
                Toast.makeText(this, "You don't wanna cook do you?", Toast.LENGTH_SHORT).show()
            }
            //If the user rerolls more than 15 times, show this message and open a new Activity
            if(cntr > 14){
                //If the user keeps re-rolling, open a new screen that leads to the delivery apps
                Toast.makeText(this, "Alrighty, Plan B", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, DeliveryScreen :: class.java))

                //resets the counter back to 0
                cntr = 0
            }

            val listRange = food.size -1

            val rnds = (0..listRange).random()
            val getFood = food.get(rnds)

            ShowRecipe.visibility = View.VISIBLE

            //This will trigger a new screen popup that will show the recipe
            ShowRecipe.setOnClickListener{

                //By using intent, store the value of getFood so that I could use its value at RecipeScreen.kt
                val intent = Intent(this, RecipeScreen::class.java)
                intent.putExtra("FoodName", getFood)
                startActivity(intent)
            }


            //Would probably need a class to wrap this up into a single method
            if (getFood == "Instant Pot Mac and Cheese") {
                imageView.setImageResource(R.drawable.macncheese)
                editText.setText("Instant Pot Mac and Cheese !")
            }

            if (getFood == "Lighter Chicken Parmesan") {
                imageView.setImageResource(R.drawable.chickenparmesan)
                editText.setText("Lighter Chicken Parmesan !")
            }

            if (getFood == "Bacon and Egg Spaghetti") {
                imageView.setImageResource(R.drawable.baconandeggspaghetti)
                editText.setText("Bacon and Egg Spaghetti !")
            }

            if (getFood == "Chicken Stir-Fry") {
                imageView.setImageResource(R.drawable.chickenstirfry)
                editText.setText("Chicken Stir-Fry !")
            }

            if (getFood == "Soba Noodles with Salmon") {
                imageView.setImageResource(R.drawable.soba)
                editText.setText("Soba Noodles with Salmon !")
            }

            if (getFood == "Egg-and-Bean Dinner Salad") {
                imageView.setImageResource(R.drawable.eggandbeansalad)
                editText.setText("Egg-and-Bean Dinner Salad !")
            }
        }
    }
}
