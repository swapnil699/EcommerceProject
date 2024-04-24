package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.dtos.CreateUserDto;
import com.ecommerce.productservice.dtos.GetInstructorDto;
import com.ecommerce.productservice.models.Instructor;
import com.ecommerce.productservice.models.User;
import com.ecommerce.productservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("")
    public User createUser(@RequestBody CreateUserDto createUserDto) {
        return userService.
                createUser(createUserDto.getName(), createUserDto.getEmail());
    }

    @PostMapping("/instructor")
    public User createInstructor(@RequestBody CreateUserDto createUserDto) {
        return userService.
                createInstructor(createUserDto.getName(), createUserDto.getEmail());
    }

// this should not be work of list
//    @GetMapping("/{name}")
//    public User getUserByName(@PathVariable(name = "name") String name) {
//        return userService.getUserByName(name);
//    }

    @GetMapping("/{name}")
    public List<User> getUserByName(@PathVariable(name = "name") String name) {
        return userService.getUserByName(name);
    }

    @GetMapping("/instructor/{name}")
    public List<GetInstructorDto> getInstructorByName(@PathVariable(name = "name") String name) {
        return userService.getInstructorByName(name);
    }
}
