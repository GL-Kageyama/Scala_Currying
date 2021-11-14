object Currying extends App {

    // Curried function
    def curriedSum(x: Int)(y: Int): Int = {
        x + y
    }
    def curriedMulti(a: Int)(b: Int)(c: Int)(d: Int)(e: Int): Int = {
        a * b * c * d * e
    }

    // Substitute the required arguments at once
    val plus = curriedSum(1)(2)
    println(plus) // 3

    // Substitute the second argument with (_)
    val onePlus = curriedSum(1)(_)
    val plus2 = onePlus(2)
    println(plus2) // 3

    // Substitute the second argument with _
    val twoPlus = curriedSum(1)_
    val plus3 = twoPlus(2)
    println(plus3) // 3

    // Substitute the multiple arguments at once
    val multi = curriedMulti _
    val resMulti = multi(1)(2)(3)(4)(5)
    println(resMulti) // 120

    // Substitute the multiple arguments in sequence
    val multi2 = curriedMulti _
    val aMulti = multi2(1)
    val bMulti = aMulti(2)
    val cMulti = bMulti(3)
    val dMulti = cMulti(4)
    val resMulti2 = dMulti(5)
    println(resMulti2) // 120

    // Partial application can be reused
    val resMulti3 = dMulti(10)
    println(resMulti3) // 240
}


// =====================================
//         Output Sample
// =====================================
// $ scalac Currying.scala 
// $ scala Currying
// 3
// 3
// 3
// 120
// 120
// 240
