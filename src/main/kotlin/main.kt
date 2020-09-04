import interview.groupingDishes
import java.io.File

fun main(args: Array<String>) {

    val result = groupingDishes(
        mutableListOf(
            mutableListOf("Salad", "Tomato", "Cucumber", "Salad", "Sauce"),
            mutableListOf("Pizza", "Tomato", "Sausage", "Sauce", "Dough"),
            mutableListOf("Quesadilla", "Chicken", "Cheese", "Sauce"),
            mutableListOf("Sandwich", "Salad", "Bread", "Tomato", "Cheese")
        )
    )

    println(result)
}

