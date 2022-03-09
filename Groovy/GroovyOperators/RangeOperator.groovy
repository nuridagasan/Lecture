package GroovyOperators
/**
 * Groovy supports the concept of ranges and provides a notation of range operators
 * with the help of the .. notation. A simple example of the range operator is given below.
 ********************
 * def range = 0..5 *
 ********************
 * This just defines a simple range of integers, stored into a local variable
 * called range with a lower bound of 0 and an upper bound of 5.
 * The following code snippet shows how the various operators can be used.
 */

IntRange range = 5..10
println("Range: $range")
println("Size : ${range.size()}")
println("Get Third Element: ${range.get(2)}")