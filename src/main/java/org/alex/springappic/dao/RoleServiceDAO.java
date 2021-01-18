package org.alex.springappic.dao;

import org.alex.springappic.entity.Role;
import org.alex.springappic.repository.RoleRepository;
import org.alex.springappic.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class RoleServiceDAO implements RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Role findById(Integer id) {
        return roleRepository.findById(id).orElse(null);
    }

    @Override
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Page<Role> findAll(Pageable pageable) {
        return roleRepository.findAll(pageable);
    }

    @Override
    public List<Role> findAllEnabledRoles() {
        return roleRepository.findAllEnabledRoles();
    }

    @Override
    public Page<Role> findAllEnabledRoles(Pageable pageable) {
        return roleRepository.findAllEnabledRoles(pageable);
    }

    @Override
    @Transactional
    public Role saveRole(Role role) {
        if (role != null) {
            return roleRepository.save(role);
        }
        return null;
    }

    @Override
    @Transactional
    public void deleteRoleById(Integer id) {
        roleRepository.deleteById(id);
    }
}
