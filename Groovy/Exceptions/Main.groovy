package Exceptions

/**
 If  we  are  interested  in  catching  all  Exceptions  that  may  be  thrown,  we  can
 simply omit the exception type in the catch statement.
 */
def all_exception() {

    try {
        def x = 5
        //Try to assign a string value into integer variable.
        x = "hey"
    }
    //Assign for all kind of exceptions
    catch(e){
        //Show error message
        println "Oops: ${e.getMessage()}"
    }
}

/**
   If the  exception occurs, it’s not suppressed. Instead, it’s passed to the calling code,
   which can handle it.
*/
def specific_exception() {
    try {
        //Try to read non existent file
        new FileInputStream("NonExistentFileName")
    }
    //Execute only for FileNotFoundException
    catch(FileNotFoundException e) {
        // Do whatever you like about this exception here
        println "Oops: ${e.getMessage()}"
    }

}

//Testing it.
all_exception()
specific_exception()

