package br.edu.imepac.folhapagamento.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
<<<<<<< HEAD
import jakarta.validation.constraints.NotNull;
import lombok.*;


=======
import lombok.*;

>>>>>>> origin/feature/ehf
@Entity
@Table(name = "professores")

@Data
@AllArgsConstructor
@NoArgsConstructor
<<<<<<< HEAD

=======
>>>>>>> origin/feature/ehf
public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
<<<<<<< HEAD

    private long id;

    @NotBlank(message = "Nome não pode ser nulo")
    private String nome;
    private String email;

    @Column(name = "quantidade_aulas_mes")
    private int quantidadeaulasMes;
=======
    private Long id;

    @NotBlank(message = "Nome não pode ser nulo")
    private String nome;

    private String email;

    @Column(name = "quantidade_aulas_mes")
    private int quantidadeAulasMes;
>>>>>>> origin/feature/ehf

    @Column(name = "valor_hora")
    private float valorHora;

<<<<<<< HEAD
    public double CalcularSalario() {
        return this.quantidadeaulasMes * this.valorHora;
=======
    public double calcularSalario() {
        return quantidadeAulasMes * valorHora;
>>>>>>> origin/feature/ehf
    }
}
