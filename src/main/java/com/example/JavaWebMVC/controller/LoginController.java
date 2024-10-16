package com.example.JavaWebMVC.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login"; // Trả về template login.html
    }

    @PostMapping("/login")
    public String loginUser(String username, String password, HttpSession session) {
      //  User user = userService.findUserByUsername(username);
        // Kiểm tra tài khoản và mật khẩu
        if ("vanlinh".equals(username)) {
            session.setAttribute("username", username); // Lưu thông tin vào session
            return "redirect:/home"; // Chuyển hướng đến trang chính sau khi đăng nhập thành công
        } else {
           model.addAttribute("error", "Invalid username or password"); // Thêm thông báo lỗi
            return "login"; // Quay lại trang login nếu đăng nhập không thành công
        }
    }

}
