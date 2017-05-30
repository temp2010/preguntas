package com.informatica.preguntas.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PreguntasController {

    @RequestMapping(value = {"/", "/login"}, method = RequestMethod.GET)
    public ModelAndView login() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login");

        return mv;
    }

    @RequestMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");

        return mv;
    }

    @RequestMapping(value = "/cabecera")
    public ModelAndView cabecera() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("cabecera");

        return mv;
    }

    @RequestMapping(value = "/pie")
    public ModelAndView pie() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("pie");

        return mv;
    }

}
