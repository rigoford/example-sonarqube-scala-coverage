import org.scalatest.FlatSpec

class MathsUtilSpec extends FlatSpec {

  "A Fibonacci" should "have a 3rd number 1" in {
    val expected = 1
    val actual: Int = MathsUtil.fibonacciNumber(3)

    assert(actual == expected)
  }

  it should "have a 7th number of 8" in {
    val expected = 8
    val actual: Int = MathsUtil.fibonacciNumber(7)

    assert(actual == expected)
  }

  it should "have a 9th number of 21" in {
    val expected = 21
    val actual: Int = MathsUtil.fibonacciNumber(9)

    assert(actual == expected)
  }
}
