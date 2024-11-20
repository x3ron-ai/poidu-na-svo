package com.stariybog2.pupupu.controllers;

import com.stariybog2.pupupu.Models.Chikibamboni;
import com.stariybog2.pupupu.Service.ChikibamboniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;

@Controller
public class ChikibamboniController {
    @Autowired
    ChikibamboniService chikibamboniService                                                 ;

    @GetMapping("/chikibambonis")
    public String getChikibambonisList(Model model)                                         {
        ArrayList<Chikibamboni> chikibambonis = chikibamboniService.getAll()                ;
        model.addAttribute("chikibambonis", chikibambonis)                      ;
        return "chikibambonis"                                                              ;}

    @PutMapping("/chikibamboni")
    public String updateChikibamboni(Model model,
                                       @RequestParam("id") int id,
                                       @RequestParam("color") String color,
                                       @RequestParam("name") String name)                 {
        Chikibamboni chikibamboni = new Chikibamboni(id, color, name)                   ;
        chikibamboniService.editChikibamboni(chikibamboni)                                ;
        return "redirect:/chikibambonis"                                                  ;}

    @DeleteMapping("/chikibamboni")
    public String deleteChikibamboni(Model model,
                                       @RequestParam("id") int id)                          {
        chikibamboniService.deleteChikibamboni(id)                                          ;
        return "redirect:/chikibambonis"                                                  ;}

    @PostMapping("/chikibamboni")
    public String addChikibamboni(Model model,
                                    @RequestParam("color") String color,
                                    @RequestParam("name") String name)                  {
        chikibamboniService.addChikibamboni(new Chikibamboni(name, color))                ;
        return "redirect:/chikibambonis"                                                  ;
    }

}
