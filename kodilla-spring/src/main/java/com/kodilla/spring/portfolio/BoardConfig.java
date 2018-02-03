package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean
    public TaskList getTaskList() { return new TaskList(); }

    @Bean(name = "task1")
    @Scope("prototype")
    public TaskList getTaskListOne() {return new TaskList(); }

    @Bean(name = "task2")
    @Scope("prototype")
    public TaskList getTaskListTwo() {return new TaskList(); }

    @Bean(name = "task3")
    @Scope("prototype")
    public TaskList getTaskListThree() {return new TaskList(); }

}
