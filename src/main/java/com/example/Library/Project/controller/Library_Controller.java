package com.example.Library.Project.controller;

import com.example.Library.Project.model.Library;
import com.example.Library.Project.service.Library_Service;
import org.apache.coyote.http11.filters.SavedRequestInputFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class Library_Controller {

    @Autowired
    private Library_Service service;

    @GetMapping("/")
    public String Home(Model model){
        List<Library> c = service.getbook();
        model.addAttribute("c",c);
        return "index";
    }

    @GetMapping("/addbooks")
    public String addbook(){
        return "books_added";
    }

    @PostMapping("/register")
    public String submit(@ModelAttribute Library m, HttpSession session){
        System.out.println(m);
        service.addbook(m);
        session.setAttribute("message","Book Submitted Successfully");
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String updatebook(@PathVariable int id,Model model){
        Library library=service.getbyid(id);
        model.addAttribute("class",library);
        return "edit";
    }

    @GetMapping("/delete/{id}")
    public String deletebook(@PathVariable int id, HttpSession session){
        service.deletebook(id);
        session.setAttribute("message","Deleted_successfully");
        return "redirect:/";
    }

}
