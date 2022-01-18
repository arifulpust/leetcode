package jp.co.leetcode.string

import jp.co.leetcode.LeetCode_21_MergeTwoSortedLists
import java.util.ArrayList
import android.R.string
import java.lang.StringBuilder


class LeetCode_383_Ransom_Note {
    companion object
    {
        @JvmStatic
        fun main(args: Array<String>) {


//            while(true) {
//                val input = readLine()!!.trim()
//                println(firstUniqChar(input))
//            }
           // println(firstUniqChar("loveleetcode"))
           // println(firstUniqChar("aabb"))
            println(canConstruct("aa","ab"))


        }
        fun canConstruct(ransomNote: String, magazine: String): Boolean {
            var magazine=magazine
var index:Int=0
for(item in 0..ransomNote.length-1)
{
   if(!magazine.contains(ransomNote[item]))
       return false
    index=magazine.indexOf(ransomNote[item])
    val sb: StringBuilder = StringBuilder(magazine)
    sb.deleteCharAt(index)
    magazine=sb.toString()

}
            return true


        }

    }
}