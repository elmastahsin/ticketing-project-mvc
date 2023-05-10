package com.metu.dto;

import com.metu.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data

@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    @NotBlank
    @Size(min = 2, max = 15, message = "Please enter at least 2 characters")
    private String firstName;

    @NotBlank
    @Size(min = 2, max = 15, message = "Please enter at least 2 characters")
    private String lastName;
    @NotBlank
    @Email(message = "Please enter a valid email address")
    private String userName;

    @NotBlank
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$", message = "Please enter a valid password")
    private String passWord;

    private boolean enabled;
    @NotBlank
    @Pattern(regexp = "^(\\+90|0)[0-9]{10}$", message = "Please enter a valid phone number")
    private String phone;
    @NotNull
    private RoleDTO role;
    @NotNull
    private Gender gender;


}
