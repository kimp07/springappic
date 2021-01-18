package org.alex.springappic.service;

import org.alex.springappic.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface RoleService {

    Role findById(Integer id);

    List<Role> findAll();

    Page<Role> findAll(Pageable pageable);

    List<Role> findAllEnabledRoles();

    Page<Role> findAllEnabledRoles(Pageable pageable);

    Role saveRole(Role role);

    void deleteRoleById(Integer id);

}
