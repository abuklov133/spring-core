package sorokin.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TaskManager {

    private final Task task;

    @Autowired
    public TaskManager(Task task) {
        this.task = task;
    }


    public Task getTask() {
        return task;
    }

   public void printTask() {
       System.out.println("Current task " + task);
    }

    @PostConstruct
    public void init() {
        System.out.println("Required init taskManager");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Required destroy taskManager");
    }


}
