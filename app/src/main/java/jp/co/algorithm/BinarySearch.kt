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
           print( searchInsert(intArrayOf(1,3,5,6), 7))
          //  print(firstBadVersion(2))
        }
        //35. Search Insert Position
        fun searchInsert(nums: IntArray, target: Int): Int {

            var beg = 0
            var end = nums.size - 1
            var mid: Int=0
            while (beg <= end) {
                mid =  beg+(end - beg) / 2
                when {
                    target > nums[mid] -> beg = mid + 1 //
                    target == nums[mid] -> return mid // found the element
                    target < nums[mid] -> end = mid-1

                }
               // print(beg.toString()+"  "+mid+"  "+end)
            }
            if(nums[mid]>target)
            return mid
            else return mid+1

        }
//278. First Bad Version
         fun firstBadVersion(n: Int) : Int {
            var beg = 1
            var end = n
            var mid: Int=1
            while (beg < end) {

                mid = beg+ (end - beg) / 2
                when {
                    !isBadVersion(mid)   -> beg = mid+1  //
                    isBadVersion(mid)  -> end = mid

                }
                if(beg==end)
                    return beg

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


