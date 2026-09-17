package br.edu.imepac.folhapagamento.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "professores")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "nome não pode ser nulo")
    private String nome;


    private String email;

    @Column(name = "quantidade_aulas_mes")
    private int quantidadeAulaMes;

    @Column(name = "valor_hora")
    private float valorHora;

    public double calcularSalario(){
        return quantidadeAulaMes * valorHora;
    }
}
