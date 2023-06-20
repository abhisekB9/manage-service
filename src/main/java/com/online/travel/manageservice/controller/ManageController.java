package com.online.travel.manageservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel/manage")
public class ManageController {

    @GetMapping("/health")
    public String health(){
        return "Success";
    }
}
