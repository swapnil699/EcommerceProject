package com.ecommerce.productservice.controllers;

import com.ecommerce.productservice.dtos.CreateUserDto;
import com.ecommerce.productservice.dtos.GetInstructorDto;
import com.ecommerce.productservice.models.Instructor;
import com.ecommerce.productservice.models.User;
import com.ecommerce.productservice.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    public Instructor createInstructor(@RequestBody CreateUserDto createUserDto) {
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

//    @GetMapping("/instructor/{name}")
//    public List<GetInstructorDto> getInstructorByName(@PathVariable(name = "name") String name) {
//        return userService.getInstructorByName(name);
//    }

//    @GetMapping("/instructor/{uuid}")
//    public GetInstructorDto getInstructorByUUID(@PathVariable(name = "uuid") UUID uuid) {
//        return userService.getInstructorById(uuid);
//    }

    @GetMapping("/instructor/{name}")
    public List<GetInstructorDto> getInstructorByName(@PathVariable(name = "name") String name) {
        return userService.getInstructorByName(name);
    }

    @GetMapping("/instructor")
    public List<GetInstructorDto> getInstructorByUUID(@RequestBody List<UUID> uuid) {
        return userService.getInstructorByIds(uuid);
    }
}
