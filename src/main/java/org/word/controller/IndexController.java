package org.word.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;


@Controller
public class IndexController {
    @ApiIgnore
    @RequestMapping(value = "/")
    public String index(HttpServletRequest request) {
        return "redirect:swagger-ui.html";
    }
}
