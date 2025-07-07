package sorokin.dev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("sorokin.dev");
        Task task = context.getBean(Task.class);
        Task task1 = context.getBean(Task.class);
        TaskManager taskManager = context.getBean(TaskManager.class);
        taskManager.printTask();
        TaskExecutor taskExecutor = context.getBean(TaskExecutor.class);
        taskExecutor.executeTask();
    }
}
