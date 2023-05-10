package com.metu.service.impl;

import com.metu.dto.TaskDTO;
import com.metu.service.TaskService;

import java.util.List;

public class TaskServiceImpl extends AbstractMapService<TaskDTO,Long> implements TaskService{

    @Override
    public TaskDTO save(TaskDTO task) {
        //save task
        return super.save(task.getId(),task);

    }

    @Override
    public TaskDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<TaskDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }

    @Override
    public void update(TaskDTO task) {
        super.update(task.getId(),task);
    }
}
