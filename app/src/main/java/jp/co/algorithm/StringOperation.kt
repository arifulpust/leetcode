package jp.co.algorithm

import java.util.*

class StringOperation {

    companion object {

//LeetCode_383_Ransom_Note
        @JvmStatic
        fun main(args: Array<String>) {
            // print
           // print(isAnagram("anagram","nagaram"))
          print(wordPattern("aaa","dog dog dog dog"))
        }
        //290. Word Pattern
        fun wordPattern(pattern: String, s: String): Boolean {
            val words = s.trim().split("\\s+".toRegex())
            var savedMap: HashMap<Char, String> = HashMap<Char, String>()
            if(words.size!=pattern.length)
                return false
           for(index in 0..pattern.length-1 )
            {
            if(savedMap.containsKey(pattern[index]))
             {
                 if(words.get(index)!=savedMap.get(pattern[index]))
                     return false

             }
                else
             {
                 if(savedMap.containsValue(words[index]))
                     return false
                 savedMap.put(pattern[index],words[index])
             }
            }
            return true
        }
        //242. Valid Anagram
        fun isAnagram(s: String, t: String): Boolean {
            var arr = s.toCharArray()
            var s=arr.sorted().joinToString("")
            arr = t.toCharArray()
            var t=arr.sorted().joinToString("")
            if(s.equals(t))
            {
                return true
            }
            else return false
        }
        fun Sort()
        {
            var arr = intArrayOf()
            arr.sort()

        }
        fun listToInArray()
        {
            val list = mutableListOf<Int>()
            var arr = intArrayOf()
            arr=list.toIntArray()


        }
        fun occuarance( haystack:IntArray,needle:Int)
        {
            var occurance=haystack.indexOf(needle)
        }
        fun StackOperation()
        {
            val stack = Stack<Char>()
            stack.push('s')
            var top = stack.peek()
            stack.pop()


        }
    }

}