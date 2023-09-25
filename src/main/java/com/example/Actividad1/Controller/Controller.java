package com.example.Actividad1.Controller;

import com.example.Actividad1.Logica.Persona;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {
    @GetMapping("/variable/{x}")
    String inicio(Model model, @PathVariable Integer x){
        Integer entero = x;
        String frase = "El número entero es: "+ entero;
        model.addAttribute("frase",frase);
        return "index";
    }

    @GetMapping("/bloques/{x}")
    String valor(Model model, @PathVariable Integer x){
        Integer entero = x;
        Integer aux = -1;
        model.addAttribute("entero",entero);
        model.addAttribute("aux",aux);
        return "bloques";
    }
    @RequestMapping("/formulario")
    String formulario(){
        return "formulario";
    }
    @PostMapping("/datos")
    String datos(Model model, Integer valor1, String valor2){
        model.addAttribute("valor1",valor1);
        model.addAttribute("valor2",valor2);
        return "datos";
    }
    @GetMapping("/perfil")
    String perfil(Model model){
        Persona persona = new Persona("Manuel",32);
        persona.intereses.add("Pley");
        persona.intereses.add("Criptomonedas");
        persona.intereses.add("Messi");

        model.addAttribute("persona",persona);
        return "perfil";
    }
}

//gfh