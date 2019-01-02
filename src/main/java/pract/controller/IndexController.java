package pract.controller;

import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pract.service.ServiceCustom;
import pract.service.ServiceProductos;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private ServiceCustom servicioCliente;

    @Autowired
    private ServiceProductos servicioEquipo;


    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String get(Model model) {
        model.addAttribute("clientes", servicioCliente.findAll().size());
        model.addAttribute("equipos", servicioEquipo.findAll().size());

        List<String> labels = new ArrayList<>();
        List<String> values = new ArrayList<>();

        model.addAttribute("equipo_label", new Gson().toJson(labels));
        model.addAttribute("historiales", new Gson().toJson(values));

        return "index";
    }
}
