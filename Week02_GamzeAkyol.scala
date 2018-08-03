def flattener(list: List[Any]): List[Any] = list match {
	case Nil => Nil
	case (h: List[_])::tail => flattener(h):::flattener(tail)
	case h::tail => h::flattener(tail)
}

val x = List(List(1,2,3), List(4,5), List(6, 7, 8))

flattener(x)

