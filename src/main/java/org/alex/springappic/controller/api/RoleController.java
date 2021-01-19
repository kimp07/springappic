package org.alex.springappic.controller.api;

import org.alex.springappic.entity.Role;
import org.alex.springappic.restmodels.RoleData;
import org.alex.springappic.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role/")
public class RoleController {
    
    @Autowired
    private RoleService roleDAO;
    
    @PostMapping("addNew")
    public ResponseEntity<Object> addNewRole(@RequestBody RoleData role) {
        if (role.getRoleName().isEmpty()) {
            return new ResponseEntity<>("Role name is empty", HttpStatus.CONFLICT);
        }
        Role roleEntity = new Role();
        roleEntity.setRoleName(role.getRoleName());
        roleEntity.setRoleDisabled(role.isRoleDisabled());
        if (roleDAO.saveRole(roleEntity) == null) {
            return new ResponseEntity<>("Can`t save role", HttpStatus.CONFLICT);
        };
        return new ResponseEntity<>("New role successfully added", HttpStatus.OK);
    }

}
