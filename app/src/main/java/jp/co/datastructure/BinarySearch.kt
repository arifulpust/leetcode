package jp.co.datastructure

class BinarySearch {

    companion object {

        fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
            return operation(x, y)                                          // 2
        }

        fun sum(x: Int, y: Int) = x + y                                     // 3

        @JvmStatic
        fun main(args: Array<String>) {
            val sumResult = calculate(4, 5, ::sum)                          // 4
            val mulResult = calculate(20, 5) { a, b -> a / b }               // 5
            println("sumResult $sumResult, mulResult $mulResult")
        }
//        @JvmStatic
//        fun main(args: Array<String>) {
//
//            val input = readLine()!!.trim().split(" ").map { it -> it.toInt() }.toIntArray() // to read an array (from user input)
//            val eleToSearch = readLine()!!.trim().toInt() // to read the element to be searched (from user input)
//            val pos = binarySearchIterative(input, eleToSearch)
//            if (pos >= 0) {
//                println(pos) // to print position at last
//            } else {
//                println("Position not found")
//            }
//        }

        fun binarySearchIterative(input: IntArray, eleToSearch: Int): Int {
            var beg = 0
            var end = input.size - 1
            var mid: Int
            while (beg <= end) {
                mid = beg + (end - beg) / 2
                when {
                    eleToSearch > input[mid] -> beg =
                        mid + 1 // element is greater than middle element of array, so it will be in right half of array
                    eleToSearch == input[mid] -> return mid // found the element
                    eleToSearch < input[mid] -> end = mid
                        //element is less than middle element of array, so it will be in left half of the array.
                }
            }
            return -1
        }
    }
}


