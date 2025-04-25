package edu.ICET.controller;

import edu.ICET.dto.User;
import edu.ICET.entity.UserEntity;
import edu.ICET.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/user")

public class UserController {
    private final UserService service;

    @PostMapping("/add-user")
    public void addUser(@RequestBody User user){
        service.addUser(user);
    }

    @GetMapping("searchById/{id}")
    public User searchUser(@PathVariable Integer id){
        return service.searchUser(id);
    }

    @PostMapping("update")
    public void updateUser(@RequestBody User user){
        service.updateUser(user);
    }

    @DeleteMapping
    public void deleteUser(@PathVariable Integer id){
        service.deleteUser(id);
    }

    public List<User> getUsers(){
       return service.getAll();
    }
}
