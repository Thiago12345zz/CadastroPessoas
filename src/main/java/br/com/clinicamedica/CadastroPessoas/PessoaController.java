package br.com.clinicamedica.CadastroPessoas;


//Falar para o spring que isto é uma anotation, para isto utilizamos @

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
public class PessoaController {

    @GetMapping("/boasVindas")
    public String bosaVindas(){
        return "Essa é minha primeira mensagem nesta rota";
    }

}
