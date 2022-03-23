package OOP
/**********************************************************************************
 Groovy gives us the flexibility to initialize a JavaBean class. When constructing
 an object, simply give values for properties as comma-separated name-value
 pairs. This is a post-construction operation if our class has a no-argument
 constructor. We can also design our methods so they can take named arguments.
 **********************************************************************************/
def person = new Person(name:"Nuri",age: 25,height: 5.7)

person.accessArea(true,N:52.62,E:1.29,"Norwich")
person.accessArea(false,"London",N:51.50,W:0.12)