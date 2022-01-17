package jp.co.leetcode
import java.util.*
class LeetCode_21_MergeTwoSortedLists {
    companion object {



//         * var li = ListNode(5)
//         * var v = li.`val`
//         * Definition for singly-linked list.
          class ListNode(var value: Int) {
              var next: ListNode? = null
          }

        @JvmStatic
        fun main(args: Array<String>) {
//var array=mergeTwoLists([11,2],[1,1])
//            for(i in 0.. array.size-1)
//            {
//                print(array[i].toString()+"  ")
//            }
//            println(array.size)
        }

        fun mergeTwoLists(firstList: Array<ListNode>,secondList: Array<ListNode>): ArrayList<ListNode> {
            var total = ArrayList<ListNode>()

            var firstPointer:Int=0
            var secondPointer:Int=0
            var index:Int=0

while(firstPointer<firstList.size||secondPointer<secondList.size)
{
    if(firstPointer>=firstList.size&&secondPointer<secondList.size)
    {
        total[index++].next=secondList[secondPointer++].next
        continue
    }
    if(secondPointer>=secondList.size&&firstPointer<firstList.size)
    {
        total[index++].value=firstList[firstPointer++].value
        continue
    }
  if(firstList[firstPointer].value<=secondList[secondPointer].value)
  {
      total[index++].value=firstList[firstPointer++].value
  }else
  {
      total[index++].value=secondList[secondPointer++].value
  }
}
            return total
        }
    }

}