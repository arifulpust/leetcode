package jp.co.leetcode.array

import jp.co.leetcode.LeetCode_21_MergeTwoSortedLists
import java.util.ArrayList

class LeetCode_118_Pascal_Triangle {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(getRow(3))
        }

        fun generate(numRows: Int): List<List<Int>> {
            val passcal = mutableListOf<MutableList<Int>>()
            var passcalRows: MutableList<Int> = mutableListOf<Int>()


            if (numRows > 0) {
                passcalRows.add(1)
                passcal.add(passcalRows)
            }
            if (numRows > 1) {
                passcalRows = mutableListOf<Int>()
                passcalRows.add(1)
                passcalRows.add(1)
                passcal.add(passcalRows)
            }
            for (row in 2..numRows - 1) {
                passcalRows = mutableListOf<Int>()
                passcalRows.add(1)
                for (rowTemp in 1..passcal[passcal.size - 1].size-1)
                {
                    passcalRows.add((passcal[passcal.size - 1][rowTemp-1]+passcal[passcal.size - 1][rowTemp]))
                }
                passcalRows.add(1)
                passcal.add(passcalRows)

            }

            return passcal
        }
        //119. Pascal's Triangle II
        fun getRow(numRows: Int): List<Int> {
            val passcal = mutableListOf<MutableList<Int>>()
            var passcalRows: MutableList<Int> = mutableListOf<Int>()
            var  numRows=numRows+1

            if (numRows > 0) {
                passcalRows.add(1)
                passcal.add(passcalRows)
            }
            if (numRows > 1) {
                passcalRows = mutableListOf<Int>()
                passcalRows.add(1)
                passcalRows.add(1)
                passcal.add(passcalRows)
            }
            for (row in 2..numRows - 1) {
                passcalRows = mutableListOf<Int>()
                passcalRows.add(1)
                for (rowTemp in 1..passcal[passcal.size - 1].size-1)
                {
                    passcalRows.add((passcal[passcal.size - 1][rowTemp-1]+passcal[passcal.size - 1][rowTemp]))
                }
                passcalRows.add(1)
                passcal.add(passcalRows)

            }

            return passcal.get(passcal.size-1)
        }
    }
}