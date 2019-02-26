import linkedlist.adt.Stack

object StackTest extends App {
  val testStack = new Stack[Int]

  testStack.push(1)
  testStack.push(2)
  testStack.push(3)
  testStack.printStack()

  println()

  testStack.pop()
  testStack.printStack()

  println()

  testStack.pop()
  testStack.printStack()

  println()

}
