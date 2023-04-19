package com.metu.service.impl;

import com.metu.dto.RoleDTO;
import com.metu.service.RoleService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // like @Component creates beans
public class RoleServiceImpl extends AbstractMapService<RoleDTO, Long> implements RoleService {
    @Override
    public RoleDTO save(RoleDTO role) {
        return super.save(role.getId(), role);
    }

    @Override
    public RoleDTO findById(Long id) {
        return super.findById(id);
    }

    @Override
    public List<RoleDTO> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
