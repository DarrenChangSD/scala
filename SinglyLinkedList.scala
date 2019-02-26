package linkedlist.adt

class SinglyLinkedList[T] {
  private class Node(var data: T, var next: Node)
  private var head: Node = null

  /**
    * peek method is used to get the value at a specific index.
    * @param index the index to look at
    * @return the value at index
   */
  def peek(index: Int): T = {
    assert(index >= 0)

    var traver = head

    for(i <- 0 until index) {
      traver = traver.next
    }

    traver.data
  }

  /**
    * update method is used to set the value at a specific index.
    * @param index the index to change the value
    * @param data the value to store the index at
    */
  def update(index: Int, data: T): Unit = {
    assert(index >= 0)

    var traver = head

    for(i <- 0 until index){
      traver = traver.next
    }

    traver.data = data
  }

  /**
    * insert method is used to insert a NEW value at a particular index.
    * @param index the index to place the new value
    * @param data the value to be inserted
    */
  def insert(index: Int, data: T): Unit = {
    assert(index >= 0)

    if(index == 0) {
      head = new Node(data, head)
    } else {
      var traver = head
      for(i <- 0 until index - 1) {
        traver = traver.next
      }
      traver.next = new Node(data, traver.next)
    }
  }

  /**
    * remove method is used to remove a particular index from the list.
    * @param index the index to be removed
    * @return the data value that was stored at that index
    */
  def remove(index: Int): T = {
    assert(index >= 0)

    if(index == 0) {
      val ret = head.data
      head = head.next
      ret
    } else {
      var traver = head
      for (i <- 0 until index - 1) {
        traver = traver.next
      }
      val ret = traver.next.data
      traver.next = traver.next.next
      ret
    }
  }

  /**
    * printList method is used to print all the elements in the LL
    */
  def printList(): Unit = {
    var traver = head
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
