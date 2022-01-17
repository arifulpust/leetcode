package jp.co.algorithm

class PrimeNumber
{
    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            // println(LeetCode_53_Maximum_Subarray.maxSubArray(intArrayOf(5, 4, -1, 7, 8)))

            print("Enter a number : ")
            val n = readLine()!!.trim().toInt() // to read the element to be searched (from user input)

            if (isPrime(n)) {
                println("$n is a prime number")
            } else {
                println("$n is not a prime number")
            }
        }


        fun isPrime(n: Int): Boolean {
            if (n <= 1) {
                return false
            }
            var i = 2
            while (i < Math.sqrt(n.toDouble())) {
                if (n % i == 0) {
                    return false
                }
                i++
            }
            return true
        }
    }
}