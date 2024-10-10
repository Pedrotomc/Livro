package br.edu.famper.livro.service;


import br.edu.famper.livro.model.Livro;
import br.edu.famper.livro.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public Livro update(Livro livro) {
        Livro salvo = livroRepository.findById(livro.getId()).orElseThrow(() ->
                new RuntimeException("Livro não encontrado")
        );
        salvo.setId(livro.getId());
        salvo.setAutor(livro.getAutor());
        salvo.setTitulo(livro.getTitulo());
        salvo.setPreco(livro.getPreco());
        return livroRepository.save(livro);
    }

    public Livro salvar(Livro livro) {
        return livroRepository.save(livro);
    }

    public List<Livro> buscarTodos() {
        return livroRepository.findAll();
    }

    public Optional<Livro> findById(Long id) {
        return livroRepository.findById(id);
    }

    public void deleteById(Long id) {
        livroRepository.deleteById(id);
    }
}
