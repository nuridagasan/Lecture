package Annotations

/**
 * Delegate works very similar to inheritance. Delegation can be better than inheritance
 * from pure code-reuse point of view.
 * To better understand delegation, {@code Worker} class with a few methods is created.
 * */

class Worker {
    def work() { println 'get work done' }
    def analyze() { println 'analyze...' }
    def writeReport() { println 'get report written' }
}
/**
 * {@code Expert} class has one method with the same name and signature as the {@code Worker} class.
 * */
class Expert {
    /**
     * It brings in the {@code analyze} method of the Expert since at compile time, Groovy examines the Manager
     * and brings in methods from the delegated classes  only  if those methods don’t already exist.
     * */
    def analyze() { println "expert analysis..." }
}
/**
 * {@code Manager} class delegates work, so the two fields are marked with the {@code @Delegate} annotation
 * It is very similar to inheritance:
 * <blockquote><pre>{@code
 class Manager extends Worker {
 }
 class Manager extends Expert {
 }
 }</pre></blockquote>
 * The Manager class is extensible thanks to the {@code @Delegate} annotation. If we add
 * or remove methods to the {@code Worker} or the {@code Expert} class, we don’t have to make any
 * changes  to {@code Manager} for the corresponding change to take effect. Simply
 * recompile the code, and Groovy takes care of the rest.
 * */
class Manager {
    @Delegate Expert expert = new Expert()
    @Delegate Worker worker = new Worker()
}

def bernie = new Manager()

bernie.analyze()
bernie.work()
bernie.writeReport()
