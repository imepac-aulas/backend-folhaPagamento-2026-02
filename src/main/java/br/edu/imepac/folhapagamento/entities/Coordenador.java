package br.edu.imepac.folhapagamento.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@Table(name = "coordenadores")

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Coordenador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @NotBlank(message = "Nome não pode ser nulo")
    private String nome;
    private String email;

    @Column(name = "valor_base")
    private float valorBase;

    @Column(name = "percentual")
    private float percentual;

    @Column(name = "quantidade_alunos")
    private int quantidadeAlunos;

    public double CalcularSalario() {
        return this.valorBase + (this.valorBase * (this.percentual / 100) * this.quantidadeAlunos);
    }
}