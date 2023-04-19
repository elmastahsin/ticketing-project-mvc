package com.metu.bootstrap;

import com.metu.dto.RoleDTO;
import org.springframework.boot.CommandLineRunner;

public class DataGenerator implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        RoleDTO adminRole = new RoleDTO(1L, "Admin");
        RoleDTO managerRle = new RoleDTO(2L, "Manager");
        RoleDTO employeeRole = new RoleDTO(3L, "Employee");



    }
}
