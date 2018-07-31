object Reverse{
	// import scala.collection.immutable.List
	def reverse(list: List[Int]): List[Int] = list match{
		case Nil=>list
		case head::tail => reverse(tail):::List(head)
	}

	def main(args: Array[String]){
		println(reverse(List(3,4,5)))
	}
}