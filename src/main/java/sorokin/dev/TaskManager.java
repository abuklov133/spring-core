package sorokin.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class TaskManager {

    private final Task task;

    //@Autowired
    public TaskManager(Task task) {
        this.task = task;
    }


    public Task getTask() {
        return task;
    }


    public void printTask() {
        System.out.println("Current task " + task.toString());
    }

    @Override
    public String toString() {
        return "TaskManager{" +
                "task=" + task +
                '}';
    }
}
