package jp.co.hackerrank

class PlusMinus {

    companion object{
        
        @JvmStatic
        fun main(args :Array<String>)
        {
           // val n = readLine()!!.trim().toInt()

           // val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

           // plusMinus(arr)

            var div = 10 / 2
            div = div * 2
            println(div)
        }
        fun staircase(n: Int): Unit {
            // Write your code here
var pointer:Int=n
            for (index in 1..n)
            {
                pointer--
                for (index2 in 1..n)
                {
                    if(index2>pointer)
                    {
                        print("#")
                    }else
                    {
                        print(" ")
                    }

                }
                println()
            }

        }

        fun diagonalDifference(arr: Array<Array<Int>>): Int {
            // Write your code here
            var leftToRightSum:Int=0
            var rightToLeftSum:Int=0
            for(index in 0..arr.size-1)
            {
                println(arr[index][index])
                leftToRightSum+= arr[index][index]
            }
            var index2:Int=0
            for(index in (arr.size-1) downTo 0)
            {
                rightToLeftSum+= arr[index2++][index]
            }

            var diff=leftToRightSum-rightToLeftSum
            if(diff<0)
                return (-1*diff)
            else return diff

        }
//MiniMaxSum

        fun plusMinus(arr: Array<Int>): Unit {
            // Write your code here
            var minus:Int=0
            var zero:Int=0
            var plus:Int=0
            for(item in arr)
            {
                if(item<0)
                    minus++
                else if(item==0)
                {
                    zero++
                }else
                {
                    plus++
                }
            }
            println(String.format("%.6f", (plus.toDouble()/arr.size.toDouble())))
            println(String.format("%.6f", (minus.toDouble()/arr.size.toDouble())))
            print(String.format("%.6f", (zero.toDouble()/arr.size.toDouble())))

        }



    }
}