package org.alex.springappic.repository;

import org.alex.springappic.entity.Role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

    @Query("SELECT r FROM Role r WHERE r.roleDisabled = 0")
    List<Role> findAllEnabledRoles();

    @Query("SELECT r FROM Role r WHERE r.roleDisabled = 0")
    Page<Role> findAllEnabledRoles(Pageable pageable);
}
