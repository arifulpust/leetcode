package jp.co.leetcode.array

import jp.co.leetcode.LeetCode_21_MergeTwoSortedLists
import java.util.ArrayList

class LeetCode_74_Search_2D_Matrix {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(
                searchMatrix(
                    arrayOf(
                        intArrayOf(1, 2),
                        intArrayOf(3, 4)
                    ), 1
                )
            )

        }

        fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {

            for (row in 0..matrix.size - 1) {

                if (matrix[row][0] <= target && matrix[row][matrix[row].size - 1] >= target) {

                    if (matrix[row].indexOf(target) >= 0) {
                        return true
                    } else
                        return false

                }
            }
            return false
        }
    }
}