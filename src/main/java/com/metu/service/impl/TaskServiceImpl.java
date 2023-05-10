package com.metu.service.impl;

import com.metu.dto.TaskDTO;
import com.metu.service.TaskService;

import java.util.List;

public class TaskServiceImpl implements TaskService{

    @Override
    public TaskDTO save(TaskDTO user) {
        //save task

       // return super.save(user.getUserName(),user);
        return null;

    }

    @Override
    public TaskDTO findById(Long username) {
        return null;
    }

    @Override
    public List<TaskDTO> findAll() {
        return null;
    }

    @Override
    public void deleteById(Long username) {

    }

    @Override
    public void update(TaskDTO object) {

    }
}
