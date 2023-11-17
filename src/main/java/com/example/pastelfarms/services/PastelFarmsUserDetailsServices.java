//package com.example.pastelfarms.services;
//
//import com.example.pastelfarms.models.PastelFarmsUserDetails;
//import com.example.pastelfarms.models.User;
//import com.example.pastelfarms.repositories.UserRepository;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//@Service
//public class PastelFarmsUserDetailsServices implements UserDetailsService {
//    public final UserRepository usersDao;
//
//    public PastelFarmsUserDetailsServices(UserRepository usersDao) {
//        this.usersDao = usersDao;
//    }
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = usersDao.findUserByUsername(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User details not found for user: " + username);
//        } else {
//            return new PastelFarmsUserDetails(user.getId(), user.getUsername(), user.getEmail(), user.getPassword());
//        }
//    }
//}
