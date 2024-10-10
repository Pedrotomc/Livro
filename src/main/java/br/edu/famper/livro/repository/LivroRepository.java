package br.edu.famper.livro.repository;

import br.edu.famper.livro.model.Livro;
import br.edu.famper.livro.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
