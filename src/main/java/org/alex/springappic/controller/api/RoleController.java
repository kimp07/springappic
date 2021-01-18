package org.alex.springappic.controller.api;

import org.alex.springappic.entity.Role;
import org.alex.springappic.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class RoleController {

    @Autowired
    private RoleService roleDAO;

    public String addNewRole(@RequestParam Role role) {
        return "Success";
    }

}
