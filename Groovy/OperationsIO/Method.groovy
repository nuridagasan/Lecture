package OperationsIO
import org.codehaus.groovy.runtime.StackTraceUtils

class Method {
    static def getName() {
        def marker = new Throwable()
        return StackTraceUtils.sanitize(marker).stackTrace[1].methodName
    }
}
