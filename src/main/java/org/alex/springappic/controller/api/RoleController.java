package org.alex.springappic.controller.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class RoleController {

    public String addNewRole() {
        return "Success";
    }

}
