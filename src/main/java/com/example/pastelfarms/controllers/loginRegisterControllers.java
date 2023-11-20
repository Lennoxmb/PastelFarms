//package com.example.pastelfarms.controllers;
//
//import com.example.pastelfarms.repositories.UserRepository;
//import com.example.pastelfarms.services.PastelFarmsUserDetailsServices;
//import jakarta.servlet.http.HttpServletRequest;
//import org.apache.catalina.User;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//import org.springframework.stereotype.Controller;
//
//
//
//@Controller
//public class xloginRegisterControllers {
//
//    private final UserRepository usersDao;
//    private final PasswordEncoder passwordEncoder;
//
//
//    public loginRegisterControllers(UserRepository usersDao, PasswordEncoder passwordEncoder, PastelFarmsUserDetailsServices PastelFarmsUserDetailsService) {
//        this.passwordEncoder = passwordEncoder;
//        this.usersDao = usersDao;
//    }
//        @GetMapping("/login")
//        public String showLoginForm (@RequestParam(value = "error", required = false) String error, Model model){
//            if (error != null) {
//                model.addAttribute("loginError", true);
//            }
//            return "login";
//        }
//
//        @PostMapping("/login")
//        public String login () {
//            return "redirect:/profile";
//        }
//
//        @GetMapping("/register")
//        public String showRegistrationForm (Model model){
//            return "registration";
//        }
//
////    @PostMapping("/register")
////    public String registerUser(@RequestParam(name = "username") String username,
////                               @RequestParam(name = "email") String email,
////                               @RequestParam(name = "password") String password,
////                               @RequestParam(name = "passwordConfirmation") String passwordConfirm,
////                               RedirectAttributes redirectAttributes,
////                               HttpServletRequest request) {
////
////        com.example.pastelfarms.models.User existingUser = usersDao.findUserByUsername(username);
////        com.example.pastelfarms.models.User existingEmail = usersDao.findUserByEmail(email);
//
////        if (existingUser != null || existingEmail != null) {
////            redirectAttributes.addAttribute("userExists", true);
////            return "redirect:/register?error";
////        }
////
////        if (password.equals(passwordConfirm)) {
////            String encodedPassword = passwordEncoder.encode(password);
////
////            // Create a new User entity
////            User newUser = new User(username, email, encodedPassword) {
////
////                @Override
////                public String getUsername() {
////                    return null;
////                }
////
////                @Override
////                public String getEmail() {
////                    return null;
////                }
////
////                @Override
////                public String getPassword() {
////                    return null;
////                }
////            };
////
////            // Save the new user using the JPA repository
////            usersDao.save(newUser);
////
////            return "redirect:/login";
////        } else {
////            redirectAttributes.addAttribute("passwordMismatch", true);
////            return "redirect:/register?error";
////        }
////    }
//
//
//}
