package sorokin.dev;

import org.springframework.stereotype.Component;
import sorokin.dev.aop.Loggable;

@Component
public class TaskExecutor {

    private Task task;

    public TaskExecutor(Task task) {
        this.task = task;
    }

    @Loggable("Error")
    public void executeTask() {
       /* System.out.println("Я выполняю задачу " + task.getName()
                + " за время " + task.getDuration());*/
        System.out.printf("Execute task with name %s, total seconds %s%n",
                task.getName(),
                task.getDuration());

    }
}
