package com.metu.service;

import com.metu.dto.TaskDTO;
import com.metu.dto.UserDTO;
import com.metu.enums.Status;

import java.util.List;

public interface TaskService extends CrudService<TaskDTO,Long> {


    List<TaskDTO> findTasksByManager(UserDTO manager);
    List<TaskDTO> findAllTasksByStatusIsNot(Status status);
    List<TaskDTO> findAllTasksByStatus(Status status);
    void updateStatus(TaskDTO task);

}
