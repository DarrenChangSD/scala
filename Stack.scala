package linkedlist.adt

class Stack[T] {
  private case class Node(data: T, next: Node)
  private var top: Node = null

  def push(obj: T): Unit = {
    top = Node(obj, top)
  }

  def pop() : T = {
    assert(!isEmpty)
    val ret = top.data
    top = top.next
    ret
  }

  def peek(): T = {
    top.data
  }

  def isEmpty(): Boolean = {
    top == null
  }

  def printStack(): Unit = {
    var traver = top
    print("[")
    while(traver != null) {
      if(traver.next == null) {
        print(traver.data)
      } else {
        print(traver.data + ", ")
      }
      traver = traver.next
    }
    print("]")
  }

}
