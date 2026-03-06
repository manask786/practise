<<<<<<< HEAD
package exception_handling;


public class Java {

    public static void execution() {

        Student student = new Student(1, "raja", "raja@gmail.com", 89384343);

        try {
            DB.verifier(student);   // pass student object
        }

        catch (StudentNotFound e) {
            System.out.println(e.getMessage());
        }

    }
=======
package exception_handling;


public class Java {

    public static void execution() {

        Student student = new Student(1, "raja", "raja@gmail.com", 89384343);

        try {
            DB.verifier(student);   // pass student object
        }

        catch (StudentNotFound e) {
            System.out.println(e.getMessage());
        }

    }
>>>>>>> 6f7087364b89a709ae8ec3ebe8929a4733372ffc
}