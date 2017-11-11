package com.shri.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller()
@RequestMapping("/api")
public class SessionUpdateController {

    @RequestMapping("/hello")
    public String greet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Integer sessionTemp = (Integer) request.getSession().getAttribute("temp");
        if (sessionTemp != null) {
            request.getSession().setAttribute("temp", sessionTemp.intValue() +1 );
        } else {
            request.getSession().setAttribute("temp", new Integer(0));
        }
        return "/hello";
    }
}