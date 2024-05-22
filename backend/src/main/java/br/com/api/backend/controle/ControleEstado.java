package br.com.api.backend.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.backend.modelo.Estado;
import br.com.api.backend.servico.EstadoService;


@RestController
@RequestMapping("/estado")
@CrossOrigin(origins = "*")
public class ControleEstado {


    @Autowired
    private EstadoService estadoService;
    
    
    @GetMapping("/")
    public List<Estado> buscaTodos(){

        return estadoService.buscaTodos();

    }
    
    @PostMapping("/")
    public Estado inserir(@RequestBody Estado estado){

        return estadoService.inserir(estado);      
        
    }


    @PutMapping("/")
    public Estado alterar(@RequestBody Estado estado){

        return estadoService.alterar(estado);
        
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){

        estadoService.excluir(id);
        return ResponseEntity.ok().build();
        
    }

}
