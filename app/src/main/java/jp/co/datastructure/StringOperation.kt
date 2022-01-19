package jp.co.datastructure

import java.util.*

class StringOperation {

    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            // print
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