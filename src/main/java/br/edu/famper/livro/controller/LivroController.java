package br.edu.famper.livro.controller;

import br.edu.famper.livro.model.Livro;
import br.edu.famper.livro.service.LivroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/livro")
public class LivroController {


    @Autowired
    private LivroService LivroService;

    @GetMapping
    public ResponseEntity<List<Livro>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(LivroService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Livro>> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK)
                .body(LivroService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Livro> create(@RequestBody Livro livro){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(LivroService.salvar(livro));
    }

    @PutMapping
    public ResponseEntity<Livro> update(@RequestBody Livro livro){
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(LivroService.update(livro));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id){
        LivroService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }


}