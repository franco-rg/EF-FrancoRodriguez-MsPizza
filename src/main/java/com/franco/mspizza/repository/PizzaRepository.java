package com.tapia.mspizza.repository;

import com.tapia.mspizza.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}

