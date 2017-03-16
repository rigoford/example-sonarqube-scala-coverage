object MathsUtil {
  def fibonacciNumber(i: Int): Int = {
    if (i <= 1) 0
    else if (i == 2) 1
    else fibonacciNumber(i - 1) + fibonacciNumber(i - 2)
  }
}
