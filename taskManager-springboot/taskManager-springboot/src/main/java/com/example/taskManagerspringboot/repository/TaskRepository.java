package com.example.taskManagerspringboot.repository;

import com.example.taskManagerspringboot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import  java.util.List;
public interface TaskRepository extends JpaRepository<Task,Long>{

    List<Task> findByFinished(boolean finished);
    List<Task> findByTitleContaining(String title);
}
