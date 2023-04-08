package com.metu.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
    private Long id;
    private LocalDateTime insertDateTime;
    private Long insertUserID;
    private LocalDateTime lastUpdateDateTime;
    private Long lastUpdateUserID;
}