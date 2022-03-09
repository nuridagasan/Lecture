package OperationsIO

import java.lang.reflect.Type

class WriteFile {
    String dir
    File file
    WriteFile(String dir) {
        this.dir = dir
        file = new File(dir)
    }

    void writeFileByLine(String input){
        file.withWriter('utf-8'){
            writer -> writer.writeLine(input)
        }
    }

    void copy(File copyContent) {
        copyContent << file.text
    }


}
