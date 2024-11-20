package com.stariybog2.pupupu.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class MainController {
    @GetMapping("/")
    public String mainUri(Model model) {
        model.addAttribute("name", "SHAVUH1N");
        return "homePage";
    }

    @PostMapping("/calculate")
    public String calculateUri(@RequestParam("op1") double op1,
                          @RequestParam("op2") double op2,
                          @RequestParam("oper") String oper,
                          Model model) {
        double result = switch (oper) {
            case "+" -> op1 + op2;
            case "-" -> op1 - op2;
            case "*" -> op1 * op2;
            case "/" -> op1 / op2;
            default -> 0.0f;
        };
        model.addAttribute("result", result);
        return "result";
    }

    @GetMapping("/calc")
    public String calcUri() {
        return "calculator";
    }

    @GetMapping("/cur")
    public String currencyUri() {
        return "currency";
    }

    @PostMapping("/curcalculate")
    public String calcCurUri(@RequestParam("cur1") String cur1,
                             @RequestParam("cur2") String cur2,
                             @RequestParam("count") double count,
                             Model model) {
        HashMap<String, Double> currency_list = new HashMap<>() {{
            put("dol", 98.0d);
            put("eur", 105.59d);
            put("zlt", 24.48d);
            put("nig", 0.058d);
            put("rub", 1d);
        }};
        double result = currency_list.get(cur1)*count / currency_list.get(cur2);
        model.addAttribute("result", result);
        return "result";
    }
}
