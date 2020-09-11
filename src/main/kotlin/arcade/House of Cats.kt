package arcade

//There are some people and cats in a house. You are given the number of legs they have all together. Your task is to return an array containing every possible number of people that could be in the house sorted in ascending order. It's guaranteed that each person has 2 legs and each cat has 4 legs.


fun houseOfCats(legs: Int): MutableList<Int> {

    val humanNumberList = mutableListOf<Int>()

    var catNo = legs / 4
    while(catNo >= 0){
        val remainingHumanLeg = legs - (catNo * 4)
        val human = remainingHumanLeg / 2

        humanNumberList.add(human)
        catNo--
    }

    return humanNumberList
}
