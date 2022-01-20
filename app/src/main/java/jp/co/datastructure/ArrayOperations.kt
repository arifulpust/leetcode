package jp.co.datastructure

class ArrayOperations() {
    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            // print

         //   2Dimension LeetCode_118_Pascal_Triangle
         //   2Dimension LeetCode_566_Reshape_the_Matrix
         //   2Dimension LeetCode_74_Search_2D_Matrix
            //HashSe use in LeetCode_36_Valid_Sudoku
            //HashSe use in 169. Majority Element
           // println(bubbleSort(intArrayOf(2,0,2,1,1,0)))
            println(
                merge(
                    arrayOf(
                        intArrayOf(1, 3),
                        intArrayOf(2, 6),
                        intArrayOf(8, 10),
                        intArrayOf(15, 18)
                    )
                )
            )

        }
//
        //56. Merge Intervals
fun merge(intervals: Array<IntArray>): Array<IntArray> {

    val list: MutableList<MutableList<Int>> = ArrayList() // alternatively: = mutableListOf()

   var array = mutableListOf<Int>()

    if(intervals.size==0)
    return intervals
var min:Int=intervals[0][0]
var max:Int=intervals[0][1]
            for(index in 1..intervals.size-1) {
                if (max > intervals[index][0] && max < intervals[index][1]) {
                    array = mutableListOf<Int>()
                    array.add(min)
                    array.add(max)
                    list.add(array)
                    max = Int.MIN_VALUE
                    min = Int.MAX_VALUE
                } else {
                    min = intervals[index][0]
                    max = intervals[index][1]
                }
            }
    println(list.size)
     val reshape = Array(list.size) { IntArray(2) }
//    for(item in 0..reshape.size)
//    {
//        reshape[item]=intArrayOf(list[item][0], list[item][1])
//        println(reshape[item][0].toString()+reshape[item][1])
//
//    }


return reshape

}
        // perform the bubble sort
        fun bubbleSort(array: IntArray):Unit {
            val size = array.size

            // loop to access each array element
            for (i in 0 until size - 1)  // loop to compare array elements
                for (j in 0 until size - i - 1)  // compare two adjacent elements
                // change > to < to sort in descending order
                    if (array[j] > array[j + 1]) {

                        // swapping occurs if elements
                        // are not in the intended order
                        val temp = array[j]
                        array[j] = array[j + 1]
                        array[j + 1] = temp
                    }



        }
        //169. Majority Element
        fun majorityElement(nums: IntArray): Int {
            var majorityElement:Int=0
            var mxOccurs:Int=-1
            for(item in nums)
            {

                var occurs=nums.count { it == item }
                if(occurs>mxOccurs)
                {
                    mxOccurs=occurs
                    majorityElement=item
                }
            }
return majorityElement
        }

        fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {


            var tempRow:Int=0
            var tempCollumn:Int=0
            var row=mat.size
            var collumn:Int=0
            if(row>0)
                collumn=mat[0].size

            if((row*collumn)==(r*c))
            {
                val reshape = Array(r) { IntArray(c) }
                for(index1 in 0..r-1)
                {
                    for(index2 in 0..c-1)
                    {
                        reshape[index1][index2]=mat[tempRow][tempCollumn++]
                        if(tempCollumn==collumn)
                        {
                            tempCollumn=0
                            tempRow++
                        }

                    }
                }

                return reshape
            }
            else {
                return mat
            }



        }

    }
}