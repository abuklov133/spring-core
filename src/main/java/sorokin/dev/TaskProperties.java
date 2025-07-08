package sorokin.dev;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Component
public class TaskProperties {
    @Value("${task.name}")
    private String name;
    @Value("${task.duration}")
    private Integer duration;

    @Value("#{'${list.values}'.split(',')}")
    private List<String> listValues;
    @Value("#{'${set.values}'.split(',')}")
    private Set<String> setValues;

    @Value("#{${map.values}}")
    Map<String, Integer> mapValue;

    @Override
    public String toString() {
        return "TaskProperties{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", listValues=" + listValues +
                ", setValues=" + setValues +
                ", mapValues=" + mapValue +
                '}';
    }
}
