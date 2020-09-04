import interview.ListNode

//data class ListNode<T>(var value: T) {
//    var next: ListNode<T>? = null;
//}

//
fun rearrangeLastN(l: ListNode<Int>?, n: Int): ListNode<Int>? {
    var initialHead = l
    var nodeCount = countNodes(l)

    // if n is equal to the list size or zero then nothing is required
    // the output is same as input
    if(n == 0 || nodeCount == n) return initialHead


    var futureHeadNodePosition = nodeCount - n // count where we need to split the list
    var futureHead: ListNode<Int>? = initialHead // this will be the result


    // loop obver to the split point
    var currentHead = l
    for(position in 1 until futureHeadNodePosition){
        currentHead = currentHead?.next
    }

    // split the list by holding the new starting point and
    // mark the finshing the first part of the list
    futureHead = currentHead?.next
    currentHead?.next = null // make the list end by setting this as the last node

    var secondStepHead = futureHead // this will contain the current head for the second step

    // loop over the last node in the second part of the split
    while(secondStepHead?.next != null){
        secondStepHead = secondStepHead?.next
    }

    // link the last node of second part to the initital node
    secondStepHead?.next = initialHead

    return futureHead
}

fun countNodes(l: ListNode<Int>?):Int{
    var count = 0
    var head = l
    while(head!=null){
        head = head.next
        count++
    }
    return count
}
