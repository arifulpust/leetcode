package jp.co.algorithm



class LinkListOperation {

    companion object
    {
        @JvmStatic
        fun main(args: Array<String>) {
print(hasCycle( ListNode(3)))
print(hasCycle( ListNode(2)))
print(hasCycle( ListNode(0)))
print(hasCycle( ListNode(0)))
        }
        fun hasCycle(head: ListNode?): Boolean {
            var current = head
            val visited = mutableListOf<ListNode>()
            while (current != null) {
                visited.add(current)
                if (current?.next in visited) return true
                current = current?.next
            }
            return false
        }

         class ListNode(var value: Int) {
            var next: ListNode? = null
        }
    }
}