package sorokin.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Configuration
public class TaskConfiguration {
    @Bean("main-task")
    public Task task(@Lazy TaskManager taskManager) {
        return new Task(taskManager);
    }

   /* @Bean("not-main-task")
    public Task task2() {
        return new Task();
    }*/

    @Bean
    public TaskManager taskManager(
            @Qualifier("main-task") Task task
    ) {
        return new TaskManager(task);
    }
}
