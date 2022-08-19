package com.tapia.mspizza.service;

import com.tapia.mspizza.dto.request.PizzaDtoRequest;
import com.tapia.mspizza.dto.response.PizzaDtoResponse;

import java.util.List;

public interface PizzaService {

    public void guardarPizza(PizzaDtoRequest pizza);
    public List<PizzaDtoResponse> listarPizzas();
}
