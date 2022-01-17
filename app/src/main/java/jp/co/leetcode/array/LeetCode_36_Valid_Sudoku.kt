package jp.co.leetcode.array

import jp.co.leetcode.LeetCode_21_MergeTwoSortedLists
import java.util.ArrayList

class LeetCode_36_Valid_Sudoku {
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>) {
            val seen = HashSet<String>()
            print(seen.add("1").toString())

            seen.add("1")
            print(seen.add("1"))

            //  println(isValidSudoku(arrayOf(intArrayOf(1,2),intArrayOf(3,4)),1,4))
        }
        fun isValidSudoku(board: Array<CharArray>): Boolean {
            val seen = HashSet<String>()

            var isFound:Boolean=false
            for(i in 0..8)
            {
                for(j in 0..8)
                {
                    if(board[i][j]!='.')
                    {
                        var currentVal=board[i][j]
                        if(     !seen.add(currentVal+"r_"+i)||
                            !seen.add(currentVal+"c_"+j)||
                            !   seen.add(currentVal+"rc_"+i/3+"-"+j/3))
                        {
                            return false
                        }


                    }
                }
            }
            return true

        }
    }
}