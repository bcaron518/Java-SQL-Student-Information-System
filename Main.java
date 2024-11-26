public class Main {
    public static void main(String[] args) {
        // Add a student
        StudentDAO.addStudent("John", "Doe", "2000-01-01", "john.doe@example.com");

        // Read student info
        StudentDAO.getStudent(1);

        // Update student info
        StudentDAO.updateStudent(1, "john.newemail@example.com");

        // Delete student
        StudentDAO.deleteStudent(1);
    }
}
