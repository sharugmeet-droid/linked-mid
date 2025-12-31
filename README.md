# 🔹 Linked List Midpoint – Kotlin

This Kotlin implementation finds the **midpoint of a singly linked list** using the **two-pointer technique**.  

It efficiently determines the middle node in a **single traversal** without using counters or calculating the size of the list.

---

## 🧠 Approach

### Two-Pointer Technique
- **Slow pointer** moves **1 node at a time**  
- **Fast pointer** moves **2 nodes at a time**  
- When the **fast pointer reaches the end**, the **slow pointer is at the midpoint**.

This method works for both **even and odd length lists**.

---

## 🧩 Implementation

### Node Class
```kotlin
class Node(var data: Int) {
    var next: Node? = null
}
