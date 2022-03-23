package Annotations

class Version {
    int number
    String result = ""

    @OnlyIf({number <= 6})
    void Version6() {
        result << 'Number less than 6'
        println("HERE: ${number}")
        println(result)
    }

    @OnlyIf({number > 6})
    void Version7() {
        result << 'Number greater than 6'
    }

}
