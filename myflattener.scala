val mylist1 = List(List(1,2,3), List(4,5))

def myflattener(mylist : List[List[Int]]) : List[Int] = {
  mylist match {
    case a :: t => myflathelp(a) ::: myflattener(t)
    case Nil => List()
  }
}

def myflathelp(mylist: List[Int]): List[Int] = {
  mylist match {
    case h :: t => h :: myflathelp(t)
    case Nil => List()
  }
}
