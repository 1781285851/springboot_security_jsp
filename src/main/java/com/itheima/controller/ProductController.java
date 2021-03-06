package com.itheima.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @RequestMapping("/findAll")
    @Secured({"ROLE_PRODUCT","ROLE_ADMIN"})
    public String findAll(){
        return "product-list";
    }
}
