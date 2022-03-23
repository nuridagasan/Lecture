package Loops
/**
 * It shows different ways of iteration
 */

//Start from 0 up to 3. 3 is included.
println "Loop by using upto(range)"
0.upto(3){println(it)}

//iterate 3 times. 4 is excluded.
println "Loop by using times"
4.times{println("$it")}

//iterate from 0 to 8 with step of 2. 10 is excluded.
println "Loop by using step(range, step)"
0.step(10,2) {println "$it"}

//iterate letters from a to c
println "Loop by using classic for syntax"
for(ch = 'a'; ch < 'd'; ch++) {
    println ch
}

//You can iterate from a to c by using range operator
/**
 * You can see below script to understand more about range operator
 * @see GroovyOperators.RangeOperator
 */

println "Loop by using for-each syntax"
for (ch in 'a'..'c') {
    println ch
}

