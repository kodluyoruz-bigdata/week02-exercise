object W2{

  def flatter(a:List[List[Any]]) : List[Any]={
    flatterHelper(a,List())
  }

  def flatterHelper(a: List[List[Any]], fa: List[Any]) : List[Any] = {
    a match{
      case Nil => fa
      case h :: r => flatterHelper(r,fa:::h)
    }
  }
}