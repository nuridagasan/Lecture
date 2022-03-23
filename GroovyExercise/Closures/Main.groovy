package Closures

/**
 * A closure is a short anonymous block of code. It just normally spans a few lines of code.
 * A method can even take the block of code as a parameter.
 * They are anonymous in nature.
 * */

// Following is an example of a simple closure and what it looks like.
def closure = {println("CLOSURE IS HERE!")}
closure.call()

/**
 * In the above example, the code line - {println "Hello World"} is known as a closure.
 * The code block referenced by this identifier can be executed with the call statement.
 * When we run the above program, we will get the following result:
 *   ********************
 *   * CLOSURE IS HERE! *
 *   ********************
 */

/**
 * FORMAL PARAMETERS IN CLOSURES
 * Closures can also contain formal parameters to make them more useful just like
 * methods in Groovy.
 */

//Two different types of closure syntax
def first_closure = (param, first) -> println "Hello ${param}, ${first}"
first_closure("First","Syntax")
first_closure.call("First","Syntax")

def second_closure  = {param, second->println "Hello ${param}, ${second}"};
second_closure("Second","Syntax")
second_closure.call("Second","Syntax")

// The next illustration repeats the previous example and produces the same result.
// However, shows that an implicit single parameter referred to as it can be used.
// Here ‘it’ is a keyword in Groovy.
def it_closure = {println "Hello ${it}"}
it_closure("Nuri!")

//Using Closures with Lists
def list = [11, 12, 13, 14]
list.each {println "${it}"}

//Using Closures with Maps
def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"]
mp.each {println it}
mp.each {println "${it.key} maps to: ${it.value}"}

//Using Closures with ArrayList and Conditionals
def lst = [1,2,3,4];
lst.each {println it}
println("The list will only display those numbers which are divisible by 2")
lst.each{ if(it % 2 == 0) println it}
