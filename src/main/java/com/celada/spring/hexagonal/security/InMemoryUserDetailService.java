package com.celada.spring.hexagonal.security;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryUserDetailService implements UserDetailsService {

    private final List<UserDetails> users;

    public InMemoryUserDetailService(PasswordEncoder passwordEncoder) {
        users = List.of(
                User.withUsername("admin")
                        .password(passwordEncoder.encode("1234"))
                        .authorities("ADMIN")
                        .build(),
                User.withUsername("user")
                        .password(passwordEncoder.encode("1234"))
                        .authorities("USER")
                        .build()
        );
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return users.stream()
                .filter(user -> user.getUsername().equals(username))
                .findFirst()
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
    }
}
