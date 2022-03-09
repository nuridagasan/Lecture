package Annotations
/**
 * <p>
 * We want to defer the construction of time-consuming objects until we actually
 * need them. We can be lazy and productive at the same time, write less code,
 * and reap all the benefits of lazy initialization.
 * </p>
 * <p>
 * In the next example we want to postpone the creation of the instances of {@code Heavy}
 * until they’re needed. We can directly initialize instances at the point of declaration
 * or we can wrap the logic for creation within a closure.
 * </p>
 * <p>
 * The {@code @Lazy} annotation provides a painless way to implement the virtual proxy
 * pattern with thread safety as a bonus.
 * </p>
 * */

class Heavy {
    def size = 10
    Heavy() { println "Creating Heavy with $size" }
}

class AsNeeded {
    def value
    @Lazy Heavy heavy1 = new Heavy()
    @Lazy Heavy heavy2 = { new Heavy(size: value) }()
    AsNeeded() { println "Created AsNeeded" }
}

def asNeeded = new AsNeeded(value: 1000)
println asNeeded.heavy1.size
println asNeeded.heavy1.size
println asNeeded.heavy2.size