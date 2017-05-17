package com.informatica.preguntas;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PreguntasController {

    @RequestMapping(value = "/")
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
