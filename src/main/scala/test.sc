/*val points: List[Int] = List(1,3)
val chr1: List[Char] = List('x', 'x', 'x', 'x', 'x')
val chr2: List[Char] = List('y', 'y', 'y', 'y', 'y')*/

val points: List[Int] = List(2,4,5)
val chr1: List[Char] = List('a', 'a', 'a', 'a', 'a', 'a', 'a')
val chr2: List[Char] = List('d', 'd', 'd', 'd', 'd', 'd', 'd')

def crossinghover(list1: List[Char]
                  , list2: List[Char]
                  , points: List[Int])
                  : (List[Char], List[Char])
                  = points match {
    case p::rest => {
      val list1New: List[Char] = list1.take(p) ++ list2.takeRight(list2.length - p)
      val list2New: List[Char] = list2.take(p) ++ list1.takeRight(list2.length - p)
      crossinghover(list1New, list2New, rest)
    }
    case Nil => (list1, list2)
}

val res = crossinghover(chr1, chr2, points)

def printRes(list: List[Char]) = {
  for(c <- list)
    print(c)
  print("\r\n")
}

printRes(res._1)
printRes(res._2)





