package com.example.mustafa.fullstackdemo.repository;

import com.example.mustafa.fullstackdemo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

// databasede kullanıcı kontrolü?

    public User authenticate(String username, String password) throws Exception {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            throw new Exception("Kullanıcı adı yanlış");
        }
        if (!user.getPassword().equals(password)) {
            throw new Exception("Şifre yanlış");
        }
        return user;
    }
}

