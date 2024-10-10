package br.edu.famper.livro.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_Livro")
@Data
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    @Column(nullable = false, name = "livro_id")
    private Long id;

    @Column(nullable = false, name = "titulo", length = 75)
    private String titulo;

        @Column(nullable = false, name = "autor", length = 150)
    private String autor;


    @Column(nullable = false, name = "ano_publicado", length = 150)
    private Number anoPublicado;

    @Column(nullable = false, name = "preco", length = 150)
    private Float preco;
}
