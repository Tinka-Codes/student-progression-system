public class Main {
    public static void main(String[] args) {

        // Create a student
        Student student = new Student("Faith", "returning", 1);

        // Add modules
        student.addModule(new Module("Math", 1, true));
        student.addModule(new Module("Programming", 1, true));
        student.addModule(new Module("Data Structures", 1, false));

        // Display student info
        System.out.println("Student: " + student.getName());
        System.out.println("Type: " + student.getType());
        System.out.println("Level: " + student.getLevel());

        System.out.println("\nModules:");
        for (Module m : student.getModules()) {
            System.out.println(m.getName() + " - Passed: " + m.isPassed());
        }
    }
}