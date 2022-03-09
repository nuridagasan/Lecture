package MetaClasses


Integer.metaClass.percentRaise = {amount -> amount * (1 + delegate/100)}
println(5.percentRaise(200))

String.metaClass.isPalindrome = {
    delegate == delegate.reverse()
}

first_word = 'kabak'
println "$first_word is Palindrome ? ${first_word.isPalindrome()}"
second_word = 'here'
println "$second_word is Palindrome ? ${second_word.isPalindrome()}"

lst = ['Groovy', 'is', 'hip']
println lst.join(' ')
println lst.class