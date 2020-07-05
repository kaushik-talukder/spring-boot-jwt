package com.ezycoding.jwt.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Value("${application.username}")
	private String username;
	@Value("${application.password}")
	private String password;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		if (this.username.equals(username)) {
			return new User(username, passwordEncoder.encode(this.password), new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}
}