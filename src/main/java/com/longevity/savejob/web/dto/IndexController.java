package com.longevity.savejob.web.dto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //index.mustache
    @GetMapping("/")
    public String index(){
        return "index";
    }
}
