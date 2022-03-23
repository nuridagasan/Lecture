package Conditionals

/***********************************************************************************
 * Groovy has the safe navigation operator (?.).
 * It eliminates the mundane check for null.
 * *********************************************************************************/

def reverseString(str) {
    //if (str != null) { str.reverse() }
    str? str.reverse() : "String is Null"
}

println reverseString("Nuri")
println reverseString(null)