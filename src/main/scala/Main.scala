object Main {
  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list.foldLeft(Nil: List[T])((acc, e) => if (f(e)) e :: acc else acc).reverse
  }
}
