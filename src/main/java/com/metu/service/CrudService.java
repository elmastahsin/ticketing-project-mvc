package com.metu.service;

import com.metu.dto.UserDTO;

import java.util.List;

public interface CrudService<T,ID>{
    T save(T user);

    T findById(ID username);

    List<T> findAll();

    void deleteById(ID username);
}
