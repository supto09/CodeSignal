package arcade

fun isPower(n: Int): Boolean {
    if( n ==1 ) return true
    if( n in 2..3 ) return false

    for(a in 2..n){
        for(b in 2..n){
            if(Math.pow(a.toDouble(),b.toDouble()).toInt() == n){
                return true
            }

            if(Math.pow(a.toDouble(),b.toDouble()).toInt() > n)
                break;
        }
    }


    return false

}