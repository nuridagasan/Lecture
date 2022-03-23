package GroovyOperators

/**
 * To add an element to a collection, we can use the << operator, which translates
 * to the Groovy-added leftShift() method on Collection.
 */

def list = ['Hello']
println "Before: $list"
list << 'World'
println "After: $list"