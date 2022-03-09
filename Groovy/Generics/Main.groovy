package Generics

/*
List<String> list = new ArrayList<String>();
list.add("First String");
list.add("Second String");
list.add("Third String");

for (index in list) {
    println(index)
}
 */

ListType<String> firstList = new ListType<String>()
firstList.setLocalT("My First List")
println(firstList.getLocalT())

ListType<Integer> secondList = new ListType<Integer>()
secondList.setLocalT(1996)
println(secondList.getLocalT())