package sorokin.dev;

import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class Task {
    private final String name;
    private final Long duration;

    TaskManager taskManager;

    public Task() {
        this.name = "task";
        this.duration = 60L;
    }

    @Autowired
    public void setTaskManager(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
