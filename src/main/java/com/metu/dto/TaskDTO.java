package com.metu.dto;

import com.metu.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter

@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {
    private Long id;
    private ProjectDTO project;
    private UserDTO user;
    private String taskSubject;
    private String taskDetail;
    private Status taskStatus;
    private LocalDate assignedDate;

}
