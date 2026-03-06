<<<<<<< HEAD
package exception_handling;

public class DB {

    public static void verifier(Student student) throws StudentNotFound {

        if (student == null) {
            throw new StudentNotFound("Student object is null");
        }

        System.out.println("Student Verified Successfully");
        System.out.println(student);
    }
=======
package exception_handling;

public class DB {

    public static void verifier(Student student) throws StudentNotFound {

        if (student == null) {
            throw new StudentNotFound("Student object is null");
        }

        System.out.println("Student Verified Successfully");
        System.out.println(student);
    }
>>>>>>> 6f7087364b89a709ae8ec3ebe8929a4733372ffc
}