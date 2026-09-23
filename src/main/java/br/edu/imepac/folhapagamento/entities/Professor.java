package br.edu.imepac.folhapagamento.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "professores")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "O nome não pode ser nulo")
    private String nome;

    private String email;

    @Column(name = "quantidade_aulas_mes")
    private int quantidadeAulasMes;

    @Column(name = "valor_hora")
    private float valorHora;

    public double calcularSalario() {
        return quantidadeAulasMes * valorHora;
    }
}