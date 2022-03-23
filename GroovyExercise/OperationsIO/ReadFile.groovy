package OperationsIO

class ReadFile {

    File file
    ReadFile(String dir) {
        file = new File(dir)
        println("Constructor")

    }

    void byLine() {
        file.eachLine {
            line -> println("line : $line")
        }
    }

    void byText() {
        println(file.text)
    }

    void bySize() {
        println("File Path: ${file.absolutePath} has ${file.length()} bytes.")
    }

    void checkPath() {
        println("File ? ${file.isFile()}")
        println("Directory ? ${file.isDirectory()}")
    }

}
