//P1 - Find the last element of a list.
def last[T](list: List[T]): T = {
  list.last
}

//P2 - Find the last but one element of a list.
def penultimate[T](list: List[T]): T = {
  list.takeRight(2).head
}

//P3 - Find the kth element in a list.
def nth[T](n: Int, list: List[T]): T = {
  list.apply(n)
}

//P4 - Find the number of elements in a list.
def length[T](list: List[T]): Int = {
  list.size
}

//P5 - Reverse a list.
def reverse[T](list: List[T]): List[T] = {
  list.reverse
}

//P6 - Find out whether or not a list is a palindrome
def isPalindrome[T](list: List[T]): Boolean = {
  (list == list.reverse)
}

//P7 - Flatten a nested structure.
def flatten(list: List[Any]): List[Any] = list flatMap {
  case i: List[_] => flatten(i)
  case e => List(e)
}

//P8 - Eliminate consecutive duplicates of list elements.
def compress[A](list: List[A]): List[A] =
  list.foldLeft(List[A]()) { (list, foldVal) =>
    if (list.isEmpty || list.head != foldVal) foldVal :: list
    else list
  }

//P9 - Pack consecutive duplicates of list elements into sublists.
def pack[A](list: List[A]): List[List[A]] = {
  if(list.isEmpty) List(List())
  else {

  }
}


//for testing:
pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))