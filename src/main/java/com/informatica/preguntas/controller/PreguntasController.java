package com.informatica.preguntas.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.informatica.preguntas.model.*;
import com.informatica.preguntas.service.*;

@Controller
public class PreguntasController {

    private static final Logger logger = Logger
            .getLogger(PreguntasController.class);

    public PreguntasController() {
        System.out.println("PreguntasController()");
    }

    @Autowired
    private RespuestaService respuestaService;

    @Autowired
    private PreguntaService preguntaService;
    
    @Autowired
    private AsociaService asociaService;

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

    @RequestMapping(value = "/admin")
    public ModelAndView admin() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("admin");

        return mv;
    }

    @RequestMapping(value = "/respuesta")
    public ModelAndView listRespuesta(ModelAndView model) throws IOException {
        List<Respuesta> listRespuesta = respuestaService.getAllRespuestas();
        model.addObject("listRespuesta", listRespuesta);
        model.setViewName("respuesta");
        return model;
    }

    @RequestMapping(value = "/nuevaRespuesta", method = RequestMethod.GET)
    public ModelAndView nuevaRespuesta(ModelAndView model
    ) {
        Respuesta respuesta = new Respuesta();
        model.addObject("respuesta", respuesta);
        model.setViewName("RespuestaForm");
        return model;
    }

    @RequestMapping(value = "/guardarRespuesta", method = RequestMethod.POST)
    public ModelAndView guardarRespuesta(@ModelAttribute Respuesta respuesta
    ) {
        if (respuesta.getId_respuesta() == 0) {
            respuestaService.addRespuesta(respuesta);
        } else {
            respuestaService.updateRespuesta(respuesta);
        }
        return new ModelAndView("respuesta");
    }

    @RequestMapping(value = "/editarRespuesta", method = RequestMethod.GET)
    public ModelAndView editarRespuesta(HttpServletRequest request
    ) {
        Integer respuestaId = Integer.parseInt(request.getParameter("id"));
        Respuesta respuesta = respuestaService.getRespuesta(respuestaId);
        ModelAndView model = new ModelAndView("RespuestaForm");
        model.addObject("respuesta", respuesta);

        return model;
    }

    @RequestMapping(value = "/pregunta")
    public ModelAndView listPregunta(ModelAndView model) throws IOException {
        List<Pregunta> listPregunta = preguntaService.getAllPreguntas();
        model.addObject("listPregunta", listPregunta);
        model.setViewName("pregunta");
        return model;
    }

    @RequestMapping(value = "/nuevaPregunta", method = RequestMethod.GET)
    public ModelAndView nuevaPregunta(ModelAndView model
    ) {
        Pregunta pregunta = new Pregunta();
        model.addObject("pregunta", pregunta);
        model.setViewName("PreguntaForm");
        return model;
    }

    @RequestMapping(value = "/guardarPregunta", method = RequestMethod.POST)
    public ModelAndView guardarPregunta(@ModelAttribute Pregunta pregunta
    ) {
        if (pregunta.getId_pregunta() == 0) {
            preguntaService.addPregunta(pregunta);
        } else {
            preguntaService.updatePregunta(pregunta);
        }
        return new ModelAndView("pregunta");
    }

    @RequestMapping(value = "/editarPregunta", method = RequestMethod.GET)
    public ModelAndView editarPregunta(HttpServletRequest request
    ) {
        Integer preguntaId = Integer.parseInt(request.getParameter("id"));
        Pregunta pregunta = preguntaService.getPregunta(preguntaId);
        ModelAndView model = new ModelAndView("PreguntaForm");
        model.addObject("pregunta", pregunta);

        return model;
    }

    @RequestMapping(value = "/asocia")
    public ModelAndView listAsocia(ModelAndView model) throws IOException {
        List<Asocia> listAsocia = asociaService.getAllAsocias();
        model.addObject("listAsocia", listAsocia);
        model.setViewName("asocia");
        return model;
    }

}
