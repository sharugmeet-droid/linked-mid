class Node(var data: Int) {
    var next: Node? = null
}

fun findMidpoint(head: Node?): Node? {
    if (head == null) return null

    var slow: Node? = head
    var fast: Node? = head

    while (fast?.next != null && fast.next?.next != null) {
        slow = slow?.next
        fast = fast.next?.next
    }

    return slow
}

// Test
fun main() {
    val head = Node(1)
    head.next = Node(2)
    head.next?.next = Node(3)
    head.next?.next?.next = Node(4)
    head.next?.next?.next?.next = Node(5)

    val mid = findMidpoint(head)
    println("Midpoint: ${mid?.data}") // Output: 3
}
