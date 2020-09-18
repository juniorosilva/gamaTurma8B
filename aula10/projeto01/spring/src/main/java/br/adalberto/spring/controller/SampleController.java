package br.adalberto.spring.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//anotações para classe seguinte 
@RestController
@RequestMapping("/exemplo") //caminho na url para acessar essa classe
public class SampleController {
    
    @GetMapping("/hello") //anotação para o metodo seguinte
    public ResponseEntity<String> getHello(){ //classe para receber chamada
        return ResponseEntity.ok("Meu primeiro app Spring!");

    @GetMapping("/version") //anotação para o metodo seguinte
    public ResponseEntity<String> getVersion(){ //classe para receber chamada
        return ResponseEntity.ok("Versao");

    }
}
