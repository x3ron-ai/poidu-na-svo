package com.stariybog2.pupupu.controllers;

import com.stariybog2.pupupu.Models.Skiridjinjonji;
import com.stariybog2.pupupu.Service.SkiridjinjonjiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class MainController {
    @Autowired
    SkiridjinjonjiService skiridjinjonjiService                                             ;

    @GetMapping("/skiridjinjonjis")
    public String getSkiridjinjonjisList(Model model)                                       {
        ArrayList<Skiridjinjonji> skiridjinjonjis = skiridjinjonjiService.getAll()          ;
        model.addAttribute("skiridjinjonjis", skiridjinjonjis)                   ;
        return "skiridjinjonjis"                                                            ;}

    @PutMapping("/skiridjinjonji")
    public String updateSkiridjinjonji(Model model,
                                       @RequestParam("id") int id,
                                       @RequestParam("title") String title,
                                       @RequestParam("vitali") String vitali)               {
        Skiridjinjonji skiridjinjonji = new Skiridjinjonji(id, title, vitali)               ;
        System.out.println("PUT REQ")                                                       ;
        skiridjinjonjiService.editSkiridjinjonji(skiridjinjonji)                            ;
        return "redirect:/skiridjinjonjis"                                                  ;}

    @DeleteMapping("/skiridjinjonji")
    public String deleteSkiridjinjonji(Model model,
                                       @RequestParam("id") int id)                          {
        skiridjinjonjiService.deleteSkiridjinjonji(id)                                      ;
        return "redirect:/skiridjinjonjis"                                                  ;}

    @PostMapping("/skiridjinjonji")
    public String addSkiridjinjonji(Model model,
                                    @RequestParam("title") String title,
                                    @RequestParam("vitali") String vitali)                  {
        skiridjinjonjiService.addSkiridjinjonji(new Skiridjinjonji(title, vitali))          ;
        return "redirect:/skiridjinjonjis"                                                   ;
                                                                                            }

                                                                                            }
