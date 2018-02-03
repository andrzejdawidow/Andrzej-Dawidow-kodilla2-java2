package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

 /*   public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }*/
    @Autowired
    @Qualifier("tasks1")
    public TaskList getToDoList() {
        return toDoList;
    }

    @Autowired
    @Qualifier("tasks2")
    public TaskList getInProgressList() {
        return inProgressList;
    }

    @Autowired
    @Qualifier("tasks3")
    public TaskList getDoneList() {
        return doneList;
    }

    public void read() {
        System.out.println("Reading: " + toDoList.getTasks()
                + inProgressList.getTasks() + doneList.getTasks());
    }

}
