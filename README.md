# Scala Currying

## Currying
A function that has multiple parameter lists.  

## Sample
```Scala
    // Curried function
    def curriedSum(x: Int)(y: Int): Int = {
        x + y
    }
    
    // Substitute the required arguments at once
    val plus = curriedSum(1)(2)
    println(plus) // 3

    // Substitute the second argument with (_)
    val onePlus = curriedSum(1)(_)
    val plus2 = onePlus(2)
    println(plus2) // 3
```
