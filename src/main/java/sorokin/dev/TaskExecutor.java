package sorokin.dev;

import org.springframework.stereotype.Component;

@Component
public class TaskExecutor {

    private Task task;

    public TaskExecutor(Task task) {
        this.task = task;
    }

    public void executeTask() {
       /* System.out.println("Я выполняю задачу " + task.getName()
                + " за время " + task.getDuration());*/
        System.out.printf("Execute task with name %s, total seconds %s%n",
                task.getName(),
                task.getDuration());

    }
}
