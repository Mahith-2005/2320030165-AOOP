package classroom;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private String name;
    private Map<Assignment, String> submittedAssignments;

    public Student(String name) {
        this.name = name;
        this.submittedAssignments = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void receiveAssignment(Assignment assignment) {
        // Placeholder for receiving assignments
    }

    public void submitAssignment(Assignment assignment, String submission) {
        submittedAssignments.put(assignment, submission);
    }

    public void listSubmittedAssignments() {
        for (Map.Entry<Assignment, String> entry : submittedAssignments.entrySet()) {
            System.out.println("Assignment: " + entry.getKey().getTitle() + ", Submission: " + entry.getValue());
        }
    }
}
