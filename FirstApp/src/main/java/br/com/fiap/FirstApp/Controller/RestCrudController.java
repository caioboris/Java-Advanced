package br.com.fiap.FirstApp.Controller;

import br.com.fiap.FirstApp.Models.Usuario;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class RestCrudController {

    private List<Usuario> usuarios = new ArrayList<>();


}
