package com.metu.converter;

import com.metu.dto.ProjectDTO;
import com.metu.dto.UserDTO;
import com.metu.service.ProjectService;
import com.metu.service.UserService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class ProjectDTOConverter implements Converter<String, ProjectDTO> {


    ProjectService projectService;

    public ProjectDTOConverter(ProjectService projectService) {
        this.projectService = projectService;
    }

    @Override
    public ProjectDTO convert(String source) {
        return projectService.findById(source);
    }
}