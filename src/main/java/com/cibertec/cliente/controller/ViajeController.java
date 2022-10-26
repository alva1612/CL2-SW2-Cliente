package com.cibertec.cliente.controller;

import com.cibertec.cliente.entity.Viaje;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/viajes")
public class ViajeController {
    private final String URL = "http://localhost:8090";

    @RequestMapping("")
    public String index(Model model) {
        RestTemplate rt = new RestTemplate();

        ResponseEntity<Viaje[]> data= rt.getForEntity(URL+"/viajes/listar", Viaje[].class);

        //crear atributos
        model.addAttribute("viajes", data.getBody());

        return "Viajes";
    }
}
