package OperationsIO

/**
 * READ FILE
 * */
//Assign File Locations
String dirFileRead  = ".\\foo_read.txt"
//Read File Operations
ReadFile readFile = new ReadFile(dirFileRead)
readFile.byLine()
readFile.byText()
//Getting the Size of a File
readFile.bySize()
//Testing if a path is a file or a directory
readFile.checkPath()

/**
 * WRITE FILE
 * */
//Assign a file location to write
String originalFileDir = ".\\original_content.txt"
//Write File Operations
WriteFile originalContent = new WriteFile(originalFileDir)
originalContent.writeFileByLine("THIS IS MY INPUT")
readFile.byText()
//Assign an address for copy content
String copyFileDir = ".\\copy_content.txt"
//Copy the contents from one file to another
originalContent.copy(new File(copyFileDir))

/**
 * CREATE DIRECTORY
 * */
//Assign a directory path for directory creation
String dirPath  = "..\\NewDirectory"
//Create a directory
CreateDirectory directory = new CreateDirectory(dirPath)
directory.newDirectory()

/**
 * DELETE FILE
 * */
//Assign a file directory
String deleteFileDir = ".\\noob.txt"
//Delete a file if it exists
DeleteFile deleteFile = new DeleteFile(deleteFileDir)
deleteFile.delete()


