package com.metu.dto;

import com.metu.enums.Status;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Getter

@NoArgsConstructor
@AllArgsConstructor
public class TaskDTO {
    private Long id;

    @NotNull
    private ProjectDTO project;

    @NotNull
    private UserDTO assignedEmployee;

    @NotBlank
    private String taskSubject;

    @NotBlank
    private String taskDetail;



    private Status taskStatus;
    private LocalDate assignedDate;

}
