package com.example.pastelfarms.controllers;

import com.example.pastelfarms.repositories.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.catalina.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.util.List;

public class loginRegisterControllers {

    private final UserRepository usersDao;
    private final PasswordEncoder passwordEncoder;


    public loginREgisterControllers(UserRepository usersDao,PasswordEncoder passwordEncoder, BattleRepository battlesDao, DustBunniesUserDetailsService dustBunniesUserDetailsService) {
        this.monsterImagesDao = monsterImagesDao;
        this.passwordEncoder = passwordEncoder;
        this.usersDao = usersDao;
        this.battlesDao = battlesDao;

    @GetMapping("/login")
    public String showLoginForm(@RequestParam(value = "error", required = false) String error, Model model) {
        if (error != null) {
            model.addAttribute("loginError", true);
        }
        return "login";
    }

    @PostMapping("/login")
    public String login() {
        return "redirect:/profile";
    }

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        return "registration";
    }

    @PostMapping("/register")
    public String registerUser(@RequestParam(name = "username") String username,
                               @RequestParam(name = "email") String email,
                               @RequestParam(name = "password") String password,
                               @RequestParam(name = "passwordConfirmation") String passwordConfirm,
                               RedirectAttributes redirectAttributes,
                               HttpServletRequest request) {

        String defaultAvatar = "https://cdn.filestackcontent.com/6Vs83AuzQoW2tCNsAB17";
        User existingUser = usersDao.findUserByUsername(username);
        User existingEmail = usersDao.findUserByEmail(email);

        if (existingUser != null || existingEmail != null) {
            redirectAttributes.addAttribute("userExists", true);
            return "redirect:/register?error";
        }

        if (password.equals(passwordConfirm)) {
            password = PasswordEncoder.encode(password);
            usersDao.save(new User(username, email, password, defaultAvatar, 0));
            return "redirect:/login";
        } else {
            redirectAttributes.addAttribute("passwordMismatch", true);
            return "redirect:/register?error";
        }
    }
}
