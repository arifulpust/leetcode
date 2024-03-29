package jp.co.leetcode.string

import jp.co.leetcode.LeetCode_21_MergeTwoSortedLists
import java.util.ArrayList
import android.R.string
import java.lang.StringBuilder


class LeetCode_387_First_Unique_Character_in_String {
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
        fun firstUniqChar(s: String): Int {

            var indexMap: HashMap<Char, Int> = HashMap<Char, Int>()
            var occurs: HashMap<Char, Int> = HashMap<Char, Int>()
            val list = mutableListOf<Char>()

            for(i in 0..s.length-1)
            {
                if(indexMap.containsKey(s[i]))
                {
                    occurs.put(s[i],0)
                }else
                {
                    indexMap.put(s[i],(i))
                    occurs.put(s[i],1)
                    list.add(s[i])
                }

            }
            for(i in 0..list.size-1)
            {
                if(occurs.get(list.get(i))==1)
                {
                 return indexMap.get(list.get(i))!!
                }

            }


      return -1


        }
    }
}