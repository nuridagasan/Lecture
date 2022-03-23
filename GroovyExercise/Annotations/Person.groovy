package Annotations
import groovy.transform.*

/**
 * Using @Canonical
 * If we find ourselves writing a toString() method that simply displays select fields
 * values as comma-separated, we can let the Groovy compiler work for us by
 * using the @Canonical transformation. By default it includes all the fields;
 * however, we can ask it to include certain fields and exclude others
 * name and surname are excluded with {@code @Canonical}
   **/
@Canonical(excludes='name, surname')
class Person {
    def name
    def surname
    def age
}
