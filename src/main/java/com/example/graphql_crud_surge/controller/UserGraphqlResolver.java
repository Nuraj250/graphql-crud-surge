package com.example.graphql_crud_surge.controller;

import com.example.graphql_crud_surge.dto.UserInput;
import com.example.graphql_crud_surge.model.User;
import com.example.graphql_crud_surge.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserGraphqlResolver {

    @Autowired
    private UserService userService;

    // Queries
    @QueryMapping
    public User getUser(@Argument Long id) {
        return userService.getUser(id);
    }

    @QueryMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Mutations
    @MutationMapping
    public User createUser(@Argument UserInput input) {
        return userService.createUser(input);
    }

    @MutationMapping
    public User updateUser(@Argument Long id, @Argument UserInput input) {
        return userService.updateUser(id, input);
    }

    @MutationMapping
    public boolean deleteUser(@Argument Long id) {
        return userService.deleteUser(id);
    }
}
