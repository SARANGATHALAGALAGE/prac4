object Main {
  def main(args: Array[String]): Unit = {
    print("Enter the Number : ")
    var number: Int = scala.io.StdIn.readInt()
    print("That number is ")
    PatternMatching(number)
  }
  def PatternMatching(num: Int): Unit = {
    if (num <= 0) {
      print("Negative / Zero")
    } else if (num % 2 == 0) {
      print("Even number")
    } else if (num % 2 != 0) {
      print("Odd number")
    }
  }
}
