package sorokin.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class TaskManager {
   // @Autowired
    private Task task;

   /* @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }*/

    public TaskManager() {
    }

    public Task getTask() {
        return task;
    }

    @Autowired
    public void setTask(Task task) {
        this.task = task;
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
