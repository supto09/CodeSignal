package arcade

//Elections are in progress!
//
//Given an array of the numbers of votes given to each of the candidates so far, and an integer k equal to the number of voters who haven't cast their vote yet, find the number of candidates who still have a chance to win the election.
//
//The winner of the election must secure strictly more votes than any other candidate. If two or more candidates receive the same (maximum) number of votes, assume there is no winner at all.

fun electionsWinners(votes: MutableList<Int>, k: Int): Int {
    val currMax = votes.max() ?: 0
    if(k == 0){
        return if (votes.count { it == currMax } == 1) 1 else 0
    }
    return votes.count { it+k > currMax }
}
