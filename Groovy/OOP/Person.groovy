package OOP
/**
 * If the person class is instantiated as variable and key value pairs. Then, it is not no longer needed
 * to create a constructor in Person.groovy class. Groovy automatically understands.
 * @see MainScript
 */
class Person {
    def name, height, age
    /**
     * This method prints person's information related with the area of residence.
     * @param coordinate a map for latitude and longitude for current position
     * @param isHere a boolean variable that holds whether location is still occupied by person or not
     * @param city a string variable assigns person's city.
     * @return void
     */
    def accessArea(Map coordinate, isHere, city) {
        println "${name} (${age}) is currently living in ${city}, ${coordinate} ? ${isHere}"
    }
}
