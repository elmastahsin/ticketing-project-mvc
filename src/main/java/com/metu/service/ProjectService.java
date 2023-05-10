package com.metu.service;

import com.metu.dto.ProjectDTO;
import com.metu.dto.UserDTO;

import java.util.List;

public interface ProjectService extends CrudService<ProjectDTO,String>{
    //complete project
    void complete(ProjectDTO project);
    //count lis
     List<ProjectDTO> getCountedListOfProjectDTO(UserDTO manager);

}
