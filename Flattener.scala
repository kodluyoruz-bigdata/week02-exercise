object Flatter{
	def main(args:Array[String]){
		var list = List(List(1,2,3), List(4,5))

		println(s"${flattenList(list)}")
	}

	def flattenList(list:List[_]): List[_] = {
		list match{
			case Nil => Nil
			case (head:List[_])::tail => flattenList(head) ::: flattenList(tail) // ::: this operation concatanes two lists 
			case head::tail => head :: flattenList(tail) // :: this operation concatanes one primitive element to a list
			// primitiveType::List[_] format should be like this
		}
	}
}