package com.metu.service;

import com.metu.dto.ProjectDTO;

public interface ProjectService extends CrudService<ProjectDTO,String>{
    //complete project
    void complete(ProjectDTO project);

}
