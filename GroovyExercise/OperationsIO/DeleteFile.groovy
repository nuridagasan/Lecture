package OperationsIO

class DeleteFile {
    String dir
    File file

    DeleteFile(String dir){
        this.dir = dir
        file = new File(dir)
    }

    void delete() {
        file.delete()
    }

}
