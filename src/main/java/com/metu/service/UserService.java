package com.metu.service;

import com.metu.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService extends CrudService<UserDTO,String>{


    List<UserDTO> findManagers();
    List<UserDTO> findEmployees();
}
