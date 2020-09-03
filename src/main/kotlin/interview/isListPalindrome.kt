package interview

//data class ListNode<T>(var value: T) {
//    var next: ListNode<T>? = null;
//}

fun isListPalindrome(l: ListNode<Int>?): Boolean {
    val dataList = mutableListOf<Int>()


    // loop over the linkList and extract data to create a new list
    var head = l
    while(head != null){
        dataList.add(head.value)
        head = head?.next
    }

    // println(dataList)


    // check if the extracted list is palindrome
    for(index in 0..(dataList.size/2)-1){
        if(dataList[index] != dataList[dataList.size-index-1]){
            return false
        }
    }



    return true
}
