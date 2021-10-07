package com.moprofile.moprofilev1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moprofile.moprofilev1.exception.ResourceNotFoundException;
import com.moprofile.moprofilev1.model.User;
import com.moprofile.moprofilev1.security.CurrentUser;
import com.moprofile.moprofilev1.security.UserPrincipal;
import com.moprofile.moprofilev1.service.UserRepository;

@RestController
public class UserController {
	@Autowired
    private UserRepository userRepository;

    @GetMapping("/user/me")
    @PreAuthorize("hasRole('USER')")
    public User getCurrentUser(@CurrentUser UserPrincipal userPrincipal) {
        return userRepository.findById(userPrincipal.getId())
                .orElseThrow(() -> new ResourceNotFoundException("User", "id", userPrincipal.getId()));
    }
}
