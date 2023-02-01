package it.develhope.ExMongoDb.controller;

import it.develhope.ExMongoDb.entities.User;
import it.develhope.ExMongoDb.reposirories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getSingleUser(@PathVariable String id) {
        return userRepository.findById(id);
    }

    @GetMapping("/allusers")
    public List<User> getUserList(User user) {
        return userRepository.findAll();
    }

    @DeleteMapping("/{id}")
    public void updateUser(@PathVariable String id) {
        userRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public User updateSingleUser(@PathVariable String id,@RequestBody User user)throws Exception{
        if(userRepository.existsById(id)){
            user.setId(id);
            User user1 = userRepository.save(user);
            return user1;}
            else throw new Exception("Not found because not exist");
        }

    }


