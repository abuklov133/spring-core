package sorokin.dev;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;

//@Configuration
public class TaskConfiguration {
 /*   @Bean("main-task")
    @Scope("prototype")*/
   /* public Task task() {
        return new Task();
    }*/

   /* @Bean("not-main-task")
    public Task task2() {
        return new Task();
    }*/

   /* @Bean
    public TaskManager taskManager(
            @Qualifier("main-task") Task task
    ) {
        return new TaskManager(task);
    }

    @Bean
    public TaskExecutor taskExecutor(@Qualifier("main-task") Task task) {
        return new TaskExecutor(task());
    }*/
}
