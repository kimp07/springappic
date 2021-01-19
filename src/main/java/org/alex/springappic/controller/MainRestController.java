package org.alex.springappic.controller;

import org.alex.springappic.restmodels.UserData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainRestController {

    @PostMapping("/login")
    public String loginAction(@RequestBody UserData userData) {
        return userData.toString();
    }
}
