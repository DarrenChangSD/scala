import linkedlist.adt.SinglyLinkedList

object SinglyLinkedListTest extends App {

  val testList = new SinglyLinkedList[Int]

  testList.insert(0, 1)
  testList.insert(1, 2)
  testList.insert(2, 3)
  testList.printList()

  println()

  testList.update(0, 4)
  testList.printList()

  println()

  testList.remove(0)
  testList.printList()

  println()

  testList.insert(0, 1)
  testList.printList()

  println()

  testList.insert(2, 5)
  testList.printList()

  println()
}
