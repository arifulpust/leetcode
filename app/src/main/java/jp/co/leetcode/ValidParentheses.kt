package jp.co.leetcode

import java.util.*

class ValidParentheses {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(isValid(")()[]{}"))
        }

        fun isValid(s: String): Boolean {
            val stack = Stack<Char>()
            var isValid: Boolean = true
            for (i in 0..s.length - 1) {
                if (s[i] == '(' || s[i] == '{' || s[i] == '[') {
                    stack.push(s[i])

                } else {
                    if (stack.size == 0) {
                        isValid = false
                        break
                    }
                    var top = stack.peek()
                    if (top == '(' && s[i] == ')' || top == '{' && s[i] == '}' || top == '[' && s[i] == ']') {
                        stack.pop()
                    } else {
                        isValid = false
                        break
                    }
                }


            }
            if (isValid && stack.empty()) {
                return true
            } else
                return false
        }


    }

}