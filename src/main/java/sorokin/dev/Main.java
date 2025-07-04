package sorokin.dev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskConfiguration.class);
        Task mainTask = (Task) context.getBean("main-task");
        Task notMainTask = (Task) context.getBean("not-main-task");
        TaskManager taskManager =
                (TaskManager) context.getBean("taskManager");
        System.out.println(taskManager);
    }
}
