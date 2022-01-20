package jp.co.hackerrank

import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class TimeConversion {
    companion object{
        @JvmStatic
        fun main(args :Array<String>)
        {
           // val n = readLine()!!.trim().toInt()
            //val s = readLine()!!

          //  val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

            //val result = timeConversion(s)

           // println(result)
            fizzBuzz(15)
        }
//MiniMaxSum
fun findTheMedian()
{

}
        fun fizzBuzz(n: Int): Unit {
            // Write your code here
            for(item in 1..n)
            {
                if(item%3==0&&item%5==0)
                {
                    println("FizzBuzz")
                }else if(item%3==0)
                {
                    println("Fizz")
                }
                else if(item%5==0)
                {
                    println("Buzz")
                }
                else
                {
                    println(item)
                }

            }
        }
        fun timeConversion(input: String?): String? {

            // Format of the date defined in the input String
            val dateFormat: DateFormat = SimpleDateFormat("hh:mm:ssaa")

            // Change the pattern into 24 hour format
            val format: DateFormat = SimpleDateFormat("HH:mm:ss")
            var time: Date? = null
            var output = ""

            // Converting the input String to Date
            time = dateFormat.parse(input)

            // Changing the format of date
            // and storing it in
            // String
            output = format.format(time)
            return output
        }



    }
}