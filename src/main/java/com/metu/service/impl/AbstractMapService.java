package com.metu.service.impl;

import com.metu.dto.RoleDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractMapService<T, ID> {

    public Map<ID, T> map = new HashMap<>(); //DB

    RoleDTO save(ID id, T object) {
        map.put(id, object);
        return object;
    }

    public abstract RoleDTO save(RoleDTO role);

    public RoleDTO findById(Long id) {
        return null;
    }

    List<T> findAll() {
        return new ArrayList<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    void deleteById(ID id) {
        map.remove(id);
    }

}

