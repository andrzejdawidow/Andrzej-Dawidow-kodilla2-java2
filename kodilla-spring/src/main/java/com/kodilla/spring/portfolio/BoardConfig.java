package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {

    @Bean(name = "tasks1")
    @Scope("prototype")
    public TaskList getTaskListOne() {
    TaskList t1 = new TaskList();
    t1.addTask("washing");
    return t1;}

    @Bean(name = "tasks2")
    @Scope("prototype")
    public TaskList getTaskListTwo() {
        TaskList t2 = new TaskList();
        t2.addTask("cleaning");
        t2.addTask("vacuuming");
        return t2;}

    @Bean(name = "tasks3")
    @Scope("prototype")
    public TaskList getTaskListThree() {
        TaskList t3 = new TaskList();
        t3.addTask("ironing");
        t3.addTask("shopping");
        t3.addTask("mowing the grass");
        return t3;}

}
