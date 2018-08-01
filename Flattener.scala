package onr

object Flattener extends App{

  def flattener(list: List[_]): List[_] = {
      flatHelp(list,List())
  }

  def flatHelp(list: List[_], accList: List[_]): List[_] = {
    list match {
      case List() => accList
      case (h :: s) :: t => flatHelp(t, accList ::: (h :: s));
      case h :: t =>
        if(h == Nil)
          flatHelp(t, accList)
        else
          flatHelp(t , accList ::: List(h))
    }
  }

}
