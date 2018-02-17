package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList("ToDo", "washing car");
        taskListDao.save(taskList);
        int id = taskList.getId();
        //When
        List<TaskList> readTaskList = taskListDao.findByListName("ToDo");
        //Then
        Assert.assertEquals(1, readTaskList.size());
        Assert.assertEquals("ToDo", taskList.getListName());
        //CleanUp
        taskListDao.delete(id);
    }
}
