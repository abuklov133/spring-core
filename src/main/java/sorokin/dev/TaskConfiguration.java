package sorokin.dev;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
public class TaskConfiguration {
    @Bean
    public Task task() {
        return new Task();
    }

    @Bean
    public TaskManager taskManager() {
        return new TaskManager();
    }
}
