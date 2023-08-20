package com.registered.firstregistration.controller;


//import ch.qos.logback.core.model.Model;
import com.registered.firstregistration.entity.User;
import com.registered.firstregistration.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/")
    public String register(Model model){
        User user=new User();
        model.addAttribute("user",user);
             return "register";
    }

    @PostMapping("/registerUser")
    public String registerUser(@ModelAttribute("user") User user){

//        String result="error";
//        if(user.getCpassword().equals(user.getPassword())){
//            try{
//                service.RegisterUser(user);
//                result= "home";
//            }
//            catch (Exception e){
//                result="error";
//            }
//        }
        System.out.println(user);
        service.registerUser(user);

        return "home";
    }

}
