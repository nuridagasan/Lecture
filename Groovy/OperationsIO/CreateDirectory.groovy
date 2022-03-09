package OperationsIO

class CreateDirectory {
    String dir
    File file

    CreateDirectory(String dir) {
        this.dir = dir
        file = new File(dir)

    }

    void newDirectory() {
        file.mkdir()
    }

}
