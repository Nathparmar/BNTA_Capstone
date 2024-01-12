package com.capstone.backend_server.controllers;

import com.capstone.backend_server.models.Route;
import com.capstone.backend_server.services.RouteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/routes")
public class RouteController {

    @Autowired
    RouteService routeService;

    @PostMapping("/start")
    public ResponseEntity<> createRoutes(){
        routeService.optimiseRoutes();
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
}
