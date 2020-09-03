package interview


fun mergeTwoLinkedLists(l1: ListNode<Int>?, l2: ListNode<Int>?): ListNode<Int>? {
    if(l1 == null) return l2
    if(l2 == null) return l1


    if(l1?.value < l2?.value){
        l1.next = mergeTwoLinkedLists(l1.next,l2)
        return l1
    } else{
        l2.next = mergeTwoLinkedLists(l2.next,l1)
        return l2
    }
}