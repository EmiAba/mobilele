package org.softuni.mobilele.web;

import org.softuni.mobilele.model.dto.UserRegistrationDTO;
import org.softuni.mobilele.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/users")
public class UserRegistrationController {

  private final UserService userService;

    public UserRegistrationController(UserService userService, UserService userService1) {

        this.userService = userService1;
    }


    @GetMapping("/register")
    public String register() {
        return "auth-register";
    }

    @PostMapping("/register")
    public String register(UserRegistrationDTO userRegistrationDTO) {
        userService.registerUser(userRegistrationDTO);

        return "redirect:/";

    }


}
