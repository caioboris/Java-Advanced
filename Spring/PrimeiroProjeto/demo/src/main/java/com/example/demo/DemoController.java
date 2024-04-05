package com.example.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public String index(){
        return "<h1>Hello World</h1>";
    }

    @RequestMapping("/cadastro/{nome}")
    public String dizerNome(@PathVariable String nome){
        return "Olá, meu nome é " + nome;
    }

    @RequestMapping("/info")
    public String apresentar(@RequestParam("nome") String nome, @RequestParam("idade")String idade){
        return "<h1>Olá pessoal, meu nome é "+ nome + " e minha idade é " + idade + "</h1>";
    }

    @PostMapping("/postar")
    public String postar(){

    }

}
