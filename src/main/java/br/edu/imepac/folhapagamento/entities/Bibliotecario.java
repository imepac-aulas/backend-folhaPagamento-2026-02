package br.edu.imepac.folhapagamento.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@Table(name = "bibliotecarios")

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Bibliotecario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @NotBlank(message = "Nome não pode ser nulo")
    private String nome;
    private String email;

    @Column(name = "valor_base")
    private float valorBase;

    public double CalcularSalario() {
        return this.valorBase;
    }
}