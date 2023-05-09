package it.polito.wa2.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView
import java.time.LocalDateTime


@Controller
class MainController {

    @GetMapping("/")
    fun homePage() : ModelAndView {
        var mv =  ModelAndView()
        mv.viewName = "home.html"
        mv.modelMap.put("date", LocalDateTime.now())
        mv.modelMap.put("message", "Hello, MVC!")
        mv.modelMap.put("list", listOf("Alpha", "Beta", "Gamma"))
        return mv
    }
}