package com.tapia.mspizza.controller;

import com.tapia.mspizza.dto.request.PizzaDtoRequest;
import com.tapia.mspizza.dto.response.PizzaDtoResponse;
import com.tapia.mspizza.service.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/pizza")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping("/guardar")
    public @ResponseBody void guardarPizza(@RequestBody PizzaDtoRequest pizza) {

        pizzaService.guardarPizza(pizza);
    }

    @PostMapping("/listar")
    public @ResponseBody List<PizzaDtoResponse> listarPizzas() {

        return pizzaService.listarPizzas();
    }


}
