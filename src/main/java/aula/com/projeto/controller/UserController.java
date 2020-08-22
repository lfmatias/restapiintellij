package aula.com.projeto.controller;


import aula.com.projeto.entity.User;
import aula.com.projeto.entity.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.awt.SunHints;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<User> findAll() {

        List<User> users = userRepository.findAll();
        return users;
    }


    @RequestMapping(value = "", method = RequestMethod.POST)
    public User save(@RequestBody User user){

        return userRepository.save(user);

    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public User update(@RequestBody User user){

        return userRepository.save(user);

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable Long id) {
        userRepository.deleteById(id);
    }

}
