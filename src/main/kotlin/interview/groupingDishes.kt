package interview

//fun groupingDishes(dishes: MutableList<MutableList<String>>): MutableList<MutableList<String>> {
//    val ingredientsMap: MutableMap<String, Set<String>> = mutableMapOf()
//    dishes.forEach {
//        val dishName = it[0]
//        for (ingredientIndex in 1 until it.size) {
//            val ingredient = it[ingredientIndex]
//            val dishesForIngredient = ingredientsMap[ingredient]?.toMutableSet() ?: mutableSetOf()
//
//            for (dish: MutableList<String> in dishes) {
//                if (dish.contains(ingredient)) {
//                    dishesForIngredient.add(dish[0])
//                }
//            }
//
//            ingredientsMap[ingredient] = dishesForIngredient.toSortedSet()
//        }
//    }
//
//    val filteredMap = ingredientsMap
//        .filter {
//            it.value.size > 1
//        }
//        .toSortedMap()
//        .map {
//            val resultList = mutableListOf(
//                it.key
//            )
//
//            for (s in it.value) {
//                resultList.add(s)
//            }
//
//            resultList
//        }
//
//    return filteredMap as MutableList<MutableList<String>>
//}

fun groupingDishes(dishes: MutableList<MutableList<String>>): MutableList<MutableList<String>> {
    val map = mutableMapOf<String, MutableList<String>>()
    for (dish in dishes){
        val dishName = dish[0]
        for (i in 1 until dish.size){
            val ingredient = dish[i]
            if(!map.containsKey(ingredient)){
                map[ingredient] = mutableListOf()
            }
            map[ingredient]!!.add(dishName)
        }
    }
    val result = mutableListOf<MutableList<String>>()
    val sortedIngredients = map.keys.sorted()
    for (ing in sortedIngredients){
        var row = mutableListOf(ing)
        var values = map[ing]?.sorted().orEmpty()
        if(values.size >=2) {
            row.addAll(values)
            result.add(row)
        }
    }
    return result
}
