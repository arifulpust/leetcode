package jp.co.hackerrank

class MiniMaxSum {
    companion object{
        @JvmStatic
        fun main(args :Array<String>)
        {
       //     val n = readLine()!!.trim().toInt()

            val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

           // miniMaxSum(arr)
            gradingStudents(arr)
        }

        fun gradingStudents(grades: Array<Int>): Array<Int> {
            // Write your code here
            for(index in 0..grades.size-1 )
            {
                if(grades[index]>37&&(grades[index]%5)>=3)
                    {
                        grades[index]+= 5-grades[index]%5
                    }
               // println(grades[index])

            }

            return grades

        }
//MiniMaxSum
fun miniMaxSum(arr: Array<Int>): Unit {
    arr.sort()
    var occurs=arr.count { it == arr[arr.size-1] }
    println(occurs.toString())

    // Write your code here
//    arr.sort()
//    var sum:Long=0
//
//    for(item in arr)
//    {
//        sum+=item
//    }
//    println((sum-arr[arr.size-1]).toString()+" "+(sum-arr[0]).toString())


}



    }
}