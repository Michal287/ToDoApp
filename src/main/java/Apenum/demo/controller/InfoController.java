package Apenum.demo.controller;

import Apenum.demo.TaskConfigurationProperties;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InfoController {
    private final DataSourceProperties dataSource;
    private final TaskConfigurationProperties taskProperties;

    InfoController(DataSourceProperties dataSource, TaskConfigurationProperties taskProperties) {
        this.dataSource = dataSource;
        this.taskProperties = taskProperties;
    }

    @GetMapping("/info/url")
    String url() {
        return dataSource.getUrl();
    }

    @GetMapping("/info/prop")
    boolean myProp() {
        return taskProperties.getTemplate().isAllowMultipleTasksFromTemplate();
    }
}
