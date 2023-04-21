package com.metu.converter;

import com.metu.dto.UserDTO;
import com.metu.service.UserService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserDtoConverter  implements Converter<String, UserDTO> {

    UserService userService;

    public UserDtoConverter(UserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDTO convert(String source) {
        return userService.findById(source);
    }
}