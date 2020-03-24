package com.badgehu.friday.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author badgehu
 * @description: TODO
 * @date 2020-03-24 15:54
 */
@RestController
@RequestMapping("/test")
public class SampleController {

    @GetMapping("/demo")
    public String demo(){
        return "hello";
    }
    @GetMapping("/bye")
    public String bye(){
        return "bye";
    }
    @GetMapping("/nice")
    public String nice(){
        return "nice";
    }
}
