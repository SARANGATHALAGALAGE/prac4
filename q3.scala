object Main {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny", toUpper))
    println(formatNames("Niroshan", specific))
    println(formatNames("Saman", toLower))
    println(formatNames("Kumara", specific))
  }
  def toUpper(str: String): String = {
    str.toUpperCase()
  }
  def toLower(str: String): String = {
    str.toLowerCase()
  }
  def formatNames(str: String, func: String => String): String = {
    func(str)
  }
  def specific(name: String): String = {
    print("Enter an index: ")
    var index = scala.io.StdIn.readInt()
    if (index < 0 || index >= name.length()) {
      return "Out of index"
    } else {
      return name.updated(
        index,
        if (name(index).isLower) name(index).toUpper else name(index)
      )
    }
  }
}
