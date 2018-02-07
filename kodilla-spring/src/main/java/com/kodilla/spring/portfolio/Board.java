package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Board {

    @Autowired
    @Qualifier("tasks1")
    private TaskList toDoList;

    @Autowired
    @Qualifier("tasks2")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("tasks3")
    private TaskList doneList;

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void read() {
        System.out.println("Reading: " + toDoList.getTasks()
                + inProgressList.getTasks() + doneList.getTasks());
    }
}
