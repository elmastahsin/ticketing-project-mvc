package com.metu.service;

import com.metu.dto.UserDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService extends CrudService<UserDTO,String>{

}
