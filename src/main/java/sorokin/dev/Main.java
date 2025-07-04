package sorokin.dev;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(TaskConfiguration.class);
        Task task = context.getBean(Task.class);
        Task task1 = (Task) context.getBean("task");
        System.out.println(task);
        System.out.println(task1);
        System.out.println(task == task1);
        TaskManager taskManager =
                context.getBean(TaskManager.class);
        System.out.println(taskManager);
    }
}
