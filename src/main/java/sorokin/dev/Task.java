package sorokin.dev;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.ThreadLocalRandom;

@Component("main-task")
//@Scope("prototype")
public class Task {
    private final String name;
    private final Long duration;

    public Task() {
        this.name = "task";
        this.duration = 60L;
        System.out.println("Coll task constructor");
    }


    public String getName() {
        return name;
    }

    public Long getDuration() {
        return duration;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Required Task postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Required Task preDestroy");
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                '}';
    }
}
