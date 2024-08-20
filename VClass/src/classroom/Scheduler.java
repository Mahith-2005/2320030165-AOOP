package classroom;

import java.util.HashMap;
import java.util.Map;

public class Scheduler {
    private Map<Classroom, String> schedule;

    public Scheduler() {
        this.schedule = new HashMap<>();
    }

    public void scheduleClass(Classroom classroom, String dateTime) {
        schedule.put(classroom, dateTime);
    }

    public void listScheduledClasses() {
        for (Map.Entry<Classroom, String> entry : schedule.entrySet()) {
            System.out.println("Classroom: " + entry.getKey().getName() + ", Scheduled at: " + entry.getValue());
        }
    }
}
