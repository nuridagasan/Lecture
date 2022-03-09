package Annotations
/**
 * Annotations are a form of metadata wherein they provide data about a program that is not part of the program itself.
 * Annotations have no direct effect on the operation of the code they annotate.
 * Annotations are mainly used for the following reasons −
 * Information for the compiler − Annotations can be used by the compiler to detect errors or suppress warnings.
 * Compile-time and deployment-time processing − Software tools can process annotation information to generate code,
   XML files, and so forth.
 * Runtime processing − Some annotations are available to be examined at runtime.
 * In Groovy, a basic annotation looks as follows −
 * @interface - The at sign character (@) indicates to the compiler that what follows is an annotation.
 * An annotation may define members in the form of methods without bodies and an optional default value.
 */
def version = new Version(number:12)
version.Version6()


def person = new Person(name: "Nuri", surname: "Dagasan", age: 25)
println person

