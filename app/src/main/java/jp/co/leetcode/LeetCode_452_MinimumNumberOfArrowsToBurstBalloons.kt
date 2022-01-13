package jp.co.leetcode

import android.R.attr
import java.util.*
import android.R.attr.data





class LeetCode_452_MinimumNumberOfArrowsToBurstBalloons {
    companion object {
        @JvmStatic fun main(args: Array<String>) {

            println(findMinArrowShots(arrayOf(intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(5, 6), intArrayOf(7, 8))))
        }
        fun findMinArrowShots(points: Array<IntArray>): Int {

            Arrays.sort(
                points
            ) { a, b -> Integer.compare(a[1], b[1]) }

            var end = points[0][1]
            var arrow = 1

            for (i in 1 until points.size) {

                // If the start of ith balloon
                // <= end than do nothing
                if (points[i][0] <= end) {
                    continue
                } else {
                    // Update the new end
                    end = points[i][1]
                    arrow++
                }
            }
            return arrow
        }

    }
}