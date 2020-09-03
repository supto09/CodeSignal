package interview


fun removeKFromList(l: ListNode<Int>?, k: Int): ListNode<Int>? {

    var startingPoint = l

    while(startingPoint?.value == k){
        startingPoint = startingPoint?.next
    }

    // println("startingPoint $startingPoint")

    var head = startingPoint
    do{
        if(head?.next?.value == k){
            head?.next = head?.next?.next
        } else{
            head = head?.next
        }
    } while(head?.next != null)


    // var xhead = startingPoint
    // do{
    //     println("xhead ${xhead?.value}  ${xhead?.next}  ")
    //     xhead  = xhead?.next
    // } while(xhead?.next != null)


    return startingPoint
}


 data class ListNode<T>(var value: T) {
     var next: ListNode<T>? = null;
 }