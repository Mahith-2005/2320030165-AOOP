package classroom;

public class Main {
    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler();
        
        Classroom classroom = new Classroom("Java Programming");
        scheduler.scheduleClass(classroom, "2024-08-20 10:00");

        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        classroom.addStudent(student1);
        classroom.addStudent(student2);

        System.out.println("Scheduled Classes:");
        scheduler.listScheduledClasses();

        System.out.println("\nClassroom Students:");
        classroom.listStudents();

        Assignment assignment = new Assignment("Java Basics", "Complete the basics of Java.");
        classroom.assignAssignment(assignment);

        student1.submitAssignment(assignment, "Completed the basics.");

        System.out.println("\nAssignments Submitted:");
        student1.listSubmittedAssignments();
    }
}
