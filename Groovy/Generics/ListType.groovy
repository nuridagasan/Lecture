package Generics

class ListType<T>{
    private T localT

    T getLocalT() {
        println(localT.class)
        return this.localT
    }

    T setLocalT(T localT) {
        this.localT = localT
    }

}
