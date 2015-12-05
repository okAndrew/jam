package com.jar.jam.web.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jar.jam.domain.enums.UserRole;
import com.jar.jam.domain.model.User;
import com.jar.jam.service.UserService;

@Service("userDetailsService")
public class CustomUserDetailsServiceImpl implements UserDetailsService {
    private static final Logger logger = Logger.getLogger(CustomUserDetailsServiceImpl.class);
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
	User user = userService.findByEmail(email);
	if (user == null) {
	    throw new UsernameNotFoundException("User not found");
	}
	UserDetails userDetails = convertToUserDetails(user);
	return userDetails;
    }

    public UserDetails convertToUserDetails(User userEntity) {
	String username = userEntity.getEmail();
	String password = userEntity.getPassword();
	boolean enabled = true;
	boolean accountNonExpired = true;
	boolean credentialsNonExpired = true;
	boolean accountNonLocked = true;
	Collection<GrantedAuthority> authorities = getAuthorities(userEntity.getRole());

	UserDetails userDetails = new org.springframework.security.core.userdetails.User(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked,
		authorities);
	return userDetails;
    }

    private Collection<GrantedAuthority> getAuthorities(UserRole role) {
	List<GrantedAuthority> authList = new ArrayList<GrantedAuthority>(2);

	if (role.equals(UserRole.ADMIN)) {
	    authList.add(new SimpleGrantedAuthority(UserRole.ADMIN.toString()));
	} else if (role.equals(UserRole.USER)) {
	    authList.add(new SimpleGrantedAuthority(UserRole.USER.toString()));
	}
	return authList;
    }
}
