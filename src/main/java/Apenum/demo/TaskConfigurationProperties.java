package Apenum.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "task")
public class TaskConfigurationProperties {
    private TemplateProperties template = new TemplateProperties();

    public TemplateProperties getTemplate() {
        return template;
    }

    public void setTemplate(TemplateProperties template) {
        this.template = template;
    }

    public static class TemplateProperties {
        private boolean allowMultipleTasksFromTemplate;

        public boolean isAllowMultipleTasksFromTemplate() {
            return allowMultipleTasksFromTemplate;
        }

        public void setAllowMultipleTasksFromTemplate(boolean allowMultipleTasksFromTemplate) {
            this.allowMultipleTasksFromTemplate = allowMultipleTasksFromTemplate;
        }
    }
}
