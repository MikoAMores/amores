package Activity3;


public class schmng {
    public static void main(String[]argfs) {
        Student student = new Student("Miko Amores", 4223, "College");
        Teacher teacher = new Teacher("MARY SHEESH", 3221, "Philosophy");
        Staff staff = new Staff("JOHN", 2313, "Admin");

        System.out.println("Student Information: ");
        student.displayInfo();

        System.out.println("\nTeacher Information: ");
        teacher.displayInfo();

        System.out.println("\nStaff Information: ");
        staff.displayInfo();
    }
}