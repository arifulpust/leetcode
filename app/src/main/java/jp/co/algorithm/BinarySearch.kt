package jp.co.algorithm

class BinarySearch {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            //val input = readLine()!!.trim().split(" ").map { it -> it.toInt() }.toIntArray() // to read an array (from user input)
          //  val eleToSearch = readLine()!!.trim().toInt() // to read the element to be searched (from user input)
//            val pos = search(intArrayOf(-1, 0,3,5,9,12), 2)
//            if (pos >= 0) {
//                println(pos) // to print position at last
//            } else {
//                println(pos)
//            }
            print(firstBadVersion(3))
        }

         fun firstBadVersion(n: Int) : Int {
            var beg = 1
            var end = n
            var mid: Int=1
            while (beg < end) {
                mid =  beg+(end - beg) / 2
                when {
                    !isBadVersion(mid)   -> beg = mid + 1 //
                    isBadVersion(mid)  -> end = mid-1

                }

            }
             return  mid

        }
        fun isBadVersion(bad:Int):Boolean
        {
            if(bad==2)
                return true
            else return false

        }
//704. Binary Search
        fun search(input: IntArray, eleToSearch: Int): Int {

            var beg = 0
            var end = input.size - 1
            var mid: Int
            while (beg <= end) {
                mid =  beg+(end + beg) / 2
                when {
                    eleToSearch > input[mid] -> beg = mid + 1 //
                    eleToSearch == input[mid] -> return mid // found the element
                    eleToSearch < input[mid] -> end = mid-1

                }
                print(beg.toString()+"  "+mid+"  "+end)
            }
            return -1
        }
    }
}


