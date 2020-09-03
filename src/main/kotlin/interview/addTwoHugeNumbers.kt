package interview

import java.math.BigInteger

//data class ListNode<T>(var value: T) {
//    var next: ListNode<T>? = null;
//}

fun addTwoHugeNumbers(a: ListNode<Int>?, b: ListNode<Int>?): ListNode<Int>? {

    // get the sum from the two number
    val firstNumber = getActualNumber(a)
    val secondNumber = getActualNumber(b)
    var sum = firstNumber + secondNumber

    // println("firtNumber $firstNumber")
    // println("secondNumber $secondNumber")
    // println("sum $sum")

    // divide the sum and convert them as a list
    // PS the list is revered
    val numberList = mutableListOf<Int>()
    do {
        val temp = sum % BigInteger.valueOf(10000)
        numberList.add(temp.toInt())

        sum /= BigInteger.valueOf(10000)
    } while (sum > BigInteger.ZERO)

    // println("numberList $numberList")

    // create a linked list from the list
    val startingNode = ListNode(numberList.last())
    var currentNode = startingNode
    for (index in (numberList.lastIndex - 1) downTo 0) {
        val node = ListNode(numberList[index])
        currentNode.next = node
        currentNode = currentNode.next!!
    }


    return startingNode
}


/**
 * crawls over a linked list and create a value from the linked list data
 */
fun getActualNumber(a: ListNode<Int>?): BigInteger {
    var sum: BigInteger = BigInteger.ZERO
    var head = a
    while (head != null) {
        sum = (sum * BigInteger.valueOf(10000)) + BigInteger.valueOf(head.value.toLong())
        head = head.next
    }

    return sum
}
