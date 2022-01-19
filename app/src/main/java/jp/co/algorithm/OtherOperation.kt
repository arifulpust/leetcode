package jp.co.algorithm

class OtherOperation {
    companion object{
        @JvmStatic
        fun main(arg:Array<String>)
        {
           println(myPow(2.10000,3))
        }
        fun myPow(x: Double, n: Int): Double {
            var sum:Double=x
            if(n<0)
            {
return 1/(x*(-1)*n.toDouble())

            }
            else if(n==1)
            {
                return  x
            }
            else if(n==0)
            {
                return  0.0
            }
            for(i in 2..n)
            {
                sum*=x
            }
            return sum
        }
    }
}