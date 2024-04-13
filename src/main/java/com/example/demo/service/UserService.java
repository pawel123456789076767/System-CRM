package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.model.Zadania;
import com.example.demo.repository.UserRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User registerUser(String username, String password, String nazwisko, String email, String telefon) {
        User newUser = new User(username,nazwisko,email,telefon);
        return userRepository.save(newUser);
    }

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllData() {
        return userRepository.findAll();
    }
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    public void saveUser(User userr) {
        userRepository.save(userr);
    }
    public Optional<User> getUserById(Long userId) {

        return Optional.empty();
    }
    @GetMapping("/users")
    public String showUsers(Model model) {
        List<User> users = userRepository.findAll();
        model.addAttribute("users", users);
        return "users";
    }

    @Transactional
    public void saveUsers(List<User> userList) {
        userRepository.saveAll(userList);
    }
}








